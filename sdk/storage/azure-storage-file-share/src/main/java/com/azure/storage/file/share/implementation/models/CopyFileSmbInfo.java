// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.storage.file.share.models.PermissionCopyModeType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** Parameter group. */
@Fluent
@JacksonXmlRootElement(localName = "copy-file-smb-info")
public final class CopyFileSmbInfo {
    /*
     * Specifies the option to copy file security descriptor from source file
     * or to set it using the value which is defined by the header value of
     * x-ms-file-permission or x-ms-file-permission-key.
     */
    @JsonProperty(value = "filePermissionCopyMode")
    private PermissionCopyModeType filePermissionCopyMode;

    /*
     * Specifies the option to overwrite the target file if it already exists
     * and has read-only attribute set.
     */
    @JsonProperty(value = "ignoreReadOnly")
    private Boolean ignoreReadOnly;

    /*
     * Specifies either the option to copy file attributes from a source
     * file(source) to a target file or a list of attributes to set on a target
     * file.
     */
    @JsonProperty(value = "fileAttributes")
    private String fileAttributes;

    /*
     * Specifies either the option to copy file creation time from a source
     * file(source) to a target file or a time value in ISO 8601 format to set
     * as creation time on a target file.
     */
    @JsonProperty(value = "fileCreationTime")
    private String fileCreationTime;

    /*
     * Specifies either the option to copy file last write time from a source
     * file(source) to a target file or a time value in ISO 8601 format to set
     * as last write time on a target file.
     */
    @JsonProperty(value = "fileLastWriteTime")
    private String fileLastWriteTime;

    /*
     * Specifies the option to set archive attribute on a target file. True
     * means archive attribute will be set on a target file despite attribute
     * overrides or a source file state.
     */
    @JsonProperty(value = "setArchiveAttribute")
    private Boolean setArchiveAttribute;

    /**
     * Get the filePermissionCopyMode property: Specifies the option to copy file security descriptor from source file
     * or to set it using the value which is defined by the header value of x-ms-file-permission or
     * x-ms-file-permission-key.
     *
     * @return the filePermissionCopyMode value.
     */
    public PermissionCopyModeType getFilePermissionCopyMode() {
        return this.filePermissionCopyMode;
    }

    /**
     * Set the filePermissionCopyMode property: Specifies the option to copy file security descriptor from source file
     * or to set it using the value which is defined by the header value of x-ms-file-permission or
     * x-ms-file-permission-key.
     *
     * @param filePermissionCopyMode the filePermissionCopyMode value to set.
     * @return the CopyFileSmbInfo object itself.
     */
    public CopyFileSmbInfo setFilePermissionCopyMode(PermissionCopyModeType filePermissionCopyMode) {
        this.filePermissionCopyMode = filePermissionCopyMode;
        return this;
    }

    /**
     * Get the ignoreReadOnly property: Specifies the option to overwrite the target file if it already exists and has
     * read-only attribute set.
     *
     * @return the ignoreReadOnly value.
     */
    public Boolean isIgnoreReadOnly() {
        return this.ignoreReadOnly;
    }

    /**
     * Set the ignoreReadOnly property: Specifies the option to overwrite the target file if it already exists and has
     * read-only attribute set.
     *
     * @param ignoreReadOnly the ignoreReadOnly value to set.
     * @return the CopyFileSmbInfo object itself.
     */
    public CopyFileSmbInfo setIgnoreReadOnly(Boolean ignoreReadOnly) {
        this.ignoreReadOnly = ignoreReadOnly;
        return this;
    }

    /**
     * Get the fileAttributes property: Specifies either the option to copy file attributes from a source file(source)
     * to a target file or a list of attributes to set on a target file.
     *
     * @return the fileAttributes value.
     */
    public String getFileAttributes() {
        return this.fileAttributes;
    }

    /**
     * Set the fileAttributes property: Specifies either the option to copy file attributes from a source file(source)
     * to a target file or a list of attributes to set on a target file.
     *
     * @param fileAttributes the fileAttributes value to set.
     * @return the CopyFileSmbInfo object itself.
     */
    public CopyFileSmbInfo setFileAttributes(String fileAttributes) {
        this.fileAttributes = fileAttributes;
        return this;
    }

    /**
     * Get the fileCreationTime property: Specifies either the option to copy file creation time from a source
     * file(source) to a target file or a time value in ISO 8601 format to set as creation time on a target file.
     *
     * @return the fileCreationTime value.
     */
    public String getFileCreationTime() {
        return this.fileCreationTime;
    }

    /**
     * Set the fileCreationTime property: Specifies either the option to copy file creation time from a source
     * file(source) to a target file or a time value in ISO 8601 format to set as creation time on a target file.
     *
     * @param fileCreationTime the fileCreationTime value to set.
     * @return the CopyFileSmbInfo object itself.
     */
    public CopyFileSmbInfo setFileCreationTime(String fileCreationTime) {
        this.fileCreationTime = fileCreationTime;
        return this;
    }

    /**
     * Get the fileLastWriteTime property: Specifies either the option to copy file last write time from a source
     * file(source) to a target file or a time value in ISO 8601 format to set as last write time on a target file.
     *
     * @return the fileLastWriteTime value.
     */
    public String getFileLastWriteTime() {
        return this.fileLastWriteTime;
    }

    /**
     * Set the fileLastWriteTime property: Specifies either the option to copy file last write time from a source
     * file(source) to a target file or a time value in ISO 8601 format to set as last write time on a target file.
     *
     * @param fileLastWriteTime the fileLastWriteTime value to set.
     * @return the CopyFileSmbInfo object itself.
     */
    public CopyFileSmbInfo setFileLastWriteTime(String fileLastWriteTime) {
        this.fileLastWriteTime = fileLastWriteTime;
        return this;
    }

    /**
     * Get the setArchiveAttribute property: Specifies the option to set archive attribute on a target file. True means
     * archive attribute will be set on a target file despite attribute overrides or a source file state.
     *
     * @return the setArchiveAttribute value.
     */
    public Boolean isSetArchiveAttribute() {
        return this.setArchiveAttribute;
    }

    /**
     * Set the setArchiveAttribute property: Specifies the option to set archive attribute on a target file. True means
     * archive attribute will be set on a target file despite attribute overrides or a source file state.
     *
     * @param setArchiveAttribute the setArchiveAttribute value to set.
     * @return the CopyFileSmbInfo object itself.
     */
    public CopyFileSmbInfo setSetArchiveAttribute(Boolean setArchiveAttribute) {
        this.setArchiveAttribute = setArchiveAttribute;
        return this;
    }
}
