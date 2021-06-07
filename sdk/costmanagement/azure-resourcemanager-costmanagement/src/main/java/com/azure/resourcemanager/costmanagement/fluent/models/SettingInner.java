// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.costmanagement.models.ProxySettingResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** State of Setting. */
@JsonFlatten
@Fluent
public class SettingInner extends ProxySettingResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SettingInner.class);

    /*
     * For the myscope setting, sets the default scope the current user will
     * see when they sign into Azure Cost Management in the Azure portal.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /**
     * Get the scope property: For the myscope setting, sets the default scope the current user will see when they sign
     * into Azure Cost Management in the Azure portal.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: For the myscope setting, sets the default scope the current user will see when they sign
     * into Azure Cost Management in the Azure portal.
     *
     * @param scope the scope value to set.
     * @return the SettingInner object itself.
     */
    public SettingInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
