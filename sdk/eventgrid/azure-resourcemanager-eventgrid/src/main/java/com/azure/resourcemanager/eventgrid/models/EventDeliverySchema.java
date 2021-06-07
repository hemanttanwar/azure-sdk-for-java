// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EventDeliverySchema. */
public final class EventDeliverySchema extends ExpandableStringEnum<EventDeliverySchema> {
    /** Static value EventGridSchema for EventDeliverySchema. */
    public static final EventDeliverySchema EVENT_GRID_SCHEMA = fromString("EventGridSchema");

    /** Static value CustomInputSchema for EventDeliverySchema. */
    public static final EventDeliverySchema CUSTOM_INPUT_SCHEMA = fromString("CustomInputSchema");

    /** Static value CloudEventSchemaV1_0 for EventDeliverySchema. */
    public static final EventDeliverySchema CLOUD_EVENT_SCHEMA_V1_0 = fromString("CloudEventSchemaV1_0");

    /**
     * Creates or finds a EventDeliverySchema from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EventDeliverySchema.
     */
    @JsonCreator
    public static EventDeliverySchema fromString(String name) {
        return fromString(name, EventDeliverySchema.class);
    }

    /** @return known EventDeliverySchema values. */
    public static Collection<EventDeliverySchema> values() {
        return values(EventDeliverySchema.class);
    }
}
