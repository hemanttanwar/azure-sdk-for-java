// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/** The ContractsValidatePropertiesRequestBody model. */
@Fluent
public final class ContractsValidatePropertiesRequestBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContractsValidatePropertiesRequestBody.class);

    /*
     * The entityType property.
     */
    @JsonProperty(value = "entityType")
    private String entityType;

    /*
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The mailNickname property.
     */
    @JsonProperty(value = "mailNickname")
    private String mailNickname;

    /*
     * The onBehalfOfUserId property.
     */
    @JsonProperty(value = "onBehalfOfUserId")
    private UUID onBehalfOfUserId;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the entityType property: The entityType property.
     *
     * @return the entityType value.
     */
    public String entityType() {
        return this.entityType;
    }

    /**
     * Set the entityType property: The entityType property.
     *
     * @param entityType the entityType value to set.
     * @return the ContractsValidatePropertiesRequestBody object itself.
     */
    public ContractsValidatePropertiesRequestBody withEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the displayName property: The displayName property.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The displayName property.
     *
     * @param displayName the displayName value to set.
     * @return the ContractsValidatePropertiesRequestBody object itself.
     */
    public ContractsValidatePropertiesRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the mailNickname property: The mailNickname property.
     *
     * @return the mailNickname value.
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname property: The mailNickname property.
     *
     * @param mailNickname the mailNickname value to set.
     * @return the ContractsValidatePropertiesRequestBody object itself.
     */
    public ContractsValidatePropertiesRequestBody withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the onBehalfOfUserId property: The onBehalfOfUserId property.
     *
     * @return the onBehalfOfUserId value.
     */
    public UUID onBehalfOfUserId() {
        return this.onBehalfOfUserId;
    }

    /**
     * Set the onBehalfOfUserId property: The onBehalfOfUserId property.
     *
     * @param onBehalfOfUserId the onBehalfOfUserId value to set.
     * @return the ContractsValidatePropertiesRequestBody object itself.
     */
    public ContractsValidatePropertiesRequestBody withOnBehalfOfUserId(UUID onBehalfOfUserId) {
        this.onBehalfOfUserId = onBehalfOfUserId;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ContractsValidatePropertiesRequestBody object itself.
     */
    public ContractsValidatePropertiesRequestBody withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
