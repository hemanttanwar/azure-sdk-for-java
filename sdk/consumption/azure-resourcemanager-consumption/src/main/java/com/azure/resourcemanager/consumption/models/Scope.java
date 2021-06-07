// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Scope. */
public final class Scope extends ExpandableStringEnum<Scope> {
    /** Static value Single for Scope. */
    public static final Scope SINGLE = fromString("Single");

    /** Static value Shared for Scope. */
    public static final Scope SHARED = fromString("Shared");

    /**
     * Creates or finds a Scope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Scope.
     */
    @JsonCreator
    public static Scope fromString(String name) {
        return fromString(name, Scope.class);
    }

    /** @return known Scope values. */
    public static Collection<Scope> values() {
        return values(Scope.class);
    }
}
