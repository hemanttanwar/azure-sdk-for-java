// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.util.List;

/** Describes all the properties for encoding a video with the H.265 codec. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.H265Video")
@JsonFlatten
@Fluent
public class H265Video extends Video {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(H265Video.class);

    /*
     * Specifies whether or not the encoder should insert key frames at scene
     * changes. If not specified, the default is false. This flag should be set
     * to true only when the encoder is being configured to produce a single
     * output video.
     */
    @JsonProperty(value = "sceneChangeDetection")
    private Boolean sceneChangeDetection;

    /*
     * Tells the encoder how to choose its encoding settings.  Quality will
     * provide for a higher compression ratio but at a higher cost and longer
     * compute time.  Speed will produce a relatively larger file but is faster
     * and more economical. The default value is Balanced.
     */
    @JsonProperty(value = "complexity")
    private H265Complexity complexity;

    /*
     * The collection of output H.265 layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<H265Layer> layers;

    /**
     * Get the sceneChangeDetection property: Specifies whether or not the encoder should insert key frames at scene
     * changes. If not specified, the default is false. This flag should be set to true only when the encoder is being
     * configured to produce a single output video.
     *
     * @return the sceneChangeDetection value.
     */
    public Boolean sceneChangeDetection() {
        return this.sceneChangeDetection;
    }

    /**
     * Set the sceneChangeDetection property: Specifies whether or not the encoder should insert key frames at scene
     * changes. If not specified, the default is false. This flag should be set to true only when the encoder is being
     * configured to produce a single output video.
     *
     * @param sceneChangeDetection the sceneChangeDetection value to set.
     * @return the H265Video object itself.
     */
    public H265Video withSceneChangeDetection(Boolean sceneChangeDetection) {
        this.sceneChangeDetection = sceneChangeDetection;
        return this;
    }

    /**
     * Get the complexity property: Tells the encoder how to choose its encoding settings. Quality will provide for a
     * higher compression ratio but at a higher cost and longer compute time. Speed will produce a relatively larger
     * file but is faster and more economical. The default value is Balanced.
     *
     * @return the complexity value.
     */
    public H265Complexity complexity() {
        return this.complexity;
    }

    /**
     * Set the complexity property: Tells the encoder how to choose its encoding settings. Quality will provide for a
     * higher compression ratio but at a higher cost and longer compute time. Speed will produce a relatively larger
     * file but is faster and more economical. The default value is Balanced.
     *
     * @param complexity the complexity value to set.
     * @return the H265Video object itself.
     */
    public H265Video withComplexity(H265Complexity complexity) {
        this.complexity = complexity;
        return this;
    }

    /**
     * Get the layers property: The collection of output H.265 layers to be produced by the encoder.
     *
     * @return the layers value.
     */
    public List<H265Layer> layers() {
        return this.layers;
    }

    /**
     * Set the layers property: The collection of output H.265 layers to be produced by the encoder.
     *
     * @param layers the layers value to set.
     * @return the H265Video object itself.
     */
    public H265Video withLayers(List<H265Layer> layers) {
        this.layers = layers;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Video withKeyFrameInterval(Duration keyFrameInterval) {
        super.withKeyFrameInterval(keyFrameInterval);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Video withStretchMode(StretchMode stretchMode) {
        super.withStretchMode(stretchMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Video withSyncMode(VideoSyncMode syncMode) {
        super.withSyncMode(syncMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H265Video withLabel(String label) {
        super.withLabel(label);
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
        if (layers() != null) {
            layers().forEach(e -> e.validate());
        }
    }
}
