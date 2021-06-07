// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.resourcemanager.resourcemover.fluent.models.UnresolvedDependencyInner;

/** An immutable client-side representation of UnresolvedDependency. */
public interface UnresolvedDependency {
    /**
     * Gets the count property: Gets or sets the count.
     *
     * @return the count value.
     */
    Integer count();

    /**
     * Gets the id property: Gets or sets the arm id of the dependency.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.resourcemover.fluent.models.UnresolvedDependencyInner object.
     *
     * @return the inner object.
     */
    UnresolvedDependencyInner innerModel();
}
