// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems model. */
@Fluent
public final class Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems.class);

    /*
     * The dateTime property.
     */
    @JsonProperty(value = "dateTime")
    private OffsetDateTime dateTime;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private Float value;

    /**
     * Get the dateTime property: The dateTime property.
     *
     * @return the dateTime value.
     */
    public OffsetDateTime dateTime() {
        return this.dateTime;
    }

    /**
     * Set the dateTime property: The dateTime property.
     *
     * @param dateTime the dateTime value to set.
     * @return the Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems object itself.
     */
    public Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems withDateTime(
        OffsetDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public Float value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems object itself.
     */
    public Components18OrqelSchemasWafmetricsresponsePropertiesSeriesItemsPropertiesDataItems withValue(Float value) {
        this.value = value;
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
