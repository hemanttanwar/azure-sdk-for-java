// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServicePrincipalsExpand. */
public final class ServicePrincipalsExpand extends ExpandableStringEnum<ServicePrincipalsExpand> {
    /** Static value * for ServicePrincipalsExpand. */
    public static final ServicePrincipalsExpand ASTERISK = fromString("*");

    /** Static value appliesTo for ServicePrincipalsExpand. */
    public static final ServicePrincipalsExpand APPLIES_TO = fromString("appliesTo");

    /**
     * Creates or finds a ServicePrincipalsExpand from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServicePrincipalsExpand.
     */
    @JsonCreator
    public static ServicePrincipalsExpand fromString(String name) {
        return fromString(name, ServicePrincipalsExpand.class);
    }

    /** @return known ServicePrincipalsExpand values. */
    public static Collection<ServicePrincipalsExpand> values() {
        return values(ServicePrincipalsExpand.class);
    }
}
