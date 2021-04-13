// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.fluent.CreditsClient;
import com.azure.resourcemanager.consumption.fluent.models.CreditSummaryInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CreditsClient. */
public final class CreditsClientImpl implements CreditsClient {
    private final ClientLogger logger = new ClientLogger(CreditsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final CreditsService service;

    /** The service client containing this operation class. */
    private final ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of CreditsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CreditsClientImpl(ConsumptionManagementClientImpl client) {
        this.service = RestProxy.create(CreditsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ConsumptionManagementClientCredits to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ConsumptionManagemen")
    private interface CreditsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{scope}/providers/Microsoft.Consumption/credits/balanceSummary")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CreditSummaryInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "scope", encoded = true) String scope,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param scope The scope associated with credits operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CreditSummaryInner>> getWithResponseAsync(String scope) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(), scope, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param scope The scope associated with credits operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CreditSummaryInner>> getWithResponseAsync(String scope, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (scope == null) {
            return Mono.error(new IllegalArgumentException("Parameter scope is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), scope, accept, context);
    }

    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param scope The scope associated with credits operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<CreditSummaryInner> getAsync(String scope) {
        return getWithResponseAsync(scope)
            .flatMap(
                (Response<CreditSummaryInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param scope The scope associated with credits operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreditSummaryInner get(String scope) {
        return getAsync(scope).block();
    }

    /**
     * The credit summary by billingAccountId and billingProfileId.
     *
     * @param scope The scope associated with credits operations. This includes
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfile/{billingProfileId}' for
     *     Billing Profile scope, and
     *     'providers/Microsoft.Billing/billingAccounts/{billingAccountId}/customers/{customerId}' specific for
     *     partners.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a credit summary resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CreditSummaryInner> getWithResponse(String scope, Context context) {
        return getWithResponseAsync(scope, context).block();
    }
}
