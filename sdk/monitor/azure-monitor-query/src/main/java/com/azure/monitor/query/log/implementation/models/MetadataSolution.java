// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Solutions can group tables and functions that are associated with a certain Azure Log Analytics offering. */
@Fluent
public final class MetadataSolution {
    /*
     * The ID of the Log Analytics solution
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The name of the Log Analytics solution
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The display name of the Log Analytics solution
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the Log Analytics solution
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The tags that are associated with the Log Analytics solution
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /*
     * The properties of the Log Analytics solution
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * The related metadata items for the Log Analytics solution
     */
    @JsonProperty(value = "related", required = true)
    private MetadataSolutionRelated related;

    /**
     * Creates an instance of MetadataSolution class.
     *
     * @param id the id value to set.
     * @param name the name value to set.
     * @param related the related value to set.
     */
    @JsonCreator
    public MetadataSolution(
            @JsonProperty(value = "id", required = true) String id,
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "related", required = true) MetadataSolutionRelated related) {
        this.id = id;
        this.name = name;
        this.related = related;
    }

    /**
     * Get the id property: The ID of the Log Analytics solution.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of the Log Analytics solution.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the displayName property: The display name of the Log Analytics solution.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the Log Analytics solution.
     *
     * @param displayName the displayName value to set.
     * @return the MetadataSolution object itself.
     */
    public MetadataSolution setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the Log Analytics solution.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description of the Log Analytics solution.
     *
     * @param description the description value to set.
     * @return the MetadataSolution object itself.
     */
    public MetadataSolution setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the tags property: The tags that are associated with the Log Analytics solution.
     *
     * @return the tags value.
     */
    public Object getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that are associated with the Log Analytics solution.
     *
     * @param tags the tags value to set.
     * @return the MetadataSolution object itself.
     */
    public MetadataSolution setTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: The properties of the Log Analytics solution.
     *
     * @return the properties value.
     */
    public Object getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the Log Analytics solution.
     *
     * @param properties the properties value to set.
     * @return the MetadataSolution object itself.
     */
    public MetadataSolution setProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the related property: The related metadata items for the Log Analytics solution.
     *
     * @return the related value.
     */
    public MetadataSolutionRelated getRelated() {
        return this.related;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getId() == null) {
            throw new IllegalArgumentException("Missing required property id in model MetadataSolution");
        }
        if (getName() == null) {
            throw new IllegalArgumentException("Missing required property name in model MetadataSolution");
        }
        if (getRelated() == null) {
            throw new IllegalArgumentException("Missing required property related in model MetadataSolution");
        } else {
            getRelated().validate();
        }
    }
}
