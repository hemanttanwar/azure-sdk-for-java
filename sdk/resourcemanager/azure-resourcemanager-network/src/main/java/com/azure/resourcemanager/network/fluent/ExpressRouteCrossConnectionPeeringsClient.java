// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ExpressRouteCrossConnectionPeeringsClient.
 */
public interface ExpressRouteCrossConnectionPeeringsClient {
    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ExpressRouteCrossConnectionPeeringInner> listAsync(String resourceGroupName, String crossConnectionName);

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionPeeringInner> list(String resourceGroupName, String crossConnectionName);

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionPeeringInner> list(
        String resourceGroupName, String crossConnectionName, Context context);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String crossConnectionName, String peeringName, Context context);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String crossConnectionName, String peeringName, Context context);

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ExpressRouteCrossConnectionPeeringInner>> getWithResponseAsync(
        String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteCrossConnectionPeeringInner> getAsync(
        String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionPeeringInner get(
        String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCrossConnectionPeeringInner> getWithResponse(
        String resourceGroupName, String crossConnectionName, String peeringName, Context context);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String crossConnectionName,
        String peeringName,
        ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ExpressRouteCrossConnectionPeeringInner>, ExpressRouteCrossConnectionPeeringInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String crossConnectionName,
            String peeringName,
            ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteCrossConnectionPeeringInner>, ExpressRouteCrossConnectionPeeringInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String crossConnectionName,
            String peeringName,
            ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ExpressRouteCrossConnectionPeeringInner>, ExpressRouteCrossConnectionPeeringInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String crossConnectionName,
            String peeringName,
            ExpressRouteCrossConnectionPeeringInner peeringParameters,
            Context context);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ExpressRouteCrossConnectionPeeringInner> createOrUpdateAsync(
        String resourceGroupName,
        String crossConnectionName,
        String peeringName,
        ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionPeeringInner createOrUpdate(
        String resourceGroupName,
        String crossConnectionName,
        String peeringName,
        ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering
     *     operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionPeeringInner createOrUpdate(
        String resourceGroupName,
        String crossConnectionName,
        String peeringName,
        ExpressRouteCrossConnectionPeeringInner peeringParameters,
        Context context);
}
