/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a DocumentDB output data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = DocumentDbOutputDataSource.class)
@JsonTypeName("Microsoft.Storage/DocumentDB")
@JsonFlatten
public class DocumentDbOutputDataSource extends OutputDataSource {
    /**
     * The DocumentDB account name or ID. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.accountId")
    private String accountId;

    /**
     * The account key for the DocumentDB account. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.accountKey")
    private String accountKey;

    /**
     * The name of the DocumentDB database. Required on PUT (CreateOrReplace)
     * requests.
     */
    @JsonProperty(value = "properties.database")
    private String database;

    /**
     * The collection name pattern for the collections to be used. The
     * collection name format can be constructed using the optional {partition}
     * token, where partitions start from 0. See the DocumentDB section of
     * https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output
     * for more information. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.collectionNamePattern")
    private String collectionNamePattern;

    /**
     * The name of the field in output events used to specify the key for
     * partitioning output across collections. If 'collectionNamePattern'
     * contains the {partition} token, this property is required to be
     * specified.
     */
    @JsonProperty(value = "properties.partitionKey")
    private String partitionKey;

    /**
     * The name of the field in output events used to specify the primary key
     * which insert or update operations are based on.
     */
    @JsonProperty(value = "properties.documentId")
    private String documentId;

    /**
     * Get the DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountId value
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Set the DocumentDB account name or ID. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountId the accountId value to set
     * @return the DocumentDbOutputDataSource object itself.
     */
    public DocumentDbOutputDataSource withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get the account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     *
     * @return the accountKey value
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the account key for the DocumentDB account. Required on PUT (CreateOrReplace) requests.
     *
     * @param accountKey the accountKey value to set
     * @return the DocumentDbOutputDataSource object itself.
     */
    public DocumentDbOutputDataSource withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     *
     * @return the database value
     */
    public String database() {
        return this.database;
    }

    /**
     * Set the name of the DocumentDB database. Required on PUT (CreateOrReplace) requests.
     *
     * @param database the database value to set
     * @return the DocumentDbOutputDataSource object itself.
     */
    public DocumentDbOutputDataSource withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     *
     * @return the collectionNamePattern value
     */
    public String collectionNamePattern() {
        return this.collectionNamePattern;
    }

    /**
     * Set the collection name pattern for the collections to be used. The collection name format can be constructed using the optional {partition} token, where partitions start from 0. See the DocumentDB section of https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for more information. Required on PUT (CreateOrReplace) requests.
     *
     * @param collectionNamePattern the collectionNamePattern value to set
     * @return the DocumentDbOutputDataSource object itself.
     */
    public DocumentDbOutputDataSource withCollectionNamePattern(String collectionNamePattern) {
        this.collectionNamePattern = collectionNamePattern;
        return this;
    }

    /**
     * Get the name of the field in output events used to specify the key for partitioning output across collections. If 'collectionNamePattern' contains the {partition} token, this property is required to be specified.
     *
     * @return the partitionKey value
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the name of the field in output events used to specify the key for partitioning output across collections. If 'collectionNamePattern' contains the {partition} token, this property is required to be specified.
     *
     * @param partitionKey the partitionKey value to set
     * @return the DocumentDbOutputDataSource object itself.
     */
    public DocumentDbOutputDataSource withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get the name of the field in output events used to specify the primary key which insert or update operations are based on.
     *
     * @return the documentId value
     */
    public String documentId() {
        return this.documentId;
    }

    /**
     * Set the name of the field in output events used to specify the primary key which insert or update operations are based on.
     *
     * @param documentId the documentId value to set
     * @return the DocumentDbOutputDataSource object itself.
     */
    public DocumentDbOutputDataSource withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

}
