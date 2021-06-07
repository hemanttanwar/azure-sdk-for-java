// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CosmosDbServicePrincipalCredentialType. */
public final class CosmosDbServicePrincipalCredentialType
    extends ExpandableStringEnum<CosmosDbServicePrincipalCredentialType> {
    /** Static value ServicePrincipalKey for CosmosDbServicePrincipalCredentialType. */
    public static final CosmosDbServicePrincipalCredentialType SERVICE_PRINCIPAL_KEY =
        fromString("ServicePrincipalKey");

    /** Static value ServicePrincipalCert for CosmosDbServicePrincipalCredentialType. */
    public static final CosmosDbServicePrincipalCredentialType SERVICE_PRINCIPAL_CERT =
        fromString("ServicePrincipalCert");

    /**
     * Creates or finds a CosmosDbServicePrincipalCredentialType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CosmosDbServicePrincipalCredentialType.
     */
    @JsonCreator
    public static CosmosDbServicePrincipalCredentialType fromString(String name) {
        return fromString(name, CosmosDbServicePrincipalCredentialType.class);
    }

    /** @return known CosmosDbServicePrincipalCredentialType values. */
    public static Collection<CosmosDbServicePrincipalCredentialType> values() {
        return values(CosmosDbServicePrincipalCredentialType.class);
    }
}
