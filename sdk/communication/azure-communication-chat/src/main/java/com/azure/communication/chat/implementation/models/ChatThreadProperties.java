// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Chat thread. */
@Fluent
public final class ChatThreadProperties {
    /*
     * Chat thread id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Chat thread topic.
     */
    @JsonProperty(value = "topic", required = true)
    private String topic;

    /*
     * The timestamp when the chat thread was created. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "createdOn", required = true)
    private OffsetDateTime createdOn;

    /*
     * Identifies a participant in Azure Communication services. A participant
     * is, for example, a phone number or an Azure communication user. This
     * model must be interpreted as a union: Apart from rawId, at most one
     * further property may be set.
     */
    @JsonProperty(value = "createdByCommunicationIdentifier", required = true)
    private CommunicationIdentifierModel createdByCommunicationIdentifier;

    /*
     * The timestamp when the chat thread was deleted. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "deletedOn")
    private OffsetDateTime deletedOn;

    /**
     * Get the id property: Chat thread id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Chat thread id.
     *
     * @param id the id value to set.
     * @return the ChatThreadProperties object itself.
     */
    public ChatThreadProperties setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the topic property: Chat thread topic.
     *
     * @return the topic value.
     */
    public String getTopic() {
        return this.topic;
    }

    /**
     * Set the topic property: Chat thread topic.
     *
     * @param topic the topic value to set.
     * @return the ChatThreadProperties object itself.
     */
    public ChatThreadProperties setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get the createdOn property: The timestamp when the chat thread was created. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: The timestamp when the chat thread was created. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param createdOn the createdOn value to set.
     * @return the ChatThreadProperties object itself.
     */
    public ChatThreadProperties setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the createdByCommunicationIdentifier property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model must be interpreted as a
     * union: Apart from rawId, at most one further property may be set.
     *
     * @return the createdByCommunicationIdentifier value.
     */
    public CommunicationIdentifierModel getCreatedByCommunicationIdentifier() {
        return this.createdByCommunicationIdentifier;
    }

    /**
     * Set the createdByCommunicationIdentifier property: Identifies a participant in Azure Communication services. A
     * participant is, for example, a phone number or an Azure communication user. This model must be interpreted as a
     * union: Apart from rawId, at most one further property may be set.
     *
     * @param createdByCommunicationIdentifier the createdByCommunicationIdentifier value to set.
     * @return the ChatThreadProperties object itself.
     */
    public ChatThreadProperties setCreatedByCommunicationIdentifier(
            CommunicationIdentifierModel createdByCommunicationIdentifier) {
        this.createdByCommunicationIdentifier = createdByCommunicationIdentifier;
        return this;
    }

    /**
     * Get the deletedOn property: The timestamp when the chat thread was deleted. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the deletedOn value.
     */
    public OffsetDateTime getDeletedOn() {
        return this.deletedOn;
    }

    /**
     * Set the deletedOn property: The timestamp when the chat thread was deleted. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param deletedOn the deletedOn value to set.
     * @return the ChatThreadProperties object itself.
     */
    public ChatThreadProperties setDeletedOn(OffsetDateTime deletedOn) {
        this.deletedOn = deletedOn;
        return this;
    }
}
