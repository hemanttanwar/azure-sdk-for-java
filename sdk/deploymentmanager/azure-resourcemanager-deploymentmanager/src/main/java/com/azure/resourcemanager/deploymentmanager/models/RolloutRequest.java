// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deploymentmanager.fluent.models.RolloutRequestInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of RolloutRequest. */
public interface RolloutRequest {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    Identity identity();

    /**
     * Gets the buildVersion property: The version of the build being deployed.
     *
     * @return the buildVersion value.
     */
    String buildVersion();

    /**
     * Gets the artifactSourceId property: The reference to the artifact source resource Id where the payload is
     * located.
     *
     * @return the artifactSourceId value.
     */
    String artifactSourceId();

    /**
     * Gets the targetServiceTopologyId property: The resource Id of the service topology from which service units are
     * being referenced in step groups to be deployed.
     *
     * @return the targetServiceTopologyId value.
     */
    String targetServiceTopologyId();

    /**
     * Gets the stepGroups property: The list of step groups that define the orchestration.
     *
     * @return the stepGroups value.
     */
    List<StepGroup> stepGroups();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.deploymentmanager.fluent.models.RolloutRequestInner object.
     *
     * @return the inner object.
     */
    RolloutRequestInner innerModel();

    /** The entirety of the RolloutRequest definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithIdentity,
            DefinitionStages.WithBuildVersion,
            DefinitionStages.WithTargetServiceTopologyId,
            DefinitionStages.WithStepGroups,
            DefinitionStages.WithCreate {
    }
    /** The RolloutRequest definition stages. */
    interface DefinitionStages {
        /** The first stage of the RolloutRequest definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the RolloutRequest definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the RolloutRequest definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithIdentity withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the RolloutRequest definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            WithBuildVersion withIdentity(Identity identity);
        }
        /** The stage of the RolloutRequest definition allowing to specify buildVersion. */
        interface WithBuildVersion {
            /**
             * Specifies the buildVersion property: The version of the build being deployed..
             *
             * @param buildVersion The version of the build being deployed.
             * @return the next definition stage.
             */
            WithTargetServiceTopologyId withBuildVersion(String buildVersion);
        }
        /** The stage of the RolloutRequest definition allowing to specify targetServiceTopologyId. */
        interface WithTargetServiceTopologyId {
            /**
             * Specifies the targetServiceTopologyId property: The resource Id of the service topology from which
             * service units are being referenced in step groups to be deployed..
             *
             * @param targetServiceTopologyId The resource Id of the service topology from which service units are being
             *     referenced in step groups to be deployed.
             * @return the next definition stage.
             */
            WithStepGroups withTargetServiceTopologyId(String targetServiceTopologyId);
        }
        /** The stage of the RolloutRequest definition allowing to specify stepGroups. */
        interface WithStepGroups {
            /**
             * Specifies the stepGroups property: The list of step groups that define the orchestration..
             *
             * @param stepGroups The list of step groups that define the orchestration.
             * @return the next definition stage.
             */
            WithCreate withStepGroups(List<StepGroup> stepGroups);
        }
        /**
         * The stage of the RolloutRequest definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithArtifactSourceId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            RolloutRequest create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            RolloutRequest create(Context context);
        }
        /** The stage of the RolloutRequest definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the RolloutRequest definition allowing to specify artifactSourceId. */
        interface WithArtifactSourceId {
            /**
             * Specifies the artifactSourceId property: The reference to the artifact source resource Id where the
             * payload is located..
             *
             * @param artifactSourceId The reference to the artifact source resource Id where the payload is located.
             * @return the next definition stage.
             */
            WithCreate withArtifactSourceId(String artifactSourceId);
        }
    }
    /**
     * Begins update for the RolloutRequest resource.
     *
     * @return the stage of resource update.
     */
    RolloutRequest.Update update();

    /** The template for RolloutRequest update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithBuildVersion,
            UpdateStages.WithArtifactSourceId,
            UpdateStages.WithTargetServiceTopologyId,
            UpdateStages.WithStepGroups {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        RolloutRequest apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        RolloutRequest apply(Context context);
    }
    /** The RolloutRequest update stages. */
    interface UpdateStages {
        /** The stage of the RolloutRequest update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the RolloutRequest update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity for the resource..
             *
             * @param identity Identity for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(Identity identity);
        }
        /** The stage of the RolloutRequest update allowing to specify buildVersion. */
        interface WithBuildVersion {
            /**
             * Specifies the buildVersion property: The version of the build being deployed..
             *
             * @param buildVersion The version of the build being deployed.
             * @return the next definition stage.
             */
            Update withBuildVersion(String buildVersion);
        }
        /** The stage of the RolloutRequest update allowing to specify artifactSourceId. */
        interface WithArtifactSourceId {
            /**
             * Specifies the artifactSourceId property: The reference to the artifact source resource Id where the
             * payload is located..
             *
             * @param artifactSourceId The reference to the artifact source resource Id where the payload is located.
             * @return the next definition stage.
             */
            Update withArtifactSourceId(String artifactSourceId);
        }
        /** The stage of the RolloutRequest update allowing to specify targetServiceTopologyId. */
        interface WithTargetServiceTopologyId {
            /**
             * Specifies the targetServiceTopologyId property: The resource Id of the service topology from which
             * service units are being referenced in step groups to be deployed..
             *
             * @param targetServiceTopologyId The resource Id of the service topology from which service units are being
             *     referenced in step groups to be deployed.
             * @return the next definition stage.
             */
            Update withTargetServiceTopologyId(String targetServiceTopologyId);
        }
        /** The stage of the RolloutRequest update allowing to specify stepGroups. */
        interface WithStepGroups {
            /**
             * Specifies the stepGroups property: The list of step groups that define the orchestration..
             *
             * @param stepGroups The list of step groups that define the orchestration.
             * @return the next definition stage.
             */
            Update withStepGroups(List<StepGroup> stepGroups);
        }
    }
    /**
     * Only running rollouts can be canceled.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    Rollout cancel();

    /**
     * Only running rollouts can be canceled.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    Response<Rollout> cancelWithResponse(Context context);

    /**
     * Only failed rollouts can be restarted.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    Rollout restart();

    /**
     * Only failed rollouts can be restarted.
     *
     * @param skipSucceeded If true, will skip all succeeded steps so far in the rollout. If false, will execute the
     *     entire rollout again regardless of the current state of individual resources. Defaults to false if not
     *     specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the rollout.
     */
    Response<Rollout> restartWithResponse(Boolean skipSucceeded, Context context);
}
