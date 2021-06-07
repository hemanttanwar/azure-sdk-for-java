// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.AuthPlatform;
import com.azure.resourcemanager.appservice.models.GlobalValidation;
import com.azure.resourcemanager.appservice.models.HttpSettings;
import com.azure.resourcemanager.appservice.models.IdentityProviders;
import com.azure.resourcemanager.appservice.models.Login;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SiteAuthSettingsV2 model. */
@JsonFlatten
@Fluent
public class SiteAuthSettingsV2Inner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SiteAuthSettingsV2Inner.class);

    /*
     * The platform property.
     */
    @JsonProperty(value = "properties.platform")
    private AuthPlatform platform;

    /*
     * The globalValidation property.
     */
    @JsonProperty(value = "properties.globalValidation")
    private GlobalValidation globalValidation;

    /*
     * The identityProviders property.
     */
    @JsonProperty(value = "properties.identityProviders")
    private IdentityProviders identityProviders;

    /*
     * The login property.
     */
    @JsonProperty(value = "properties.login")
    private Login login;

    /*
     * The httpSettings property.
     */
    @JsonProperty(value = "properties.httpSettings")
    private HttpSettings httpSettings;

    /**
     * Get the platform property: The platform property.
     *
     * @return the platform value.
     */
    public AuthPlatform platform() {
        return this.platform;
    }

    /**
     * Set the platform property: The platform property.
     *
     * @param platform the platform value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withPlatform(AuthPlatform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the globalValidation property: The globalValidation property.
     *
     * @return the globalValidation value.
     */
    public GlobalValidation globalValidation() {
        return this.globalValidation;
    }

    /**
     * Set the globalValidation property: The globalValidation property.
     *
     * @param globalValidation the globalValidation value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withGlobalValidation(GlobalValidation globalValidation) {
        this.globalValidation = globalValidation;
        return this;
    }

    /**
     * Get the identityProviders property: The identityProviders property.
     *
     * @return the identityProviders value.
     */
    public IdentityProviders identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set the identityProviders property: The identityProviders property.
     *
     * @param identityProviders the identityProviders value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withIdentityProviders(IdentityProviders identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    /**
     * Get the login property: The login property.
     *
     * @return the login value.
     */
    public Login login() {
        return this.login;
    }

    /**
     * Set the login property: The login property.
     *
     * @param login the login value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withLogin(Login login) {
        this.login = login;
        return this;
    }

    /**
     * Get the httpSettings property: The httpSettings property.
     *
     * @return the httpSettings value.
     */
    public HttpSettings httpSettings() {
        return this.httpSettings;
    }

    /**
     * Set the httpSettings property: The httpSettings property.
     *
     * @param httpSettings the httpSettings value to set.
     * @return the SiteAuthSettingsV2Inner object itself.
     */
    public SiteAuthSettingsV2Inner withHttpSettings(HttpSettings httpSettings) {
        this.httpSettings = httpSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SiteAuthSettingsV2Inner withKind(String kind) {
        super.withKind(kind);
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
        if (platform() != null) {
            platform().validate();
        }
        if (globalValidation() != null) {
            globalValidation().validate();
        }
        if (identityProviders() != null) {
            identityProviders().validate();
        }
        if (login() != null) {
            login().validate();
        }
        if (httpSettings() != null) {
            httpSettings().validate();
        }
    }
}
