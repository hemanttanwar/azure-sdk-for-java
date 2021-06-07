/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Linked service reference type.
 */
public class LinkedServiceReference {
    /**
     * Linked service reference type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Reference LinkedService name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /**
     * Arguments for LinkedService.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /**
     * Creates an instance of LinkedServiceReference class.
     */
    public LinkedServiceReference() {
        type = "LinkedServiceReference";
    }

    /**
     * Get linked service reference type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set linked service reference type.
     *
     * @param type the type value to set
     * @return the LinkedServiceReference object itself.
     */
    public LinkedServiceReference withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get reference LinkedService name.
     *
     * @return the referenceName value
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set reference LinkedService name.
     *
     * @param referenceName the referenceName value to set
     * @return the LinkedServiceReference object itself.
     */
    public LinkedServiceReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get arguments for LinkedService.
     *
     * @return the parameters value
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set arguments for LinkedService.
     *
     * @param parameters the parameters value to set
     * @return the LinkedServiceReference object itself.
     */
    public LinkedServiceReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

}
