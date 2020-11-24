// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.perf.data;

import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public interface TestSetting {
    String CONNECTION_STRING = System.getenv("AZURE_SERVICE_BUS_CONNECTION_STRING");
    String SESSION_QUEUE_NAME = "sessionqueue";
    String SESSION_ID = "s1";

    int PREFETCH = System.getenv("PREFETCH") != null
        ? Integer.parseInt(System.getenv("PREFETCH"))
        : 0;

    // MMTRAS :Max messages to receive and stop
    int MAX_MESSAGES_TO_RECEIVE_AND_STOP = System.getenv("MMTRAS") != null
        ? Integer.parseInt(System.getenv("MMTRAS"))
        : 1000;

    // RBS : Receive Batch Size
    int RECEIVE_BATCH_SIZE = System.getenv("RBS") != null
        ? Integer.parseInt(System.getenv("RBS"))
        : 100;

    // RM :Receive mode
    ServiceBusReceiveMode RECEIVE_MODE = System.getenv("RM") != null
        ? ServiceBusReceiveMode.valueOf(System.getenv("RECEIVE_MODE"))
        : ServiceBusReceiveMode.RECEIVE_AND_DELETE;

    // TCN : Test case name Receive/Send/SendOne/Processor
    String TEST_CASE_NAME = System.getenv("TCN") != null
        ? System.getenv("TCN")
        : "Receive";

    // TT : DataIntegrity/Performance
    String TEST_TYPE = System.getenv("TT") != null
        ? System.getenv("TT")
        : "DataIntegrity";

    // TTS_MS :TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL in milliseconds
    long TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS = System.getenv("TTS_MS") != null
        ? Long.parseLong(System.getenv("TTS_MS"))
        : 300;

    // MIOB :How many messages in one batch
    long MESSAGES_IN_ONE_BATCH = System.getenv("MIOB") != null
        ? Long.parseLong(System.getenv("MIOB"))
        : 100;

    // TBTS :How many batch to send
    long TOTAL_BATCHES_TO_SEND = System.getenv("TBTS") != null
        ? Long.parseLong(System.getenv("TBTS"))
        : 100;

    // TMTS :How many Messages to send. This is not used in batch send. Only needed for single message send api.
    long TOTAL_MESSAGES_TO_SEND = System.getenv("TMTS") != null
        ? Long.parseLong(System.getenv("TMTS"))
        : 100;

    // QN : Name of the queue
    String QUEUE_NAME = System.getenv("QN") != null
        ? System.getenv("QN")
        : "queue";

    int MAX_CONCURRENCY = 1;
    int SEND_BATCH_COUNT = 40;


    // Keys are documented below for logging purpose.
    String KEY_TOTAL_TIME_TAKEN_MS = "TotalTimeTakenMS";
    String KEY_PREFETCH = "Prefetch";
    String KEY_QUEUE_NAME = "Queue";
    String KEY_RECEIVE_MODE = "ReceivedMode";
    String KEY_RECEIVE_BATCH_SIZE = "ReceivedBatchSize";
    String KEY_TOTAL_MESSAGES_RECEIVED = "TotalMessagesReceived";
    String KEY_TOTAL_MESSAGES_PER_SECONDS = "Message/S";
    String KEY_MAX_MESSAGES_TO_RECEIVE_AND_STOP = "Max messages to receive and stop";
    String KEY_TIME_TO_SLEEP_IN_BETWEEN_EACH_CALL_MS = "TimeToSleepBetweenEachCall_MS";
    String KEY_MESSAGES_IN_ONE_BATCH = "MessagesInOneBatch";
    String KEY_TOTAL_BATCHES_TO_SEND = "TotalBatchToSend";
    String KEY_TOTAL_MESSAGES_TO_SEND = "TotalMessagesToSend";



}

