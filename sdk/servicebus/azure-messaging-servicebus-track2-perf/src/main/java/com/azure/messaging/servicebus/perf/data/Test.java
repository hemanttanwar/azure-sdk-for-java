// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.perf.data;

import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.util.IterableStream;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.ServiceBusReceiverClient;
import com.azure.messaging.servicebus.ServiceBusSenderClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import static com.azure.messaging.servicebus.perf.data.TestSetting.*;

/**
 *SyncReceiveTest
 */
public class Test {
    public void run() throws InterruptedException {
        ServiceBusSenderClient sender = null;
        ServiceBusReceiverClient receiver = null;
        reportConfig();
        try {
            if (TEST_CASE_NAME.equalsIgnoreCase("Receive")
                && TEST_TYPE.equalsIgnoreCase("Performance")) {
                receiver = new ServiceBusClientBuilder()
                    .connectionString(CONNECTION_STRING)
                    .receiver()
                    .queueName(QUEUE_NAME)
                    .prefetchCount(PREFETCH)
                    .receiveMode(RECEIVE_MODE)
                    .buildClient();

                this.testReceivePerformance(receiver);

            } else if (TEST_CASE_NAME.equalsIgnoreCase("Receive")
                && TEST_TYPE.equalsIgnoreCase("DataIntegrity")) {
                receiver = new ServiceBusClientBuilder()
                    .connectionString(CONNECTION_STRING)
                    .receiver()
                    .queueName(QUEUE_NAME)
                    .prefetchCount(PREFETCH)
                    .receiveMode(RECEIVE_MODE)
                    .buildClient();

                this.testReceiveDataIntegrity(receiver);

            } else if (TEST_CASE_NAME.equalsIgnoreCase("Send")
                && TEST_TYPE.equalsIgnoreCase("DataIntegrity")) {

                sender = new ServiceBusClientBuilder()
                    .connectionString(CONNECTION_STRING)
                    .retryOptions(new AmqpRetryOptions().setTryTimeout(Duration.ofMillis(100000)))
                    .sender()
                    .queueName(QUEUE_NAME)
                    .buildClient();

                this.testSendDataIntegrity(sender);
            } else if (TEST_CASE_NAME.equalsIgnoreCase("SendSingle")
                && TEST_TYPE.equalsIgnoreCase("DataIntegrity")) {

                sender = new ServiceBusClientBuilder()
                    .connectionString(CONNECTION_STRING)
                    .retryOptions(new AmqpRetryOptions().setTryTimeout(Duration.ofMillis(100000)))
                    .sender()
                    .queueName(QUEUE_NAME)
                    .buildClient();

                this.testSendSingleDataIntegrity(sender);
            } else if (TEST_CASE_NAME.equalsIgnoreCase("SendSingle")
                && TEST_TYPE.equalsIgnoreCase("Performance")) {

                sender = new ServiceBusClientBuilder()
                    .connectionString(CONNECTION_STRING)
                    .retryOptions(new AmqpRetryOptions().setTryTimeout(Duration.ofMillis(100000)))
                    .sender()
                    .queueName(QUEUE_NAME)
                    .buildClient();

                this.testSendSinglePerformance(sender);
            }else {
                TestLogger.log("!! Oops Not Implemented .... ");
            }
        } finally {
            if (receiver != null ){
                receiver.close();
            }
            if (sender != null ){
                sender.close();
            }
        }
    }

    void testReceiveDataIntegrity(ServiceBusReceiverClient receiver) throws InterruptedException {
        // Receive the messages
        int totalReceivedMessages = 0;

        // Start receiving
        final long startTimeMS = System.currentTimeMillis();
        long messagesSinceLastLog = 0;
        while (totalReceivedMessages < MAX_MESSAGES_TO_RECEIVE_AND_STOP) {
            IterableStream<ServiceBusReceivedMessage> receivedMessage = receiver.receiveMessages(RECEIVE_BATCH_SIZE);
            TimeUnit.MILLISECONDS.sleep(TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);

            AtomicLong received = new AtomicLong();
                receivedMessage.stream().forEach(message -> {
                    if (RECEIVE_MODE == ServiceBusReceiveMode.PEEK_LOCK) {
                        receiver.complete(message);
                    }

                received.incrementAndGet();
            });
            totalReceivedMessages += received.get();
            // print/log every 1K messages
            messagesSinceLastLog += received.get();
            if (messagesSinceLastLog >= 1000 ) {
                TestLogger.log("Received Messages:" + totalReceivedMessages);
                messagesSinceLastLog = 0;
            }
        }
        final long endTimeMS = System.currentTimeMillis();

        reportData(totalReceivedMessages, startTimeMS, endTimeMS);
    }

    void testReceivePerformance(ServiceBusReceiverClient receiver) throws InterruptedException {
        // Receive the messages
        int totalReceivedMessages = 0;

        // Start receiving
        final long startTimeMS = System.currentTimeMillis();
        while (totalReceivedMessages < MAX_MESSAGES_TO_RECEIVE_AND_STOP) {
            IterableStream<ServiceBusReceivedMessage> receivedMessage = receiver.receiveMessages(RECEIVE_BATCH_SIZE);
            TimeUnit.MILLISECONDS.sleep(TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);
            totalReceivedMessages += receivedMessage.stream().count();
        }
        final long endTimeMS = System.currentTimeMillis();

        reportData(totalReceivedMessages, startTimeMS, endTimeMS);
    }

    public void testSendDataIntegrity(ServiceBusSenderClient sender) throws InterruptedException {

        List<ServiceBusMessage> messages = new ArrayList<>();
        for (int i = 1; i <= TOTAL_BATCHES_TO_SEND; i++) {
            for (int j = 1; j <= MESSAGES_IN_ONE_BATCH; j++) {
                messages.add(new ServiceBusMessage("A"));
            }
            sender.sendMessages(messages);
            TimeUnit.MILLISECONDS.sleep(TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);
            TestLogger.log("Sent Messages:" + messages.size());
        }
    }

    public void testSendSingleDataIntegrity(ServiceBusSenderClient sender) throws InterruptedException {

        List<ServiceBusMessage> messages = new ArrayList<>();
        ServiceBusMessage message = new ServiceBusMessage("A");
        for (int j = 1; j <= TOTAL_MESSAGES_TO_SEND; j++) {
            sender.sendMessage(message);
            // print/log every 1K messages
            if (j % 1000 == 0 ) {
                TestLogger.log("Sent Messages:" + j);
            }
        }
        TimeUnit.MILLISECONDS.sleep(TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);
        TestLogger.log("Sent Messages:" + messages.size());

    }

    public void testSendSinglePerformance(ServiceBusSenderClient sender) throws InterruptedException {

        List<ServiceBusMessage> messages = new ArrayList<>();
        ServiceBusMessage message = new ServiceBusMessage("A");
        for (int j = 1; j <= TOTAL_MESSAGES_TO_SEND; j++) {
            sender.sendMessage(message);
        }
        TimeUnit.MILLISECONDS.sleep(TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);
        TestLogger.log("Sent Messages:" + messages.size());

    }

    private void reportData(long totalReceivedMessages, long startTimeMS, long endTimeMS) {
        // Data reporting
        HashMap<String, Object> dataToReport = new HashMap<>();
        dataToReport.put(KEY_PREFETCH, PREFETCH);
        dataToReport.put(KEY_RECEIVE_BATCH_SIZE, RECEIVE_BATCH_SIZE);
        dataToReport.put(KEY_RECEIVE_MODE, RECEIVE_MODE);
        dataToReport.put(KEY_MAX_MESSAGES_TO_RECEIVE_AND_STOP, MAX_MESSAGES_TO_RECEIVE_AND_STOP);
        dataToReport.put(KEY_TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS, TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);


        // test result
        dataToReport.put(KEY_TOTAL_MESSAGES_RECEIVED, totalReceivedMessages);
        dataToReport.put(KEY_TOTAL_TIME_TAKEN_MS, (endTimeMS - startTimeMS));
        dataToReport.put(KEY_TOTAL_MESSAGES_PER_SECONDS, (totalReceivedMessages * 1000.0) / (endTimeMS - startTimeMS));

        System.out.println("---------------------------------");
        System.out.println("-------- Test Result ------------");
        System.out.println("---------------------------------");

        TestLogger.logTestResult(dataToReport);
    }

    private void reportConfig() {
        // Data reporting
        HashMap<String, Object> dataToReport = new HashMap<>();
        dataToReport.put(KEY_QUEUE_NAME, QUEUE_NAME);
        dataToReport.put(KEY_PREFETCH, PREFETCH);
        dataToReport.put(KEY_RECEIVE_BATCH_SIZE, RECEIVE_BATCH_SIZE);
        dataToReport.put(KEY_RECEIVE_MODE, RECEIVE_MODE);
        dataToReport.put(KEY_MAX_MESSAGES_TO_RECEIVE_AND_STOP, MAX_MESSAGES_TO_RECEIVE_AND_STOP);
        dataToReport.put(KEY_TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS, TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS);

        TestLogger.logTestResult(dataToReport);
    }

    /**
     * Main
     * @param args for the program.
     */
    public static void main(String[] args) {
        Test receiveTest = new Test();
        try {

            receiveTest.run();

        } catch (Exception e) {
            System.out.printf("%s", e.toString());
        }
    }
}
