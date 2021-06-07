// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.metricsnamespaces.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/** Initializes a new instance of the MetricsNamespacesClient type. */
public final class MetricsNamespacesClientImpl {
    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The MetricNamespacesImpl object to access its operations. */
    private final MetricNamespacesImpl metricNamespaces;

    /**
     * Gets the MetricNamespacesImpl object to access its operations.
     *
     * @return the MetricNamespacesImpl object.
     */
    public MetricNamespacesImpl getMetricNamespaces() {
        return this.metricNamespaces;
    }

    /**
     * Initializes an instance of MetricsNamespacesClient client.
     *
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    MetricsNamespacesClientImpl(String host, String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host,
                apiVersion);
    }

    /**
     * Initializes an instance of MetricsNamespacesClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    MetricsNamespacesClientImpl(HttpPipeline httpPipeline, String host, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host, apiVersion);
    }

    /**
     * Initializes an instance of MetricsNamespacesClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     * @param apiVersion Api Version.
     */
    MetricsNamespacesClientImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.apiVersion = apiVersion;
        this.metricNamespaces = new MetricNamespacesImpl(this);
    }
}
