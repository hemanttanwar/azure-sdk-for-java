// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** JPEG image encoding. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.ImageFormatJpeg")
@Fluent
public final class ImageFormatJpeg extends ImageFormatProperties {
    /*
     * Image quality value between 0 to 100 (best quality).
     */
    @JsonProperty(value = "quality")
    private String quality;

    /**
     * Get the quality property: Image quality value between 0 to 100 (best quality).
     *
     * @return the quality value.
     */
    public String getQuality() {
        return this.quality;
    }

    /**
     * Set the quality property: Image quality value between 0 to 100 (best quality).
     *
     * @param quality the quality value to set.
     * @return the ImageFormatJpeg object itself.
     */
    public ImageFormatJpeg setQuality(String quality) {
        this.quality = quality;
        return this;
    }
}
