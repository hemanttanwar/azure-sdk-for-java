// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The target of the event. */
@Fluent
public final class ContainerRegistryArtifactEventTarget {
    /*
     * The MIME type of the artifact.
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /*
     * The size in bytes of the artifact.
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * The digest of the artifact.
     */
    @JsonProperty(value = "digest")
    private String digest;

    /*
     * The repository name of the artifact.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /*
     * The tag of the artifact.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * The name of the artifact.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The version of the artifact.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the mediaType property: The MIME type of the artifact.
     *
     * @return the mediaType value.
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType property: The MIME type of the artifact.
     *
     * @param mediaType the mediaType value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the size property: The size in bytes of the artifact.
     *
     * @return the size value.
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * Set the size property: The size in bytes of the artifact.
     *
     * @param size the size value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the digest property: The digest of the artifact.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Set the digest property: The digest of the artifact.
     *
     * @param digest the digest value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the repository property: The repository name of the artifact.
     *
     * @return the repository value.
     */
    public String getRepository() {
        return this.repository;
    }

    /**
     * Set the repository property: The repository name of the artifact.
     *
     * @param repository the repository value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tag property: The tag of the artifact.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag of the artifact.
     *
     * @param tag the tag value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the name property: The name of the artifact.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the artifact.
     *
     * @param name the name value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version property: The version of the artifact.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the artifact.
     *
     * @param version the version value to set.
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget setVersion(String version) {
        this.version = version;
        return this;
    }
}
