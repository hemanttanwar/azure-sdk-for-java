// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for the task that collects user tables for the given list of databases. */
@Fluent
public final class GetUserTablesSqlSyncTaskInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GetUserTablesSqlSyncTaskInput.class);

    /*
     * Connection information for SQL Server
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /*
     * Connection information for SQL DB
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private SqlConnectionInfo targetConnectionInfo;

    /*
     * List of source database names to collect tables for
     */
    @JsonProperty(value = "selectedSourceDatabases", required = true)
    private List<String> selectedSourceDatabases;

    /*
     * List of target database names to collect tables for
     */
    @JsonProperty(value = "selectedTargetDatabases", required = true)
    private List<String> selectedTargetDatabases;

    /**
     * Get the sourceConnectionInfo property: Connection information for SQL Server.
     *
     * @return the sourceConnectionInfo value.
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set the sourceConnectionInfo property: Connection information for SQL Server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set.
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get the targetConnectionInfo property: Connection information for SQL DB.
     *
     * @return the targetConnectionInfo value.
     */
    public SqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for SQL DB.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the selectedSourceDatabases property: List of source database names to collect tables for.
     *
     * @return the selectedSourceDatabases value.
     */
    public List<String> selectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }

    /**
     * Set the selectedSourceDatabases property: List of source database names to collect tables for.
     *
     * @param selectedSourceDatabases the selectedSourceDatabases value to set.
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withSelectedSourceDatabases(List<String> selectedSourceDatabases) {
        this.selectedSourceDatabases = selectedSourceDatabases;
        return this;
    }

    /**
     * Get the selectedTargetDatabases property: List of target database names to collect tables for.
     *
     * @return the selectedTargetDatabases value.
     */
    public List<String> selectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }

    /**
     * Set the selectedTargetDatabases property: List of target database names to collect tables for.
     *
     * @param selectedTargetDatabases the selectedTargetDatabases value to set.
     * @return the GetUserTablesSqlSyncTaskInput object itself.
     */
    public GetUserTablesSqlSyncTaskInput withSelectedTargetDatabases(List<String> selectedTargetDatabases) {
        this.selectedTargetDatabases = selectedTargetDatabases;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceConnectionInfo in model GetUserTablesSqlSyncTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model GetUserTablesSqlSyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (selectedSourceDatabases() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedSourceDatabases in model GetUserTablesSqlSyncTaskInput"));
        }
        if (selectedTargetDatabases() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedTargetDatabases in model GetUserTablesSqlSyncTaskInput"));
        }
    }
}
