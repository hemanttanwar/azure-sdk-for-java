// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.models.StorageInsightInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list storage insights operation response. */
@Fluent
public final class StorageInsightListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageInsightListResult.class);

    /*
     * A list of storage insight items.
     */
    @JsonProperty(value = "value")
    private List<StorageInsightInner> value;

    /*
     * The link (url) to the next page of results.
     */
    @JsonProperty(value = "@odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: A list of storage insight items.
     *
     * @return the value value.
     */
    public List<StorageInsightInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of storage insight items.
     *
     * @param value the value value to set.
     * @return the StorageInsightListResult object itself.
     */
    public StorageInsightListResult withValue(List<StorageInsightInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: The link (url) to the next page of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The link (url) to the next page of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the StorageInsightListResult object itself.
     */
    public StorageInsightListResult withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
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
