// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.fluent.StorageAccountsClient;
import com.azure.resourcemanager.machinelearningservices.fluent.models.ListStorageAccountKeysResultInner;
import com.azure.resourcemanager.machinelearningservices.models.ListStorageAccountKeysResult;
import com.azure.resourcemanager.machinelearningservices.models.StorageAccounts;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class StorageAccountsImpl implements StorageAccounts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountsImpl.class);

    private final StorageAccountsClient innerClient;

    private final com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager;

    public StorageAccountsImpl(
        StorageAccountsClient innerClient,
        com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ListStorageAccountKeysResult listKeys(String resourceGroupName, String workspaceName) {
        ListStorageAccountKeysResultInner inner = this.serviceClient().listKeys(resourceGroupName, workspaceName);
        if (inner != null) {
            return new ListStorageAccountKeysResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ListStorageAccountKeysResult> listKeysWithResponse(
        String resourceGroupName, String workspaceName, Context context) {
        Response<ListStorageAccountKeysResultInner> inner =
            this.serviceClient().listKeysWithResponse(resourceGroupName, workspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ListStorageAccountKeysResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private StorageAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearningservices.MachineLearningServicesManager manager() {
        return this.serviceManager;
    }
}
