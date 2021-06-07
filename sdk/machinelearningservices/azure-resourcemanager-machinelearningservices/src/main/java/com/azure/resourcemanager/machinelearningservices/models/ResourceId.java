// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a resource ID. For example, for a subnet, it is the resource URL for the subnet. */
@Fluent
public final class ResourceId {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceId.class);

    /*
     * The ID of the resource
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The ID of the resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the resource.
     *
     * @param id the id value to set.
     * @return the ResourceId object itself.
     */
    public ResourceId withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property id in model ResourceId"));
        }
    }
}
