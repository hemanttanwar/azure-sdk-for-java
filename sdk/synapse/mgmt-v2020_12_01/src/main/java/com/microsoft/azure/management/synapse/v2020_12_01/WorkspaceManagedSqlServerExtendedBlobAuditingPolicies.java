/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020_12_01.implementation.WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspaceManagedSqlServerExtendedBlobAuditingPolicies.
 */
public interface WorkspaceManagedSqlServerExtendedBlobAuditingPolicies extends SupportsCreating<ExtendedServerBlobAuditingPolicy.DefinitionStages.Blank>, HasInner<WorkspaceManagedSqlServerExtendedBlobAuditingPoliciesInner> {
    /**
     * Get server's extended blob auditing policy.
     * Get a workspace SQL server's extended blob auditing policy.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExtendedServerBlobAuditingPolicy> getAsync(String resourceGroupName, String workspaceName);

    /**
     * List server's extended blob auditing policies.
     * List workspace managed sql server's extended blob auditing policies.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExtendedServerBlobAuditingPolicy> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName);

}
