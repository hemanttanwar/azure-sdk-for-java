/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kubernetesconfiguration.v2021_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Display metadata associated with the operation.
 */
public class ResourceProviderOperationDisplay {
    /**
     * Resource provider: Microsoft KubernetesConfiguration.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Type of operation: get, read, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Description of this operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get resource provider: Microsoft KubernetesConfiguration.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set resource provider: Microsoft KubernetesConfiguration.
     *
     * @param provider the provider value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get resource on which the operation is performed.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set resource on which the operation is performed.
     *
     * @param resource the resource value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get type of operation: get, read, delete, etc.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set type of operation: get, read, delete, etc.
     *
     * @param operation the operation value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get description of this operation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of this operation.
     *
     * @param description the description value to set
     * @return the ResourceProviderOperationDisplay object itself.
     */
    public ResourceProviderOperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

}
