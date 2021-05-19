// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ChannelName. */
public enum ChannelName {
    /** Enum value AlexaChannel. */
    ALEXA_CHANNEL("AlexaChannel"),

    /** Enum value FacebookChannel. */
    FACEBOOK_CHANNEL("FacebookChannel"),

    /** Enum value EmailChannel. */
    EMAIL_CHANNEL("EmailChannel"),

    /** Enum value KikChannel. */
    KIK_CHANNEL("KikChannel"),

    /** Enum value TelegramChannel. */
    TELEGRAM_CHANNEL("TelegramChannel"),

    /** Enum value SlackChannel. */
    SLACK_CHANNEL("SlackChannel"),

    /** Enum value MsTeamsChannel. */
    MS_TEAMS_CHANNEL("MsTeamsChannel"),

    /** Enum value SkypeChannel. */
    SKYPE_CHANNEL("SkypeChannel"),

    /** Enum value WebChatChannel. */
    WEB_CHAT_CHANNEL("WebChatChannel"),

    /** Enum value DirectLineChannel. */
    DIRECT_LINE_CHANNEL("DirectLineChannel"),

    /** Enum value SmsChannel. */
    SMS_CHANNEL("SmsChannel"),

    /** Enum value LineChannel. */
    LINE_CHANNEL("LineChannel"),

    /** Enum value DirectLineSpeechChannel. */
    DIRECT_LINE_SPEECH_CHANNEL("DirectLineSpeechChannel");

    /** The actual serialized value for a ChannelName instance. */
    private final String value;

    ChannelName(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ChannelName instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ChannelName object, or null if unable to parse.
     */
    @JsonCreator
    public static ChannelName fromString(String value) {
        ChannelName[] items = ChannelName.values();
        for (ChannelName item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
