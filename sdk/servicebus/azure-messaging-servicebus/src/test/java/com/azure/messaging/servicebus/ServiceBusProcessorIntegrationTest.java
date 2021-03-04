package com.azure.messaging.servicebus;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.implementation.MessagingEntityType;
import com.azure.messaging.servicebus.models.CompleteOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ServiceBusProcessorIntegrationTest extends IntegrationTestBase {

    private final ClientLogger logger = new ClientLogger(ServiceBusReceiverAsyncClientIntegrationTest.class);
    private final AtomicInteger messagesPending = new AtomicInteger();
    private final boolean isSessionEnabled = false;

    private ServiceBusReceiverAsyncClient receiver;
    private ServiceBusSenderAsyncClient sender;
    private ServiceBusSessionReceiverAsyncClient sessionReceiver;

    ServiceBusProcessorIntegrationTest() {
        super(new ClientLogger(ServiceBusProcessorIntegrationTest.class));
    }

    @Override
    protected void beforeTest() {
        sessionId = UUID.randomUUID().toString();
    }

    @Override
    protected void afterTest() {
        sharedBuilder = null;
        try {
            dispose(receiver, sender, sessionReceiver);
        } catch (Exception e) {
            logger.warning("Error occurred when draining queue.", e);
        }
    }

    @Test
    public void crossTransactionEntity() throws InterruptedException {
        // Arrange
        final int entityIndex0 = 0;
        final int entityIndex1 = 1;
        final int totalSend = 1;
        final boolean sharedConnection =  true;
        final boolean isSessionEnabled =  false;
        AtomicReference<ServiceBusTransactionContext> atomicTransaction1 =  new AtomicReference<>();

        /*ServiceBusSenderAsyncClient sender0NonTransaction = getSenderBuilder(false, MessagingEntityType.QUEUE, entityIndex0, isSessionEnabled, false)
            .buildAsyncClient();


        for (int i = 1; i <totalSend;++i) {
            ServiceBusMessage message = new ServiceBusMessage("data " + i);
            sender0NonTransaction.sendMessage(message).block(TIMEOUT);
        }
        System.out.println("!!!! Sent messages Total " +  totalSend);
        */

        /*ServiceBusProcessorClient processor0 = getProcessorBuilder(false, MessagingEntityType.QUEUE, entityIndex0, sharedConnection)
            .enableCrossEntityTransactions()
            .disableAutoComplete()
            .processMessage(messageContext -> {
                ServiceBusReceivedMessage message = messageContext.getMessage();
                System.out.printf("!!!! Processing message. Message id: %s, Sequence #: %s. Contents: %s%n", message.getMessageId(),
                    message.getSequenceNumber(), message.getBody());
                messageContext.complete(new CompleteOptions().setTransactionContext(atomicTransaction1.get()));
                System.out.println("!!!! Completed  message. SQ " + messageContext.getMessage().getSequenceNumber());
            })
            .processError(context -> {
                System.out.printf("Error when receiving messages from namespace: '%s'. Entity: '%s'%n",
                    context.getFullyQualifiedNamespace(), context.getEntityPath());

                if (!(context.getException() instanceof ServiceBusException)) {
                    System.out.printf("Non-ServiceBusException occurred: %s%n", context.getException());
                    return;
                }
            })
            .buildProcessorClient();
        */

        ServiceBusSenderAsyncClient sender1 = getSenderBuilder(false, MessagingEntityType.QUEUE, entityIndex1, isSessionEnabled, sharedConnection)
            .enableCrossEntityTransactions()
            .buildAsyncClient();

        ServiceBusReceiverAsyncClient receiver0 = getReceiverBuilder(false, MessagingEntityType.QUEUE, entityIndex0, sharedConnection)
        .disableAutoComplete()
        .enableCrossEntityTransactions()
        .buildAsyncClient();

        ServiceBusTransactionContext transaction1 = sender1.createTransaction().block(TIMEOUT);
        atomicTransaction1.set(transaction1);

        ServiceBusMessage message = new ServiceBusMessage("data " );
        sender1.sendMessage(message, atomicTransaction1.get()).block(TIMEOUT);

        System.out.println("!!!! Sent message with transaction scope.");

        receiver0.receiveMessages()
            .flatMap(receivedMessage -> {
                System.out.println("!!!! Received message and will complete it. SQ :" + receivedMessage.getSequenceNumber());
                return receiver0.complete(receivedMessage, new CompleteOptions().setTransactionContext(transaction1)).thenReturn(receivedMessage);

            }).subscribe(m -> {
                System.out.println("!!!! Received message and done SQ :" + m.getSequenceNumber());
            });

        TimeUnit.SECONDS.sleep(5);

        /*System.out.println("!!!! Start processor.");
        processor0.start();

        TimeUnit.SECONDS.sleep(10);
        System.out.println("!!!! wait and process for ");
        System.out.println("!!!! Re start processor.");

        processor0.restartMessageReceiver();

        TimeUnit.SECONDS.sleep(30);
        */System.out.println("!!!! now commit transaction.");
        sender1.commitTransaction(transaction1).block(TIMEOUT);
        System.out.println("!!!! Exit.");

    }

    /**
     * Sets the sender and receiver. If session is enabled, then a single-named session receiver is created.
     */
    private void setSenderAndReceiver(MessagingEntityType entityType, int entityIndex, boolean isSessionEnabled) {
        setSender(entityType, entityIndex, isSessionEnabled);
        setReceiver(entityType, entityIndex, isSessionEnabled);
    }

    private void setReceiver(MessagingEntityType entityType, int entityIndex, boolean isSessionEnabled) {
        final boolean shareConnection = false;
        final boolean useCredentials = false;
        if (isSessionEnabled) {
            assertNotNull(sessionId, "'sessionId' should have been set.");
            sessionReceiver = getSessionReceiverBuilder(useCredentials, entityType, entityIndex, shareConnection)
                .disableAutoComplete()
                .buildAsyncClient();

            this.receiver = sessionReceiver.acceptSession(sessionId).block();

        } else {
            this.receiver = getReceiverBuilder(useCredentials, entityType, entityIndex, shareConnection)
                .disableAutoComplete()
                .buildAsyncClient();
        }
    }

    private void setSender(MessagingEntityType entityType, int entityIndex, boolean isSessionEnabled, boolean shareConnection) {
        final boolean useCredentials = false;
        this.sender = getSenderBuilder(useCredentials, entityType, entityIndex, isSessionEnabled, shareConnection)
            .buildAsyncClient();
    }

    private void setSender(MessagingEntityType entityType, int entityIndex, boolean isSessionEnabled) {
        final boolean shareConnection = false;
        final boolean useCredentials = false;
        this.sender = getSenderBuilder(useCredentials, entityType, entityIndex, isSessionEnabled, shareConnection)
            .buildAsyncClient();
    }

    private Mono<Void> sendMessage(ServiceBusMessage message) {
        return sender.sendMessage(message).doOnSuccess(aVoid -> {
            int number = messagesPending.incrementAndGet();
            logger.info("Message Id {}. Number sent: {}", message.getMessageId(), number);
        });
    }
}
