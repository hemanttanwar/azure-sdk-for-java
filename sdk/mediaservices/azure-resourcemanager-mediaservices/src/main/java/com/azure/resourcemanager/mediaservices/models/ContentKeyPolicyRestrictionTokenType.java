// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ContentKeyPolicyRestrictionTokenType. */
public final class ContentKeyPolicyRestrictionTokenType
    extends ExpandableStringEnum<ContentKeyPolicyRestrictionTokenType> {
    /** Static value Unknown for ContentKeyPolicyRestrictionTokenType. */
    public static final ContentKeyPolicyRestrictionTokenType UNKNOWN = fromString("Unknown");

    /** Static value Swt for ContentKeyPolicyRestrictionTokenType. */
    public static final ContentKeyPolicyRestrictionTokenType SWT = fromString("Swt");

    /** Static value Jwt for ContentKeyPolicyRestrictionTokenType. */
    public static final ContentKeyPolicyRestrictionTokenType JWT = fromString("Jwt");

    /**
     * Creates or finds a ContentKeyPolicyRestrictionTokenType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentKeyPolicyRestrictionTokenType.
     */
    @JsonCreator
    public static ContentKeyPolicyRestrictionTokenType fromString(String name) {
        return fromString(name, ContentKeyPolicyRestrictionTokenType.class);
    }

    /** @return known ContentKeyPolicyRestrictionTokenType values. */
    public static Collection<ContentKeyPolicyRestrictionTokenType> values() {
        return values(ContentKeyPolicyRestrictionTokenType.class);
    }
}
