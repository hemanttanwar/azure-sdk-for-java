// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The location of amazon S3 dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3Location")
@Fluent
public final class AmazonS3Location extends DatasetLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AmazonS3Location.class);

    /*
     * Specify the bucketName of amazon S3. Type: string (or Expression with
     * resultType string)
     */
    @JsonProperty(value = "bucketName")
    private Object bucketName;

    /*
     * Specify the version of amazon S3. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "version")
    private Object version;

    /**
     * Get the bucketName property: Specify the bucketName of amazon S3. Type: string (or Expression with resultType
     * string).
     *
     * @return the bucketName value.
     */
    public Object bucketName() {
        return this.bucketName;
    }

    /**
     * Set the bucketName property: Specify the bucketName of amazon S3. Type: string (or Expression with resultType
     * string).
     *
     * @param bucketName the bucketName value to set.
     * @return the AmazonS3Location object itself.
     */
    public AmazonS3Location withBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get the version property: Specify the version of amazon S3. Type: string (or Expression with resultType string).
     *
     * @return the version value.
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set the version property: Specify the version of amazon S3. Type: string (or Expression with resultType string).
     *
     * @param version the version value to set.
     * @return the AmazonS3Location object itself.
     */
    public AmazonS3Location withVersion(Object version) {
        this.version = version;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Location withFolderPath(Object folderPath) {
        super.withFolderPath(folderPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Location withFileName(Object fileName) {
        super.withFileName(fileName);
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
