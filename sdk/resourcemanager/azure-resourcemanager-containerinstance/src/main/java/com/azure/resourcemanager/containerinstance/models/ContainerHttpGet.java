// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The container Http Get settings, for liveness or readiness probe. */
@Fluent
public final class ContainerHttpGet {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerHttpGet.class);

    /*
     * The path to probe.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * The port number to probe.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /*
     * The scheme.
     */
    @JsonProperty(value = "scheme")
    private Scheme scheme;

    /**
     * Get the path property: The path to probe.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path to probe.
     *
     * @param path the path value to set.
     * @return the ContainerHttpGet object itself.
     */
    public ContainerHttpGet withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the port property: The port number to probe.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: The port number to probe.
     *
     * @param port the port value to set.
     * @return the ContainerHttpGet object itself.
     */
    public ContainerHttpGet withPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the scheme property: The scheme.
     *
     * @return the scheme value.
     */
    public Scheme scheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: The scheme.
     *
     * @param scheme the scheme value to set.
     * @return the ContainerHttpGet object itself.
     */
    public ContainerHttpGet withScheme(Scheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
