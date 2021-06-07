// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Disks. */
public interface Disks {
    /**
     * List disks in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Disk> list(String resourceGroupName, String labName, String username);

    /**
     * List disks in a given user profile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param expand Specify the $expand query. Example: 'properties($select=diskType)'.
     * @param filter The filter to apply to the operation. Example: '$filter=contains(name,'myName').
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param orderby The ordering expression for the results, using OData notation. Example: '$orderby=name desc'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a list operation.
     */
    PagedIterable<Disk> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context);

    /**
     * Get disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk.
     */
    Disk get(String resourceGroupName, String labName, String username, String name);

    /**
     * Get disk.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param expand Specify the $expand query. Example: 'properties($select=diskType)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk.
     */
    Response<Disk> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String username, String name);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String labName, String username, String name, Context context);

    /**
     * Attach and create the lease of the disk to the virtual machine. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param attachDiskProperties Properties of the disk to attach.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void attach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties);

    /**
     * Attach and create the lease of the disk to the virtual machine. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param attachDiskProperties Properties of the disk to attach.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void attach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        AttachDiskProperties attachDiskProperties,
        Context context);

    /**
     * Detach and break the lease of the disk attached to the virtual machine. This operation can take a while to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param detachDiskProperties Properties of the disk to detach.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties);

    /**
     * Detach and break the lease of the disk attached to the virtual machine. This operation can take a while to
     * complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param username The name of the user profile.
     * @param name The name of the disk.
     * @param detachDiskProperties Properties of the disk to detach.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void detach(
        String resourceGroupName,
        String labName,
        String username,
        String name,
        DetachDiskProperties detachDiskProperties,
        Context context);

    /**
     * Get disk.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk.
     */
    Disk getById(String id);

    /**
     * Get disk.
     *
     * @param id the resource ID.
     * @param expand Specify the $expand query. Example: 'properties($select=diskType)'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return disk.
     */
    Response<Disk> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete disk. This operation can take a while to complete.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Disk resource.
     *
     * @param name resource name.
     * @return the first stage of the new Disk definition.
     */
    Disk.DefinitionStages.Blank define(String name);
}
