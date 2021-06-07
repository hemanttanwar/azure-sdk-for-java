// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.fluent.models.IotHubQuotaMetricInfoInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JSON-serialized array of IotHubQuotaMetricInfo objects with a next link. */
@Fluent
public final class IotHubQuotaMetricInfoListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotHubQuotaMetricInfoListResult.class);

    /*
     * The array of quota metrics objects.
     */
    @JsonProperty(value = "value")
    private List<IotHubQuotaMetricInfoInner> value;

    /*
     * The next link.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The array of quota metrics objects.
     *
     * @return the value value.
     */
    public List<IotHubQuotaMetricInfoInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The array of quota metrics objects.
     *
     * @param value the value value to set.
     * @return the IotHubQuotaMetricInfoListResult object itself.
     */
    public IotHubQuotaMetricInfoListResult withValue(List<IotHubQuotaMetricInfoInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
