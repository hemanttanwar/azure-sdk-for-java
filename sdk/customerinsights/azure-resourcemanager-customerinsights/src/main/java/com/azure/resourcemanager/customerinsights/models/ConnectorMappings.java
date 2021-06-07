// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ConnectorMappings. */
public interface ConnectorMappings {
    /**
     * Gets a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector mapping in the connector.
     */
    ConnectorMappingResourceFormat get(
        String resourceGroupName, String hubName, String connectorName, String mappingName);

    /**
     * Gets a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector mapping in the connector.
     */
    Response<ConnectorMappingResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String connectorName, String mappingName, Context context);

    /**
     * Deletes a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hubName, String connectorName, String mappingName);

    /**
     * Deletes a connector mapping in the connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param mappingName The name of the connector mapping.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String hubName, String connectorName, String mappingName, Context context);

    /**
     * Gets all the connector mappings in the specified connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connector mappings in the specified connector.
     */
    PagedIterable<ConnectorMappingResourceFormat> listByConnector(
        String resourceGroupName, String hubName, String connectorName);

    /**
     * Gets all the connector mappings in the specified connector.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param connectorName The name of the connector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connector mappings in the specified connector.
     */
    PagedIterable<ConnectorMappingResourceFormat> listByConnector(
        String resourceGroupName, String hubName, String connectorName, Context context);

    /**
     * Gets a connector mapping in the connector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector mapping in the connector.
     */
    ConnectorMappingResourceFormat getById(String id);

    /**
     * Gets a connector mapping in the connector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connector mapping in the connector.
     */
    Response<ConnectorMappingResourceFormat> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a connector mapping in the connector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a connector mapping in the connector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ConnectorMappingResourceFormat resource.
     *
     * @param name resource name.
     * @return the first stage of the new ConnectorMappingResourceFormat definition.
     */
    ConnectorMappingResourceFormat.DefinitionStages.Blank define(String name);
}
