// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mixedreality.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.mixedreality.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.mixedreality.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.mixedreality.models.ResourceProviders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.mixedreality.MixedRealityManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient,
        com.azure.resourcemanager.mixedreality.MixedRealityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityResponse checkNameAvailabilityLocal(
        String location, CheckNameAvailabilityRequest checkNameAvailability) {
        CheckNameAvailabilityResponseInner inner =
            this.serviceClient().checkNameAvailabilityLocal(location, checkNameAvailability);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponse> checkNameAvailabilityLocalWithResponse(
        String location, CheckNameAvailabilityRequest checkNameAvailability, Context context) {
        Response<CheckNameAvailabilityResponseInner> inner =
            this.serviceClient().checkNameAvailabilityLocalWithResponse(location, checkNameAvailability, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mixedreality.MixedRealityManager manager() {
        return this.serviceManager;
    }
}
