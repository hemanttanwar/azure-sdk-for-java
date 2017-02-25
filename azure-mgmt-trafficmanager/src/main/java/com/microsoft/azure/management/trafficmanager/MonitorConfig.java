/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class containing endpoint monitoring settings in a Traffic Manager profile.
 */
public class MonitorConfig {
    /**
     * Gets or sets the profile-level monitoring status of the Traffic Manager
     * profile.
     */
    @JsonProperty(value = "profileMonitorStatus")
    private String profileMonitorStatus;

    /**
     * Gets or sets the protocol (HTTP or HTTPS) used to probe for endpoint
     * health.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /**
     * Gets or sets the TCP port used to probe for endpoint health.
     */
    @JsonProperty(value = "port")
    private Long port;

    /**
     * Gets or sets the path relative to the endpoint domain name used to probe
     * for endpoint health.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the profileMonitorStatus value.
     *
     * @return the profileMonitorStatus value
     */
    public String profileMonitorStatus() {
        return this.profileMonitorStatus;
    }

    /**
     * Set the profileMonitorStatus value.
     *
     * @param profileMonitorStatus the profileMonitorStatus value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withProfileMonitorStatus(String profileMonitorStatus) {
        this.profileMonitorStatus = profileMonitorStatus;
        return this;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Long port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withPath(String path) {
        this.path = path;
        return this;
    }

}
