// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Managed integration runtime, including managed elastic and managed dedicated integration runtimes. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Managed")
@JsonFlatten
@Fluent
public class ManagedIntegrationRuntime extends IntegrationRuntime {
    /*
     * Integration runtime state, only valid for managed dedicated integration
     * runtime.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeState state;

    /*
     * Managed Virtual Network reference.
     */
    @JsonProperty(value = "managedVirtualNetwork")
    private ManagedVirtualNetworkReference managedVirtualNetwork;

    /*
     * The compute resource for managed integration runtime.
     */
    @JsonProperty(value = "typeProperties.computeProperties")
    private IntegrationRuntimeComputeProperties computeProperties;

    /*
     * SSIS properties for managed integration runtime.
     */
    @JsonProperty(value = "typeProperties.ssisProperties")
    private IntegrationRuntimeSsisProperties ssisProperties;

    /**
     * Get the state property: Integration runtime state, only valid for managed dedicated integration runtime.
     *
     * @return the state value.
     */
    public IntegrationRuntimeState getState() {
        return this.state;
    }

    /**
     * Get the managedVirtualNetwork property: Managed Virtual Network reference.
     *
     * @return the managedVirtualNetwork value.
     */
    public ManagedVirtualNetworkReference getManagedVirtualNetwork() {
        return this.managedVirtualNetwork;
    }

    /**
     * Set the managedVirtualNetwork property: Managed Virtual Network reference.
     *
     * @param managedVirtualNetwork the managedVirtualNetwork value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime setManagedVirtualNetwork(ManagedVirtualNetworkReference managedVirtualNetwork) {
        this.managedVirtualNetwork = managedVirtualNetwork;
        return this;
    }

    /**
     * Get the computeProperties property: The compute resource for managed integration runtime.
     *
     * @return the computeProperties value.
     */
    public IntegrationRuntimeComputeProperties getComputeProperties() {
        return this.computeProperties;
    }

    /**
     * Set the computeProperties property: The compute resource for managed integration runtime.
     *
     * @param computeProperties the computeProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime setComputeProperties(IntegrationRuntimeComputeProperties computeProperties) {
        this.computeProperties = computeProperties;
        return this;
    }

    /**
     * Get the ssisProperties property: SSIS properties for managed integration runtime.
     *
     * @return the ssisProperties value.
     */
    public IntegrationRuntimeSsisProperties getSsisProperties() {
        return this.ssisProperties;
    }

    /**
     * Set the ssisProperties property: SSIS properties for managed integration runtime.
     *
     * @param ssisProperties the ssisProperties value to set.
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime setSsisProperties(IntegrationRuntimeSsisProperties ssisProperties) {
        this.ssisProperties = ssisProperties;
        return this;
    }
}
