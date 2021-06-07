// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.QuotaByCounterKeysClient;
import com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterCollectionInner;
import com.azure.resourcemanager.apimanagement.models.QuotaByCounterKeys;
import com.azure.resourcemanager.apimanagement.models.QuotaCounterCollection;
import com.azure.resourcemanager.apimanagement.models.QuotaCounterValueUpdateContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class QuotaByCounterKeysImpl implements QuotaByCounterKeys {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotaByCounterKeysImpl.class);

    private final QuotaByCounterKeysClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public QuotaByCounterKeysImpl(
        QuotaByCounterKeysClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QuotaCounterCollection listByService(String resourceGroupName, String serviceName, String quotaCounterKey) {
        QuotaCounterCollectionInner inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, quotaCounterKey);
        if (inner != null) {
            return new QuotaCounterCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QuotaCounterCollection> listByServiceWithResponse(
        String resourceGroupName, String serviceName, String quotaCounterKey, Context context) {
        Response<QuotaCounterCollectionInner> inner =
            this.serviceClient().listByServiceWithResponse(resourceGroupName, serviceName, quotaCounterKey, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QuotaCounterCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QuotaCounterCollection update(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters) {
        QuotaCounterCollectionInner inner =
            this.serviceClient().update(resourceGroupName, serviceName, quotaCounterKey, parameters);
        if (inner != null) {
            return new QuotaCounterCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QuotaCounterCollection> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        QuotaCounterValueUpdateContract parameters,
        Context context) {
        Response<QuotaCounterCollectionInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, serviceName, quotaCounterKey, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QuotaCounterCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private QuotaByCounterKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
