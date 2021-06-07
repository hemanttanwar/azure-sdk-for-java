/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource name availability request content.
 */
public class ResourceNameAvailabilityRequest {
    /**
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Resource type used for verification. Possible values include: 'Site',
     * 'Slot', 'HostingEnvironment', 'PublishingUser', 'Microsoft.Web/sites',
     * 'Microsoft.Web/sites/slots', 'Microsoft.Web/hostingEnvironments',
     * 'Microsoft.Web/publishingUsers'.
     */
    @JsonProperty(value = "type", required = true)
    private CheckNameResourceTypes type;

    /**
     * Is fully qualified domain name.
     */
    @JsonProperty(value = "isFqdn")
    private Boolean isFqdn;

    /**
     * Get resource name to verify.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set resource name to verify.
     *
     * @param name the name value to set
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource type used for verification. Possible values include: 'Site', 'Slot', 'HostingEnvironment', 'PublishingUser', 'Microsoft.Web/sites', 'Microsoft.Web/sites/slots', 'Microsoft.Web/hostingEnvironments', 'Microsoft.Web/publishingUsers'.
     *
     * @return the type value
     */
    public CheckNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set resource type used for verification. Possible values include: 'Site', 'Slot', 'HostingEnvironment', 'PublishingUser', 'Microsoft.Web/sites', 'Microsoft.Web/sites/slots', 'Microsoft.Web/hostingEnvironments', 'Microsoft.Web/publishingUsers'.
     *
     * @param type the type value to set
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withType(CheckNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get is fully qualified domain name.
     *
     * @return the isFqdn value
     */
    public Boolean isFqdn() {
        return this.isFqdn;
    }

    /**
     * Set is fully qualified domain name.
     *
     * @param isFqdn the isFqdn value to set
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withIsFqdn(Boolean isFqdn) {
        this.isFqdn = isFqdn;
        return this;
    }

}
