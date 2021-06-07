// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Additional information on the backed up item. */
@Fluent
public final class MabFileFolderProtectedItemExtendedInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MabFileFolderProtectedItemExtendedInfo.class);

    /*
     * Last time when the agent data synced to service.
     */
    @JsonProperty(value = "lastRefreshedAt")
    private OffsetDateTime lastRefreshedAt;

    /*
     * The oldest backup copy available.
     */
    @JsonProperty(value = "oldestRecoveryPoint")
    private OffsetDateTime oldestRecoveryPoint;

    /*
     * Number of backup copies associated with the backup item.
     */
    @JsonProperty(value = "recoveryPointCount")
    private Integer recoveryPointCount;

    /**
     * Get the lastRefreshedAt property: Last time when the agent data synced to service.
     *
     * @return the lastRefreshedAt value.
     */
    public OffsetDateTime lastRefreshedAt() {
        return this.lastRefreshedAt;
    }

    /**
     * Set the lastRefreshedAt property: Last time when the agent data synced to service.
     *
     * @param lastRefreshedAt the lastRefreshedAt value to set.
     * @return the MabFileFolderProtectedItemExtendedInfo object itself.
     */
    public MabFileFolderProtectedItemExtendedInfo withLastRefreshedAt(OffsetDateTime lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
        return this;
    }

    /**
     * Get the oldestRecoveryPoint property: The oldest backup copy available.
     *
     * @return the oldestRecoveryPoint value.
     */
    public OffsetDateTime oldestRecoveryPoint() {
        return this.oldestRecoveryPoint;
    }

    /**
     * Set the oldestRecoveryPoint property: The oldest backup copy available.
     *
     * @param oldestRecoveryPoint the oldestRecoveryPoint value to set.
     * @return the MabFileFolderProtectedItemExtendedInfo object itself.
     */
    public MabFileFolderProtectedItemExtendedInfo withOldestRecoveryPoint(OffsetDateTime oldestRecoveryPoint) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        return this;
    }

    /**
     * Get the recoveryPointCount property: Number of backup copies associated with the backup item.
     *
     * @return the recoveryPointCount value.
     */
    public Integer recoveryPointCount() {
        return this.recoveryPointCount;
    }

    /**
     * Set the recoveryPointCount property: Number of backup copies associated with the backup item.
     *
     * @param recoveryPointCount the recoveryPointCount value to set.
     * @return the MabFileFolderProtectedItemExtendedInfo object itself.
     */
    public MabFileFolderProtectedItemExtendedInfo withRecoveryPointCount(Integer recoveryPointCount) {
        this.recoveryPointCount = recoveryPointCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
