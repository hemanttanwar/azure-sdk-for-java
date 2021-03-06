// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AfdEndpointProtocols. */
public final class AfdEndpointProtocols extends ExpandableStringEnum<AfdEndpointProtocols> {
    /** Static value Http for AfdEndpointProtocols. */
    public static final AfdEndpointProtocols HTTP = fromString("Http");

    /** Static value Https for AfdEndpointProtocols. */
    public static final AfdEndpointProtocols HTTPS = fromString("Https");

    /**
     * Creates or finds a AfdEndpointProtocols from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AfdEndpointProtocols.
     */
    @JsonCreator
    public static AfdEndpointProtocols fromString(String name) {
        return fromString(name, AfdEndpointProtocols.class);
    }

    /** @return known AfdEndpointProtocols values. */
    public static Collection<AfdEndpointProtocols> values() {
        return values(AfdEndpointProtocols.class);
    }
}
