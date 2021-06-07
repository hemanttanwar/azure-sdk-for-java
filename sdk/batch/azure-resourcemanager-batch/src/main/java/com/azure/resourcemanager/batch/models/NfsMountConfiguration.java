// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information used to connect to an NFS file system. */
@Fluent
public final class NfsMountConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NfsMountConfiguration.class);

    /*
     * The URI of the file system to mount.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /*
     * All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /*
     * These are 'net use' options in Windows and 'mount' options in Linux.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * Get the source property: The URI of the file system to mount.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: The URI of the file system to mount.
     *
     * @param source the source value to set.
     * @return the NfsMountConfiguration object itself.
     */
    public NfsMountConfiguration withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the relativeMountPath property: All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @return the relativeMountPath value.
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relativeMountPath property: All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @param relativeMountPath the relativeMountPath value to set.
     * @return the NfsMountConfiguration object itself.
     */
    public NfsMountConfiguration withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get the mountOptions property: These are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @return the mountOptions value.
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set the mountOptions property: These are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @param mountOptions the mountOptions value to set.
     * @return the NfsMountConfiguration object itself.
     */
    public NfsMountConfiguration withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model NfsMountConfiguration"));
        }
        if (relativeMountPath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property relativeMountPath in model NfsMountConfiguration"));
        }
    }
}
