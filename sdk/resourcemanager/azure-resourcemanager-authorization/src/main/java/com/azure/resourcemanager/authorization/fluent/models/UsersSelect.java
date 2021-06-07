// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UsersSelect. */
public final class UsersSelect extends ExpandableStringEnum<UsersSelect> {
    /** Static value id for UsersSelect. */
    public static final UsersSelect ID = fromString("id");

    /** Static value deletedDateTime for UsersSelect. */
    public static final UsersSelect DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value appRoleId for UsersSelect. */
    public static final UsersSelect APP_ROLE_ID = fromString("appRoleId");

    /** Static value createdDateTime for UsersSelect. */
    public static final UsersSelect CREATED_DATE_TIME = fromString("createdDateTime");

    /** Static value principalDisplayName for UsersSelect. */
    public static final UsersSelect PRINCIPAL_DISPLAY_NAME = fromString("principalDisplayName");

    /** Static value principalId for UsersSelect. */
    public static final UsersSelect PRINCIPAL_ID = fromString("principalId");

    /** Static value principalType for UsersSelect. */
    public static final UsersSelect PRINCIPAL_TYPE = fromString("principalType");

    /** Static value resourceDisplayName for UsersSelect. */
    public static final UsersSelect RESOURCE_DISPLAY_NAME = fromString("resourceDisplayName");

    /** Static value resourceId for UsersSelect. */
    public static final UsersSelect RESOURCE_ID = fromString("resourceId");

    /**
     * Creates or finds a UsersSelect from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UsersSelect.
     */
    @JsonCreator
    public static UsersSelect fromString(String name) {
        return fromString(name, UsersSelect.class);
    }

    /** @return known UsersSelect values. */
    public static Collection<UsersSelect> values() {
        return values(UsersSelect.class);
    }
}
