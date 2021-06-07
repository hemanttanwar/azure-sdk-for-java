// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.QuotaByPeriodKeysClient;
import com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterContractInner;
import com.azure.resourcemanager.apimanagement.models.QuotaByPeriodKeys;
import com.azure.resourcemanager.apimanagement.models.QuotaCounterContract;
import com.azure.resourcemanager.apimanagement.models.QuotaCounterValueUpdateContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class QuotaByPeriodKeysImpl implements QuotaByPeriodKeys {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotaByPeriodKeysImpl.class);

    private final QuotaByPeriodKeysClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public QuotaByPeriodKeysImpl(
        QuotaByPeriodKeysClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public QuotaCounterContract get(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey) {
        QuotaCounterContractInner inner =
            this.serviceClient().get(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey);
        if (inner != null) {
            return new QuotaCounterContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QuotaCounterContract> getWithResponse(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey, Context context) {
        Response<QuotaCounterContractInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QuotaCounterContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public QuotaCounterContract update(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters) {
        QuotaCounterContractInner inner =
            this.serviceClient().update(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, parameters);
        if (inner != null) {
            return new QuotaCounterContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<QuotaCounterContract> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters,
        Context context) {
        Response<QuotaCounterContractInner> inner =
            this
                .serviceClient()
                .updateWithResponse(
                    resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new QuotaCounterContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private QuotaByPeriodKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
