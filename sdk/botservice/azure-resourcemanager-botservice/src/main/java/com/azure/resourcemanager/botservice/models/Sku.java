// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SKU of the cognitive services account. */
@Fluent
public final class Sku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Sku.class);

    /*
     * The sku name
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * Gets the sku tier. This is based on the SKU name.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private SkuTier tier;

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Gets the sku tier. This is based on the SKU name.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }
}
