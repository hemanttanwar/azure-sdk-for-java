/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudServiceVaultAndSecretReference model.
 */
public class CloudServiceVaultAndSecretReference {
    /**
     * The sourceVault property.
     */
    @JsonProperty(value = "sourceVault")
    private SubResource sourceVault;

    /**
     * The secretUrl property.
     */
    @JsonProperty(value = "secretUrl")
    private String secretUrl;

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public SubResource sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     * @return the CloudServiceVaultAndSecretReference object itself.
     */
    public CloudServiceVaultAndSecretReference withSourceVault(SubResource sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the secretUrl value.
     *
     * @return the secretUrl value
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set the secretUrl value.
     *
     * @param secretUrl the secretUrl value to set
     * @return the CloudServiceVaultAndSecretReference object itself.
     */
    public CloudServiceVaultAndSecretReference withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

}
