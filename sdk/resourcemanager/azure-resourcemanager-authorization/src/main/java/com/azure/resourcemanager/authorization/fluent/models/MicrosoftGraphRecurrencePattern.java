// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** recurrencePattern. */
@Fluent
public final class MicrosoftGraphRecurrencePattern {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphRecurrencePattern.class);

    /*
     * The day of the month on which the event occurs. Required if type is
     * absoluteMonthly or absoluteYearly.
     */
    @JsonProperty(value = "dayOfMonth")
    private Integer dayOfMonth;

    /*
     * A collection of the days of the week on which the event occurs. The
     * possible values are: sunday, monday, tuesday, wednesday, thursday,
     * friday, saturday. If type is relativeMonthly or relativeYearly, and
     * daysOfWeek specifies more than one day, the event falls on the first day
     * that satisfies the pattern.  Required if type is weekly,
     * relativeMonthly, or relativeYearly.
     */
    @JsonProperty(value = "daysOfWeek")
    private List<MicrosoftGraphDayOfWeek> daysOfWeek;

    /*
     * The firstDayOfWeek property.
     */
    @JsonProperty(value = "firstDayOfWeek")
    private MicrosoftGraphDayOfWeek firstDayOfWeek;

    /*
     * The index property.
     */
    @JsonProperty(value = "index")
    private MicrosoftGraphWeekIndex index;

    /*
     * The number of units between occurrences, where units can be in days,
     * weeks, months, or years, depending on the type. Required.
     */
    @JsonProperty(value = "interval")
    private Integer interval;

    /*
     * The month in which the event occurs.  This is a number from 1 to 12.
     */
    @JsonProperty(value = "month")
    private Integer month;

    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private MicrosoftGraphRecurrencePatternType type;

    /*
     * recurrencePattern
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the dayOfMonth property: The day of the month on which the event occurs. Required if type is absoluteMonthly
     * or absoluteYearly.
     *
     * @return the dayOfMonth value.
     */
    public Integer dayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * Set the dayOfMonth property: The day of the month on which the event occurs. Required if type is absoluteMonthly
     * or absoluteYearly.
     *
     * @param dayOfMonth the dayOfMonth value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    /**
     * Get the daysOfWeek property: A collection of the days of the week on which the event occurs. The possible values
     * are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or
     * relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the
     * pattern. Required if type is weekly, relativeMonthly, or relativeYearly.
     *
     * @return the daysOfWeek value.
     */
    public List<MicrosoftGraphDayOfWeek> daysOfWeek() {
        return this.daysOfWeek;
    }

    /**
     * Set the daysOfWeek property: A collection of the days of the week on which the event occurs. The possible values
     * are: sunday, monday, tuesday, wednesday, thursday, friday, saturday. If type is relativeMonthly or
     * relativeYearly, and daysOfWeek specifies more than one day, the event falls on the first day that satisfies the
     * pattern. Required if type is weekly, relativeMonthly, or relativeYearly.
     *
     * @param daysOfWeek the daysOfWeek value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withDaysOfWeek(List<MicrosoftGraphDayOfWeek> daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    /**
     * Get the firstDayOfWeek property: The firstDayOfWeek property.
     *
     * @return the firstDayOfWeek value.
     */
    public MicrosoftGraphDayOfWeek firstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    /**
     * Set the firstDayOfWeek property: The firstDayOfWeek property.
     *
     * @param firstDayOfWeek the firstDayOfWeek value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withFirstDayOfWeek(MicrosoftGraphDayOfWeek firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
        return this;
    }

    /**
     * Get the index property: The index property.
     *
     * @return the index value.
     */
    public MicrosoftGraphWeekIndex index() {
        return this.index;
    }

    /**
     * Set the index property: The index property.
     *
     * @param index the index value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withIndex(MicrosoftGraphWeekIndex index) {
        this.index = index;
        return this;
    }

    /**
     * Get the interval property: The number of units between occurrences, where units can be in days, weeks, months, or
     * years, depending on the type. Required.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The number of units between occurrences, where units can be in days, weeks, months, or
     * years, depending on the type. Required.
     *
     * @param interval the interval value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the month property: The month in which the event occurs. This is a number from 1 to 12.
     *
     * @return the month value.
     */
    public Integer month() {
        return this.month;
    }

    /**
     * Set the month property: The month in which the event occurs. This is a number from 1 to 12.
     *
     * @param month the month value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withMonth(Integer month) {
        this.month = month;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public MicrosoftGraphRecurrencePatternType type() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withType(MicrosoftGraphRecurrencePatternType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: recurrencePattern.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: recurrencePattern.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphRecurrencePattern object itself.
     */
    public MicrosoftGraphRecurrencePattern withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
