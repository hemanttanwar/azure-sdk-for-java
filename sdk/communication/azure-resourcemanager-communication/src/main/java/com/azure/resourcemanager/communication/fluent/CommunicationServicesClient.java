// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceKeysInner;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceResourceInner;
import com.azure.resourcemanager.communication.fluent.models.LinkedNotificationHubInner;
import com.azure.resourcemanager.communication.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.communication.models.LinkNotificationHubParameters;
import com.azure.resourcemanager.communication.models.NameAvailabilityParameters;
import com.azure.resourcemanager.communication.models.RegenerateKeyParameters;

/** An instance of this class provides access to all the operations defined in CommunicationServicesClient. */
public interface CommunicationServicesClient {
    /**
     * Checks that the CommunicationService name is valid and is not already in use.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to check name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NameAvailabilityInner checkNameAvailability();

    /**
     * Checks that the CommunicationService name is valid and is not already in use.
     *
     * @param nameAvailabilityParameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to check name availability.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NameAvailabilityInner> checkNameAvailabilityWithResponse(
        NameAvailabilityParameters nameAvailabilityParameters, Context context);

    /**
     * Links an Azure Notification Hub to this communication service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a notification hub that has been linked to the communication service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LinkedNotificationHubInner linkNotificationHub(String resourceGroupName, String communicationServiceName);

    /**
     * Links an Azure Notification Hub to this communication service.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param linkNotificationHubParameters Parameters supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a notification hub that has been linked to the communication service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LinkedNotificationHubInner> linkNotificationHubWithResponse(
        String resourceGroupName,
        String communicationServiceName,
        LinkNotificationHubParameters linkNotificationHubParameters,
        Context context);

    /**
     * Handles requests to list all resources in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of CommunicationServices and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CommunicationServiceResourceInner> list();

    /**
     * Handles requests to list all resources in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of CommunicationServices and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CommunicationServiceResourceInner> list(Context context);

    /**
     * Handles requests to list all resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of CommunicationServices and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CommunicationServiceResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Handles requests to list all resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of CommunicationServices and a possible link for next set.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CommunicationServiceResourceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Operation to update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceResourceInner update(String resourceGroupName, String communicationServiceName);

    /**
     * Operation to update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CommunicationServiceResourceInner> updateWithResponse(
        String resourceGroupName,
        String communicationServiceName,
        CommunicationServiceResourceInner parameters,
        Context context);

    /**
     * Get the CommunicationService and its properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CommunicationService and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceResourceInner getByResourceGroup(String resourceGroupName, String communicationServiceName);

    /**
     * Get the CommunicationService and its properties.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the CommunicationService and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CommunicationServiceResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String communicationServiceName, Context context);

    /**
     * Create a new CommunicationService or update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CommunicationServiceResourceInner>, CommunicationServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String communicationServiceName, CommunicationServiceResourceInner parameters);

    /**
     * Create a new CommunicationService or update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CommunicationServiceResourceInner>, CommunicationServiceResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String communicationServiceName,
        CommunicationServiceResourceInner parameters,
        Context context);

    /**
     * Create a new CommunicationService or update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameters for the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceResourceInner createOrUpdate(
        String resourceGroupName, String communicationServiceName, CommunicationServiceResourceInner parameters);

    /**
     * Create a new CommunicationService or update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceResourceInner createOrUpdate(String resourceGroupName, String communicationServiceName);

    /**
     * Create a new CommunicationService or update an existing CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameters for the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing a CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceResourceInner createOrUpdate(
        String resourceGroupName,
        String communicationServiceName,
        CommunicationServiceResourceInner parameters,
        Context context);

    /**
     * Operation to delete a CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String communicationServiceName);

    /**
     * Operation to delete a CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String communicationServiceName, Context context);

    /**
     * Operation to delete a CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String communicationServiceName);

    /**
     * Operation to delete a CommunicationService.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String communicationServiceName, Context context);

    /**
     * Get the access keys of the CommunicationService resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys of the CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceKeysInner listKeys(String resourceGroupName, String communicationServiceName);

    /**
     * Get the access keys of the CommunicationService resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the access keys of the CommunicationService resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CommunicationServiceKeysInner> listKeysWithResponse(
        String resourceGroupName, String communicationServiceName, Context context);

    /**
     * Regenerate CommunicationService access key. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing the access keys of a CommunicationService.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CommunicationServiceKeysInner regenerateKey(
        String resourceGroupName, String communicationServiceName, RegenerateKeyParameters parameters);

    /**
     * Regenerate CommunicationService access key. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param communicationServiceName The name of the CommunicationService resource.
     * @param parameters Parameter that describes the Regenerate Key Operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a class representing the access keys of a CommunicationService.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CommunicationServiceKeysInner> regenerateKeyWithResponse(
        String resourceGroupName, String communicationServiceName, RegenerateKeyParameters parameters, Context context);
}
