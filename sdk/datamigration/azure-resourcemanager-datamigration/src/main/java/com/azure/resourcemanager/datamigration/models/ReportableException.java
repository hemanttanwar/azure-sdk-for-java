// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Exception object for all custom exceptions. */
@Fluent
public final class ReportableException {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReportableException.class);

    /*
     * Error message
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Actionable steps for this exception
     */
    @JsonProperty(value = "actionableMessage")
    private String actionableMessage;

    /*
     * The path to the file where exception occurred
     */
    @JsonProperty(value = "filePath", access = JsonProperty.Access.WRITE_ONLY)
    private String filePath;

    /*
     * The line number where exception occurred
     */
    @JsonProperty(value = "lineNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String lineNumber;

    /*
     * Coded numerical value that is assigned to a specific exception
     */
    @JsonProperty(value = "hResult", access = JsonProperty.Access.WRITE_ONLY)
    private Integer hResult;

    /*
     * Stack trace
     */
    @JsonProperty(value = "stackTrace", access = JsonProperty.Access.WRITE_ONLY)
    private String stackTrace;

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the actionableMessage property: Actionable steps for this exception.
     *
     * @return the actionableMessage value.
     */
    public String actionableMessage() {
        return this.actionableMessage;
    }

    /**
     * Set the actionableMessage property: Actionable steps for this exception.
     *
     * @param actionableMessage the actionableMessage value to set.
     * @return the ReportableException object itself.
     */
    public ReportableException withActionableMessage(String actionableMessage) {
        this.actionableMessage = actionableMessage;
        return this;
    }

    /**
     * Get the filePath property: The path to the file where exception occurred.
     *
     * @return the filePath value.
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Get the lineNumber property: The line number where exception occurred.
     *
     * @return the lineNumber value.
     */
    public String lineNumber() {
        return this.lineNumber;
    }

    /**
     * Get the hResult property: Coded numerical value that is assigned to a specific exception.
     *
     * @return the hResult value.
     */
    public Integer hResult() {
        return this.hResult;
    }

    /**
     * Get the stackTrace property: Stack trace.
     *
     * @return the stackTrace value.
     */
    public String stackTrace() {
        return this.stackTrace;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
