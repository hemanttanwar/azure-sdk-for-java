// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.storage.queue.models.QueueServiceStatistics;

/** Contains all response data for the getStatistics operation. */
public final class ServicesGetStatisticsResponse
        extends ResponseBase<ServicesGetStatisticsHeaders, QueueServiceStatistics> {
    /**
     * Creates an instance of ServicesGetStatisticsResponse.
     *
     * @param request the request which resulted in this ServicesGetStatisticsResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public ServicesGetStatisticsResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            QueueServiceStatistics value,
            ServicesGetStatisticsHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public QueueServiceStatistics getValue() {
        return super.getValue();
    }
}
