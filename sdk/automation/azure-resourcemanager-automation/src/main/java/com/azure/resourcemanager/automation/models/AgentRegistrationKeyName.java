// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AgentRegistrationKeyName. */
public final class AgentRegistrationKeyName extends ExpandableStringEnum<AgentRegistrationKeyName> {
    /** Static value primary for AgentRegistrationKeyName. */
    public static final AgentRegistrationKeyName PRIMARY = fromString("primary");

    /** Static value secondary for AgentRegistrationKeyName. */
    public static final AgentRegistrationKeyName SECONDARY = fromString("secondary");

    /**
     * Creates or finds a AgentRegistrationKeyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AgentRegistrationKeyName.
     */
    @JsonCreator
    public static AgentRegistrationKeyName fromString(String name) {
        return fromString(name, AgentRegistrationKeyName.class);
    }

    /** @return known AgentRegistrationKeyName values. */
    public static Collection<AgentRegistrationKeyName> values() {
        return values(AgentRegistrationKeyName.class);
    }
}
