// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.UserGroupsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupContractInner;
import com.azure.resourcemanager.apimanagement.models.GroupContract;
import com.azure.resourcemanager.apimanagement.models.UserGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UserGroupsImpl implements UserGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserGroupsImpl.class);

    private final UserGroupsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public UserGroupsImpl(
        UserGroupsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GroupContract> list(String resourceGroupName, String serviceName, String userId) {
        PagedIterable<GroupContractInner> inner = this.serviceClient().list(resourceGroupName, serviceName, userId);
        return Utils.mapPage(inner, inner1 -> new GroupContractImpl(inner1, this.manager()));
    }

    public PagedIterable<GroupContract> list(
        String resourceGroupName,
        String serviceName,
        String userId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<GroupContractInner> inner =
            this.serviceClient().list(resourceGroupName, serviceName, userId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new GroupContractImpl(inner1, this.manager()));
    }

    private UserGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
