// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the uploadPagesFromURL operation. */
public final class PageBlobsUploadPagesFromURLResponse extends ResponseBase<PageBlobsUploadPagesFromURLHeaders, Void> {
    /**
     * Creates an instance of PageBlobsUploadPagesFromURLResponse.
     *
     * @param request the request which resulted in this PageBlobsUploadPagesFromURLResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PageBlobsUploadPagesFromURLResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            PageBlobsUploadPagesFromURLHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
