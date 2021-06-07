// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.powerbidedicated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.powerbidedicated.models.SkuDetailsForExistingResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object that represents enumerating SKUs for existing resources. */
@Fluent
public final class SkuEnumerationForExistingResourceResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(SkuEnumerationForExistingResourceResultInner.class);

    /*
     * The collection of available SKUs for existing resources
     */
    @JsonProperty(value = "value")
    private List<SkuDetailsForExistingResource> value;

    /**
     * Get the value property: The collection of available SKUs for existing resources.
     *
     * @return the value value.
     */
    public List<SkuDetailsForExistingResource> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of available SKUs for existing resources.
     *
     * @param value the value value to set.
     * @return the SkuEnumerationForExistingResourceResultInner object itself.
     */
    public SkuEnumerationForExistingResourceResultInner withValue(List<SkuDetailsForExistingResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
