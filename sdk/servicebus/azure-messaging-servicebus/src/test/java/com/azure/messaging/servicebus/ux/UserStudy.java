package com.azure.messaging.servicebus.ux;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.util.IterableStream;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusReceivedMessageContext;
import com.azure.messaging.servicebus.ServiceBusReceiverClient;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

import com.azure.messaging.servicebus.models.SubQueue;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class UserStudy {
    protected static final Duration TIMEOUT = Duration.ofSeconds(60);
    protected static final AmqpRetryOptions RETRY_OPTIONS = new AmqpRetryOptions().setTryTimeout(TIMEOUT);
    private final Scheduler scheduler = Schedulers.parallel();

    private static String connectionString = System.getenv("AZURE_SERVICEBUS_NAMESPACE_CONNECTION_STRING");
    private static String nonSessionQueueName = System.getenv("AZURE_SERVICEBUS_QUEUE_NAME");
    private static String sessionQueueName = System.getenv("AZURE_SERVICEBUS_SESSION_QUEUE_NAME");
    private static String sessionId = "my-session-id1";

    protected static final byte[] CONTENTS_BYTES = "Some-contents".getBytes(StandardCharsets.UTF_8);

    /**
     * This is for non-session entity. User does following
     * 1. send a message to Queue
     * 2. Receive and deadLetter a message
     * 3. Receive from deadletter queue.
     */
    private void receiveFromSubQueueNonSessionEntity() {
        ServiceBusReceiverClient receiver = getBuilder()
            .receiver()
            .queueName(nonSessionQueueName)
            .buildClient();

        ServiceBusSenderClient sender = getBuilder()
            .sender()
            .queueName(nonSessionQueueName)
            .buildClient();

        final String messageId = "my-id-1";
        final ServiceBusMessage message = new ServiceBusMessage(CONTENTS_BYTES);
        message.setMessageId(messageId);

        // Send the message.
        // #1
        sender.sendMessage(message);
        System.out.println("Message sent. Message Id : " + message.getMessageId());

        final IterableStream<ServiceBusReceivedMessageContext> receivedMessages = receiver.receiveMessages(1);
        // #2
        for (ServiceBusReceivedMessageContext context : receivedMessages) {
            System.out.println("Received and Settling (deadLetter) the Message. Message Id : " + context.getMessage().getMessageId());
            receiver.deadLetter(context.getMessage());
        }

        // #3
        ServiceBusReceiverClient deadLetterReceiver = getBuilder()
            .receiver()
            .queueName(nonSessionQueueName)
            .subQueue(SubQueue.DEAD_LETTER_QUEUE)  // Hypothesis: We are expecting that user might get lost here or not find this option."
            .buildClient();
        final IterableStream<ServiceBusReceivedMessageContext> receivedDeadLetterMessages = deadLetterReceiver.receiveMessages(1);

        for (ServiceBusReceivedMessageContext context : receivedDeadLetterMessages) {
            deadLetterReceiver.complete(context.getMessage());
            System.out.println("Received DeadLetter Message Message. Id : " + context.getMessage().getMessageId());
        }
    }

    /**
     * This is for session entity. User does following
     * 1. send a message to Queue
     * 2. Receive and deadLetter a message
     * 3. Receive from deadletter queue.
     */
    private void receiveFromSubQueueSessionEntity() {
        ServiceBusReceiverClient receiver = getBuilder()
            .sessionReceiver()
            .queueName(sessionQueueName)
            .sessionId(sessionId)
            .buildClient();

        ServiceBusSenderClient sender = getBuilder()
            .sender()
            .queueName(sessionQueueName)
            .buildClient();

        final String messageId = "my-id-1";
        final ServiceBusMessage message = new ServiceBusMessage(CONTENTS_BYTES);
        message.setMessageId(messageId);
        message.setSessionId(sessionId);

        //#1 Send the message.
        sender.sendMessage(message);
        System.out.println("Message sent. Message Id : " + message.getMessageId());

        // #2
        final IterableStream<ServiceBusReceivedMessageContext> receivedMessages = receiver.receiveMessages(1);

        for (ServiceBusReceivedMessageContext context : receivedMessages) {
            System.out.println("Received and Settling (deadLetter) the Message. Message Id, Session Id : " + context.getMessage().getMessageId() + "," + context.getMessage().getSessionId());
            receiver.deadLetter(context.getMessage());
        }

        // #3
        ServiceBusReceiverClient deadLetterReceiver = getBuilder()
            .receiver() //Hypothesis:  We are almost certain that user will be try to use .sessionReceiver() here which is wrong.
            .queueName(sessionQueueName)
            .subQueue(SubQueue.DEAD_LETTER_QUEUE)
            .buildClient();
        final IterableStream<ServiceBusReceivedMessageContext> receivedDeadLetterMessages = deadLetterReceiver.receiveMessages(1);

        for (ServiceBusReceivedMessageContext context : receivedDeadLetterMessages) {
            deadLetterReceiver.complete(context.getMessage());
            System.out.println("Received DeadLetter Message. Message Id , session Id: " + context.getMessage().getMessageId() + "," + context.getMessage().getSessionId());
        }
    }

    /**
     * This is for non-session entity. User does following
     * SETUP : Ensure that the lock expiry time is 30 seconds.
     *
     * 1. send a message to Queue (non session entity)
     * 2. Receive and Renew Message lock for 2 minutes
     * 3. complete message after 30 second (Assuming that 30 second is lock expiry time )
     */
    private void lockRenewal() {
        ServiceBusReceiverClient receiver = getBuilder()
            .receiver()
            .queueName(nonSessionQueueName)
            .buildClient();

        ServiceBusSenderClient sender = getBuilder()
            .sender()
            .queueName(nonSessionQueueName)
            .buildClient();

        final String messageId = "my-id-1";
        final ServiceBusMessage message = new ServiceBusMessage(CONTENTS_BYTES);
        message.setMessageId(messageId);

        // Send the message.
        // #1
        sender.sendMessage(message);
        System.out.println("Message sent. Message Id : " + message.getMessageId());

        final IterableStream<ServiceBusReceivedMessageContext> receivedMessages = receiver.receiveMessages(1);
        // #2, 3
        Duration maxLockRenewalDuration =  Duration.ofMinutes(2);
        // This is call back for user to receive error
        Consumer<Throwable> onError = throwable -> {
            System.out.println("Received Error in lock renewal." + throwable.getMessage());
        };

        for (ServiceBusReceivedMessageContext context : receivedMessages) {
            receiver.renewMessageLock(context.getMessage(), maxLockRenewalDuration, onError);
            // add artificial Delay in processing of the message.
            System.out.println("Waiting for lock to expire and renew.");
            artificialDelay();
            System.out.println("Received and Settling (complete) the Message. Message Id : " + context.getMessage().getMessageId());
            receiver.complete(context.getMessage());
        }
    }

    protected ServiceBusClientBuilder getBuilder() {
        return new ServiceBusClientBuilder()
            .retryOptions(RETRY_OPTIONS)
            .transportType(AmqpTransportType.AMQP)
            .connectionString(connectionString);
    }

    private void artificialDelay() {
        try {
            final int waitTimeSeconds = 35;
            System.out.println("  " + waitTimeSeconds + " Seconds.");
            TimeUnit.SECONDS.sleep(waitTimeSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]  args) {
        UserStudy task = new UserStudy();
        task.receiveFromSubQueueSessionEntity();
        task.receiveFromSubQueueSessionEntity();
        task.lockRenewal();
    }
}
