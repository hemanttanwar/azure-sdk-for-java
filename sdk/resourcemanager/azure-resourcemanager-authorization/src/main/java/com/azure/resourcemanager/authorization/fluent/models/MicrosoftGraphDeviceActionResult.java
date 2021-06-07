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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Device action result. */
@Fluent
public final class MicrosoftGraphDeviceActionResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphDeviceActionResult.class);

    /*
     * Action name
     */
    @JsonProperty(value = "actionName")
    private String actionName;

    /*
     * The actionState property.
     */
    @JsonProperty(value = "actionState")
    private MicrosoftGraphActionState actionState;

    /*
     * Time the action state was last updated
     */
    @JsonProperty(value = "lastUpdatedDateTime")
    private OffsetDateTime lastUpdatedDateTime;

    /*
     * Time the action was initiated
     */
    @JsonProperty(value = "startDateTime")
    private OffsetDateTime startDateTime;

    /*
     * Device action result
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the actionName property: Action name.
     *
     * @return the actionName value.
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName property: Action name.
     *
     * @param actionName the actionName value to set.
     * @return the MicrosoftGraphDeviceActionResult object itself.
     */
    public MicrosoftGraphDeviceActionResult withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the actionState property: The actionState property.
     *
     * @return the actionState value.
     */
    public MicrosoftGraphActionState actionState() {
        return this.actionState;
    }

    /**
     * Set the actionState property: The actionState property.
     *
     * @param actionState the actionState value to set.
     * @return the MicrosoftGraphDeviceActionResult object itself.
     */
    public MicrosoftGraphDeviceActionResult withActionState(MicrosoftGraphActionState actionState) {
        this.actionState = actionState;
        return this;
    }

    /**
     * Get the lastUpdatedDateTime property: Time the action state was last updated.
     *
     * @return the lastUpdatedDateTime value.
     */
    public OffsetDateTime lastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * Set the lastUpdatedDateTime property: Time the action state was last updated.
     *
     * @param lastUpdatedDateTime the lastUpdatedDateTime value to set.
     * @return the MicrosoftGraphDeviceActionResult object itself.
     */
    public MicrosoftGraphDeviceActionResult withLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
        return this;
    }

    /**
     * Get the startDateTime property: Time the action was initiated.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime startDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: Time the action was initiated.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the MicrosoftGraphDeviceActionResult object itself.
     */
    public MicrosoftGraphDeviceActionResult withStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the additionalProperties property: Device action result.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Device action result.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDeviceActionResult object itself.
     */
    public MicrosoftGraphDeviceActionResult withAdditionalProperties(Map<String, Object> additionalProperties) {
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
