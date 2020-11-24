// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.perf.data;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Logger
 */
public class TestLogger {

    /**
     *
     * @param message to log
     */
    public static void log(String message) {
        System.out.println(new Date() + "  " + message);
    }

    /**
     *
     * @param kvPair to log
     */
    public static void logTestResult(HashMap<String,Object> kvPair){
        if (kvPair == null) {
            return;
        }

        StringBuffer data = new StringBuffer();
        Set<Map.Entry<String, Object>> entrySet = kvPair.entrySet();
        entrySet.iterator().forEachRemaining(entry -> {
            data.append(entry.getKey()).append(":").append(entry.getValue().toString()).append("\n");
        });

        System.out.println(data.toString());

    }
}
