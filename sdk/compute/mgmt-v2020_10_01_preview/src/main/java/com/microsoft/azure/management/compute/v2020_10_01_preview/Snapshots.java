/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.SnapshotsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Snapshots.
 */
public interface Snapshots extends SupportsCreating<Snapshot.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<Snapshot>, SupportsListingByResourceGroup<Snapshot>, SupportsListing<Snapshot>, HasInner<SnapshotsInner> {
    /**
     * Grants access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @param grantAccessData Access data object supplied in the body of the get snapshot access operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessUri> grantAccessAsync(String resourceGroupName, String snapshotName, GrantAccessData grantAccessData);

    /**
     * Revokes access to a snapshot.
     *
     * @param resourceGroupName The name of the resource group.
     * @param snapshotName The name of the snapshot that is being created. The name can't be changed after the snapshot is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The max name length is 80 characters.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable revokeAccessAsync(String resourceGroupName, String snapshotName);

}
