// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BEK is bitlocker encryption key. */
@Fluent
public final class BekDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BekDetails.class);

    /*
     * Secret is BEK.
     */
    @JsonProperty(value = "secretUrl")
    private String secretUrl;

    /*
     * ID of the Key Vault where this Secret is stored.
     */
    @JsonProperty(value = "secretVaultId")
    private String secretVaultId;

    /*
     * BEK data.
     */
    @JsonProperty(value = "secretData")
    private String secretData;

    /**
     * Get the secretUrl property: Secret is BEK.
     *
     * @return the secretUrl value.
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl property: Secret is BEK.
     *
     * @param secretUrl the secretUrl value to set.
     * @return the BekDetails object itself.
     */
    public BekDetails withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get the secretVaultId property: ID of the Key Vault where this Secret is stored.
     *
     * @return the secretVaultId value.
     */
    public String secretVaultId() {
        return this.secretVaultId;
    }

    /**
     * Set the secretVaultId property: ID of the Key Vault where this Secret is stored.
     *
     * @param secretVaultId the secretVaultId value to set.
     * @return the BekDetails object itself.
     */
    public BekDetails withSecretVaultId(String secretVaultId) {
        this.secretVaultId = secretVaultId;
        return this;
    }

    /**
     * Get the secretData property: BEK data.
     *
     * @return the secretData value.
     */
    public String secretData() {
        return this.secretData;
    }

    /**
     * Set the secretData property: BEK data.
     *
     * @param secretData the secretData value to set.
     * @return the BekDetails object itself.
     */
    public BekDetails withSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
