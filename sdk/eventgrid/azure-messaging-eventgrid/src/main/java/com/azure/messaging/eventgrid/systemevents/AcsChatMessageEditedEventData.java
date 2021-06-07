// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatMessageEdited event. */
@Fluent
public final class AcsChatMessageEditedEventData extends AcsChatMessageEventBaseProperties {
    /*
     * The body of the chat message
     */
    @JsonProperty(value = "messageBody")
    private String messageBody;

    /*
     * The time at which the message was edited
     */
    @JsonProperty(value = "editTime")
    private OffsetDateTime editTime;

    /**
     * Get the messageBody property: The body of the chat message.
     *
     * @return the messageBody value.
     */
    public String getMessageBody() {
        return this.messageBody;
    }

    /**
     * Set the messageBody property: The body of the chat message.
     *
     * @param messageBody the messageBody value to set.
     * @return the AcsChatMessageEditedEventData object itself.
     */
    public AcsChatMessageEditedEventData setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }

    /**
     * Get the editTime property: The time at which the message was edited.
     *
     * @return the editTime value.
     */
    public OffsetDateTime getEditTime() {
        return this.editTime;
    }

    /**
     * Set the editTime property: The time at which the message was edited.
     *
     * @param editTime the editTime value to set.
     * @return the AcsChatMessageEditedEventData object itself.
     */
    public AcsChatMessageEditedEventData setEditTime(OffsetDateTime editTime) {
        this.editTime = editTime;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setMessageId(String messageId) {
        super.setMessageId(messageId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setSenderCommunicationIdentifier(
            CommunicationIdentifierModel senderCommunicationIdentifier) {
        super.setSenderCommunicationIdentifier(senderCommunicationIdentifier);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setSenderDisplayName(String senderDisplayName) {
        super.setSenderDisplayName(senderDisplayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setComposeTime(OffsetDateTime composeTime) {
        super.setComposeTime(composeTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setType(String type) {
        super.setType(type);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setRecipientCommunicationIdentifier(
            CommunicationIdentifierModel recipientCommunicationIdentifier) {
        super.setRecipientCommunicationIdentifier(recipientCommunicationIdentifier);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AcsChatMessageEditedEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }
}
