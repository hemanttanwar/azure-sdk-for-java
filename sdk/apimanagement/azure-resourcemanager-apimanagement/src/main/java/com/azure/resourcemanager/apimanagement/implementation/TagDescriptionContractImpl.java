// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.TagDescriptionContractInner;
import com.azure.resourcemanager.apimanagement.models.TagDescriptionContract;
import com.azure.resourcemanager.apimanagement.models.TagDescriptionCreateParameters;

public final class TagDescriptionContractImpl
    implements TagDescriptionContract, TagDescriptionContract.Definition, TagDescriptionContract.Update {
    private TagDescriptionContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String externalDocsUrl() {
        return this.innerModel().externalDocsUrl();
    }

    public String externalDocsDescription() {
        return this.innerModel().externalDocsDescription();
    }

    public String tagId() {
        return this.innerModel().tagId();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public TagDescriptionContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String apiId;

    private String tagDescriptionId;

    private String createIfMatch;

    private TagDescriptionCreateParameters createParameters;

    private String updateIfMatch;

    private TagDescriptionCreateParameters updateParameters;

    public TagDescriptionContractImpl withExistingApi(String resourceGroupName, String serviceName, String apiId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.apiId = apiId;
        return this;
    }

    public TagDescriptionContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiTagDescriptions()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    apiId,
                    tagDescriptionId,
                    createParameters,
                    createIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public TagDescriptionContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiTagDescriptions()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, apiId, tagDescriptionId, createParameters, createIfMatch, context)
                .getValue();
        return this;
    }

    TagDescriptionContractImpl(
        String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new TagDescriptionContractInner();
        this.serviceManager = serviceManager;
        this.tagDescriptionId = name;
        this.createIfMatch = null;
        this.createParameters = new TagDescriptionCreateParameters();
    }

    public TagDescriptionContractImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new TagDescriptionCreateParameters();
        return this;
    }

    public TagDescriptionContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiTagDescriptions()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    serviceName,
                    apiId,
                    tagDescriptionId,
                    updateParameters,
                    updateIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public TagDescriptionContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiTagDescriptions()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, apiId, tagDescriptionId, updateParameters, updateIfMatch, context)
                .getValue();
        return this;
    }

    TagDescriptionContractImpl(
        TagDescriptionContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.apiId = Utils.getValueFromIdByName(innerObject.id(), "apis");
        this.tagDescriptionId = Utils.getValueFromIdByName(innerObject.id(), "tagDescriptions");
    }

    public TagDescriptionContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiTagDescriptions()
                .getWithResponse(resourceGroupName, serviceName, apiId, tagDescriptionId, Context.NONE)
                .getValue();
        return this;
    }

    public TagDescriptionContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApiTagDescriptions()
                .getWithResponse(resourceGroupName, serviceName, apiId, tagDescriptionId, context)
                .getValue();
        return this;
    }

    public TagDescriptionContractImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public TagDescriptionContractImpl withExternalDocsUrl(String externalDocsUrl) {
        if (isInCreateMode()) {
            this.createParameters.withExternalDocsUrl(externalDocsUrl);
            return this;
        } else {
            this.updateParameters.withExternalDocsUrl(externalDocsUrl);
            return this;
        }
    }

    public TagDescriptionContractImpl withExternalDocsDescription(String externalDocsDescription) {
        if (isInCreateMode()) {
            this.createParameters.withExternalDocsDescription(externalDocsDescription);
            return this;
        } else {
            this.updateParameters.withExternalDocsDescription(externalDocsDescription);
            return this;
        }
    }

    public TagDescriptionContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
