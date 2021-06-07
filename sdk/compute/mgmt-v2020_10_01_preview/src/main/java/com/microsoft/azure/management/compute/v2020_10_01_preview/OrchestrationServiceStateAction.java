/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OrchestrationServiceStateAction.
 */
public final class OrchestrationServiceStateAction extends ExpandableStringEnum<OrchestrationServiceStateAction> {
    /** Static value Resume for OrchestrationServiceStateAction. */
    public static final OrchestrationServiceStateAction RESUME = fromString("Resume");

    /** Static value Suspend for OrchestrationServiceStateAction. */
    public static final OrchestrationServiceStateAction SUSPEND = fromString("Suspend");

    /**
     * Creates or finds a OrchestrationServiceStateAction from its string representation.
     * @param name a name to look for
     * @return the corresponding OrchestrationServiceStateAction
     */
    @JsonCreator
    public static OrchestrationServiceStateAction fromString(String name) {
        return fromString(name, OrchestrationServiceStateAction.class);
    }

    /**
     * @return known OrchestrationServiceStateAction values
     */
    public static Collection<OrchestrationServiceStateAction> values() {
        return values(OrchestrationServiceStateAction.class);
    }
}
