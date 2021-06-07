// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.DomainProvisioningState;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InputSchema;
import com.azure.resourcemanager.eventgrid.models.InputSchemaMapping;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** EventGrid Domain. */
@JsonFlatten
@Fluent
public class DomainInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DomainInner.class);

    /*
     * The system metadata relating to Domain resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * List of private endpoint connections.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * Provisioning state of the domain.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DomainProvisioningState provisioningState;

    /*
     * Endpoint for the domain.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /*
     * This determines the format that Event Grid should expect for incoming
     * events published to the domain.
     */
    @JsonProperty(value = "properties.inputSchema")
    private InputSchema inputSchema;

    /*
     * Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     */
    @JsonProperty(value = "properties.inputSchemaMapping")
    private InputSchemaMapping inputSchemaMapping;

    /*
     * Metric resource id for the domain.
     */
    @JsonProperty(value = "properties.metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /*
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring <seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules"
     * />
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * This can be used to restrict traffic from specific IPs instead of all
     * IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "properties.inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /**
     * Get the systemData property: The system metadata relating to Domain resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the provisioningState property: Provisioning state of the domain.
     *
     * @return the provisioningState value.
     */
    public DomainProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the endpoint property: Endpoint for the domain.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the domain.
     *
     * @return the inputSchema value.
     */
    public InputSchema inputSchema() {
        return this.inputSchema;
    }

    /**
     * Set the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the domain.
     *
     * @param inputSchema the inputSchema value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * Get the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @return the inputSchemaMapping value.
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.inputSchemaMapping;
    }

    /**
     * Set the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inputSchemaMapping = inputSchemaMapping;
        return this;
    }

    /**
     * Get the metricResourceId property: Metric resource id for the domain.
     *
     * @return the metricResourceId value.
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs. Note:
     * These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set.
     * @return the DomainInner object itself.
     */
    public DomainInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (inputSchemaMapping() != null) {
            inputSchemaMapping().validate();
        }
        if (inboundIpRules() != null) {
            inboundIpRules().forEach(e -> e.validate());
        }
    }
}
