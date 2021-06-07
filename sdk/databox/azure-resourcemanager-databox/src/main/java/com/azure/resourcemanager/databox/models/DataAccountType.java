// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for DataAccountType. */
public enum DataAccountType {
    /** Enum value StorageAccount. */
    STORAGE_ACCOUNT("StorageAccount"),

    /** Enum value ManagedDisk. */
    MANAGED_DISK("ManagedDisk");

    /** The actual serialized value for a DataAccountType instance. */
    private final String value;

    DataAccountType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataAccountType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataAccountType object, or null if unable to parse.
     */
    @JsonCreator
    public static DataAccountType fromString(String value) {
        DataAccountType[] items = DataAccountType.values();
        for (DataAccountType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
