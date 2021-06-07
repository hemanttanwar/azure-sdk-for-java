// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of HanaInstances. */
public interface HanaInstances {
    /**
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of
     * each SAP HANA on Azure instance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription.
     */
    PagedIterable<HanaInstance> list();

    /**
     * Gets a list of SAP HANA instances in the specified subscription. The operations returns various properties of
     * each SAP HANA on Azure instance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription.
     */
    PagedIterable<HanaInstance> list(Context context);

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns
     * various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription and the resource group.
     */
    PagedIterable<HanaInstance> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of SAP HANA instances in the specified subscription and the resource group. The operations returns
     * various properties of each SAP HANA on Azure instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of SAP HANA instances in the specified subscription and the resource group.
     */
    PagedIterable<HanaInstance> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     */
    HanaInstance getByResourceGroup(String resourceGroupName, String hanaInstanceName);

    /**
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     */
    Response<HanaInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String hanaInstanceName);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to restart a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to start a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to start a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * The operation to shutdown a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void shutdown(String resourceGroupName, String hanaInstanceName);

    /**
     * The operation to shutdown a SAP HANA instance.
     *
     * @param resourceGroupName Name of the resource group.
     * @param hanaInstanceName Name of the SAP HANA on Azure instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void shutdown(String resourceGroupName, String hanaInstanceName, Context context);

    /**
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     */
    HanaInstance getById(String id);

    /**
     * Gets properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a SAP HANA instance for the specified subscription, resource group, and instance name.
     */
    Response<HanaInstance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a SAP HANA instance with the specified subscription, resource group, and instance name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new HanaInstance resource.
     *
     * @param name resource name.
     * @return the first stage of the new HanaInstance definition.
     */
    HanaInstance.DefinitionStages.Blank define(String name);
}
