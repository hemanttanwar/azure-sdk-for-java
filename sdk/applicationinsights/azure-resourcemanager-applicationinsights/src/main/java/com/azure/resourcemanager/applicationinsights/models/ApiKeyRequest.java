// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An Application Insights component API Key creation request definition. */
@Fluent
public final class ApiKeyRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiKeyRequest.class);

    /*
     * The name of the API Key.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The read access rights of this API Key.
     */
    @JsonProperty(value = "linkedReadProperties")
    private List<String> linkedReadProperties;

    /*
     * The write access rights of this API Key.
     */
    @JsonProperty(value = "linkedWriteProperties")
    private List<String> linkedWriteProperties;

    /**
     * Get the name property: The name of the API Key.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the API Key.
     *
     * @param name the name value to set.
     * @return the ApiKeyRequest object itself.
     */
    public ApiKeyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the linkedReadProperties property: The read access rights of this API Key.
     *
     * @return the linkedReadProperties value.
     */
    public List<String> linkedReadProperties() {
        return this.linkedReadProperties;
    }

    /**
     * Set the linkedReadProperties property: The read access rights of this API Key.
     *
     * @param linkedReadProperties the linkedReadProperties value to set.
     * @return the ApiKeyRequest object itself.
     */
    public ApiKeyRequest withLinkedReadProperties(List<String> linkedReadProperties) {
        this.linkedReadProperties = linkedReadProperties;
        return this;
    }

    /**
     * Get the linkedWriteProperties property: The write access rights of this API Key.
     *
     * @return the linkedWriteProperties value.
     */
    public List<String> linkedWriteProperties() {
        return this.linkedWriteProperties;
    }

    /**
     * Set the linkedWriteProperties property: The write access rights of this API Key.
     *
     * @param linkedWriteProperties the linkedWriteProperties value to set.
     * @return the ApiKeyRequest object itself.
     */
    public ApiKeyRequest withLinkedWriteProperties(List<String> linkedWriteProperties) {
        this.linkedWriteProperties = linkedWriteProperties;
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
