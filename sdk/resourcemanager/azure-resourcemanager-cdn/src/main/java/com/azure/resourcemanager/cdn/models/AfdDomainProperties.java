// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JSON object that contains the properties of the domain to create. */
@Fluent
public final class AfdDomainProperties extends AfdDomainUpdatePropertiesParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AfdDomainProperties.class);

    /*
     * Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step. DCV stands for
     * DomainControlValidation.
     */
    @JsonProperty(value = "domainValidationState", access = JsonProperty.Access.WRITE_ONLY)
    private DomainValidationState domainValidationState;

    /*
     * The host name of the domain. Must be a domain name.
     */
    @JsonProperty(value = "hostName", required = true)
    private String hostname;

    /*
     * Values the customer needs to validate domain ownership
     */
    @JsonProperty(value = "validationProperties", access = JsonProperty.Access.WRITE_ONLY)
    private DomainValidationProperties validationProperties;

    /*
     * Provisioning status
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /**
     * Get the domainValidationState property: Provisioning substate shows the progress of custom HTTPS
     * enabling/disabling process step by step. DCV stands for DomainControlValidation.
     *
     * @return the domainValidationState value.
     */
    public DomainValidationState domainValidationState() {
        return this.domainValidationState;
    }

    /**
     * Get the hostname property: The host name of the domain. Must be a domain name.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The host name of the domain. Must be a domain name.
     *
     * @param hostname the hostname value to set.
     * @return the AfdDomainProperties object itself.
     */
    public AfdDomainProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the validationProperties property: Values the customer needs to validate domain ownership.
     *
     * @return the validationProperties value.
     */
    public DomainValidationProperties validationProperties() {
        return this.validationProperties;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /** {@inheritDoc} */
    @Override
    public AfdDomainProperties withTlsSettings(AfdDomainHttpsParameters tlsSettings) {
        super.withTlsSettings(tlsSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AfdDomainProperties withAzureDnsZone(ResourceReference azureDnsZone) {
        super.withAzureDnsZone(azureDnsZone);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (hostname() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property hostname in model AfdDomainProperties"));
        }
        if (validationProperties() != null) {
            validationProperties().validate();
        }
    }
}
