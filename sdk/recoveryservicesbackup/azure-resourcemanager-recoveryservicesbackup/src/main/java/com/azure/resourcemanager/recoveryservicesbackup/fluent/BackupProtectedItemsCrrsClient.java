// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;

/** An instance of this class provides access to all the operations defined in BackupProtectedItemsCrrsClient. */
public interface BackupProtectedItemsCrrsClient {
    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectedItemResourceInner> list(String vaultName, String resourceGroupName);

    /**
     * Provides a pageable list of all items that are backed up within a vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param skipToken skipToken Filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of ProtectedItem resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ProtectedItemResourceInner> list(
        String vaultName, String resourceGroupName, String filter, String skipToken, Context context);
}
