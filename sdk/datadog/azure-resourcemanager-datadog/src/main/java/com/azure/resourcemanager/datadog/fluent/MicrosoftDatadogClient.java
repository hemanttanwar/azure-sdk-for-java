// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for MicrosoftDatadogClient class. */
public interface MicrosoftDatadogClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the MarketplaceAgreementsClient object to access its operations.
     *
     * @return the MarketplaceAgreementsClient object.
     */
    MarketplaceAgreementsClient getMarketplaceAgreements();

    /**
     * Gets the MonitorsClient object to access its operations.
     *
     * @return the MonitorsClient object.
     */
    MonitorsClient getMonitors();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the TagRulesClient object to access its operations.
     *
     * @return the TagRulesClient object.
     */
    TagRulesClient getTagRules();

    /**
     * Gets the SingleSignOnConfigurationsClient object to access its operations.
     *
     * @return the SingleSignOnConfigurationsClient object.
     */
    SingleSignOnConfigurationsClient getSingleSignOnConfigurations();
}
