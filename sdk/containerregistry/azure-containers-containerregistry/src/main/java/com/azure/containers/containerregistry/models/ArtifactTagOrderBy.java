// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ArtifactTagOrderBy. */
public final class ArtifactTagOrderBy extends ExpandableStringEnum<ArtifactTagOrderBy> {
    /** Static value none for ArtifactTagOrderBy. */
    public static final ArtifactTagOrderBy NONE = fromString("none");

    /** Static value timedesc for ArtifactTagOrderBy. */
    public static final ArtifactTagOrderBy LAST_UPDATED_ON_DESCENDING = fromString("timedesc");

    /** Static value timeasc for ArtifactTagOrderBy. */
    public static final ArtifactTagOrderBy LAST_UPDATED_ON_ASCENDING = fromString("timeasc");

    /**
     * Creates or finds a ArtifactTagOrderBy from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArtifactTagOrderBy.
     */
    @JsonCreator
    public static ArtifactTagOrderBy fromString(String name) {
        return fromString(name, ArtifactTagOrderBy.class);
    }

    /** @return known ArtifactTagOrderBy values. */
    public static Collection<ArtifactTagOrderBy> values() {
        return values(ArtifactTagOrderBy.class);
    }
}
