// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Parameters for patching Azure Cosmos DB database account properties. */
@JsonFlatten
@Fluent
public class DatabaseAccountUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountUpdateParameters.class);

    /*
     * Tags are a list of key-value pairs that describe the resource. These
     * tags can be used in viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key no greater than 128 characters and value no greater than
     * 256 characters. For example, the default experience for a template type
     * is set with "defaultExperience": "Cassandra". Current
     * "defaultExperience" values also include "Table", "Graph", "DocumentDB",
     * and "MongoDB".
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The location of the resource group to which the resource belongs.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Identity for the resource.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * The consistency policy for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * An array that contains the georeplication locations enabled for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "properties.locations")
    private List<Location> locations;

    /*
     * List of IpRules.
     */
    @JsonProperty(value = "properties.ipRules")
    private List<IpAddressOrRange> ipRules;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "properties.enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "properties.enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C*
     * account.
     */
    @JsonProperty(value = "properties.connectorOffer")
    private ConnectorOffer connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers,
     * throughput) via account keys
     */
    @JsonProperty(value = "properties.disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /*
     * The URI of the key vault
     */
    @JsonProperty(value = "properties.keyVaultKeyUri")
    private String keyVaultKeyUri;

    /*
     * Whether requests from Public Network are allowed
     */
    @JsonProperty(value = "properties.publicNetworkAccess", access = JsonProperty.Access.WRITE_ONLY)
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Flag to indicate whether Free Tier is enabled.
     */
    @JsonProperty(value = "properties.enableFreeTier")
    private Boolean enableFreeTier;

    /*
     * API specific properties. Currently, supported only for MongoDB API.
     */
    @JsonProperty(value = "properties.apiProperties")
    private ApiProperties apiProperties;

    /*
     * Flag to indicate whether to enable storage analytics.
     */
    @JsonProperty(value = "properties.enableAnalyticalStorage")
    private Boolean enableAnalyticalStorage;

    /*
     * The object representing the policy for taking backups on an account.
     */
    @JsonProperty(value = "properties.backupPolicy")
    private BackupPolicy backupPolicy;

    /*
     * The CORS policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.cors")
    private List<CorsPolicy> cors;

    /*
     * Indicates what services are allowed to bypass firewall checks.
     */
    @JsonProperty(value = "properties.networkAclBypass")
    private NetworkAclBypass networkAclBypass;

    /*
     * An array that contains the Resource Ids for Network Acl Bypass for the
     * Cosmos DB account.
     */
    @JsonProperty(value = "properties.networkAclBypassResourceIds")
    private List<String> networkAclBypassResourceIds;

    /**
     * Get the tags property: Tags are a list of key-value pairs that describe the resource. These tags can be used in
     * viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource.
     * Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example,
     * the default experience for a template type is set with "defaultExperience": "Cassandra". Current
     * "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags are a list of key-value pairs that describe the resource. These tags can be used in
     * viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource.
     * Each tag must have a key no greater than 128 characters and value no greater than 256 characters. For example,
     * the default experience for a template type is set with "defaultExperience": "Cassandra". Current
     * "defaultExperience" values also include "Table", "Graph", "DocumentDB", and "MongoDB".
     *
     * @param tags the tags value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the location property: The location of the resource group to which the resource belongs.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the resource group to which the resource belongs.
     *
     * @param location the location value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the identity property: Identity for the resource.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the resource.
     *
     * @param identity the identity value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     *
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: An array that contains the georeplication locations enabled for the Cosmos DB
     * account.
     *
     * @param locations the locations value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     *
     * @return the ipRules value.
     */
    public List<IpAddressOrRange> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     *
     * @param ipRules the ipRules value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIpRules(List<IpAddressOrRange> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Get the keyVaultKeyUri property: The URI of the key vault.
     *
     * @return the keyVaultKeyUri value.
     */
    public String keyVaultKeyUri() {
        return this.keyVaultKeyUri;
    }

    /**
     * Set the keyVaultKeyUri property: The URI of the key vault.
     *
     * @param keyVaultKeyUri the keyVaultKeyUri value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withKeyVaultKeyUri(String keyVaultKeyUri) {
        this.keyVaultKeyUri = keyVaultKeyUri;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Get the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @return the enableFreeTier value.
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }

    /**
     * Set the enableFreeTier property: Flag to indicate whether Free Tier is enabled.
     *
     * @param enableFreeTier the enableFreeTier value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableFreeTier(Boolean enableFreeTier) {
        this.enableFreeTier = enableFreeTier;
        return this;
    }

    /**
     * Get the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     *
     * @return the apiProperties value.
     */
    public ApiProperties apiProperties() {
        return this.apiProperties;
    }

    /**
     * Set the apiProperties property: API specific properties. Currently, supported only for MongoDB API.
     *
     * @param apiProperties the apiProperties value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withApiProperties(ApiProperties apiProperties) {
        this.apiProperties = apiProperties;
        return this;
    }

    /**
     * Get the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @return the enableAnalyticalStorage value.
     */
    public Boolean enableAnalyticalStorage() {
        return this.enableAnalyticalStorage;
    }

    /**
     * Set the enableAnalyticalStorage property: Flag to indicate whether to enable storage analytics.
     *
     * @param enableAnalyticalStorage the enableAnalyticalStorage value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withEnableAnalyticalStorage(Boolean enableAnalyticalStorage) {
        this.enableAnalyticalStorage = enableAnalyticalStorage;
        return this;
    }

    /**
     * Get the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @return the backupPolicy value.
     */
    public BackupPolicy backupPolicy() {
        return this.backupPolicy;
    }

    /**
     * Set the backupPolicy property: The object representing the policy for taking backups on an account.
     *
     * @param backupPolicy the backupPolicy value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
        return this;
    }

    /**
     * Get the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @return the cors value.
     */
    public List<CorsPolicy> cors() {
        return this.cors;
    }

    /**
     * Set the cors property: The CORS policy for the Cosmos DB database account.
     *
     * @param cors the cors value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withCors(List<CorsPolicy> cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @return the networkAclBypass value.
     */
    public NetworkAclBypass networkAclBypass() {
        return this.networkAclBypass;
    }

    /**
     * Set the networkAclBypass property: Indicates what services are allowed to bypass firewall checks.
     *
     * @param networkAclBypass the networkAclBypass value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withNetworkAclBypass(NetworkAclBypass networkAclBypass) {
        this.networkAclBypass = networkAclBypass;
        return this;
    }

    /**
     * Get the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @return the networkAclBypassResourceIds value.
     */
    public List<String> networkAclBypassResourceIds() {
        return this.networkAclBypassResourceIds;
    }

    /**
     * Set the networkAclBypassResourceIds property: An array that contains the Resource Ids for Network Acl Bypass for
     * the Cosmos DB account.
     *
     * @param networkAclBypassResourceIds the networkAclBypassResourceIds value to set.
     * @return the DatabaseAccountUpdateParameters object itself.
     */
    public DatabaseAccountUpdateParameters withNetworkAclBypassResourceIds(List<String> networkAclBypassResourceIds) {
        this.networkAclBypassResourceIds = networkAclBypassResourceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (consistencyPolicy() != null) {
            consistencyPolicy().validate();
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (apiProperties() != null) {
            apiProperties().validate();
        }
        if (backupPolicy() != null) {
            backupPolicy().validate();
        }
        if (cors() != null) {
            cors().forEach(e -> e.validate());
        }
    }
}
