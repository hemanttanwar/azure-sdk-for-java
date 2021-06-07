// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** Base class for backup items. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "protectedItemType",
    defaultImpl = ProtectedItem.class)
@JsonTypeName("ProtectedItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareProtectedItem", value = AzureFileshareProtectedItem.class),
    @JsonSubTypes.Type(name = "AzureIaaSVMProtectedItem", value = AzureIaaSvmProtectedItem.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers/databases", value = AzureSqlProtectedItem.class),
    @JsonSubTypes.Type(name = "AzureVmWorkloadProtectedItem", value = AzureVmWorkloadProtectedItem.class),
    @JsonSubTypes.Type(name = "DPMProtectedItem", value = DpmProtectedItem.class),
    @JsonSubTypes.Type(name = "GenericProtectedItem", value = GenericProtectedItem.class),
    @JsonSubTypes.Type(name = "MabFileFolderProtectedItem", value = MabFileFolderProtectedItem.class),
    @JsonSubTypes.Type(name = "AzureFileShareProtectedItem", value = AzureFileshareProtectedItemAutoGenerated.class)
})
@Fluent
public class ProtectedItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectedItem.class);

    /*
     * Type of backup management for the backed up item.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /*
     * Type of workload this item represents.
     */
    @JsonProperty(value = "workloadType")
    private DataSourceType workloadType;

    /*
     * Unique name of container
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * ARM ID of the resource to be backed up.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /*
     * ID of the backup policy with which this item is backed up.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /*
     * Timestamp when the last (latest) backup copy was created for this backup
     * item.
     */
    @JsonProperty(value = "lastRecoveryPoint")
    private OffsetDateTime lastRecoveryPoint;

    /*
     * Name of the backup set the backup item belongs to
     */
    @JsonProperty(value = "backupSetName")
    private String backupSetName;

    /*
     * Create mode to indicate recovery of existing soft deleted data source or
     * creation of new data source.
     */
    @JsonProperty(value = "createMode")
    private CreateMode createMode;

    /*
     * Time for deferred deletion in UTC
     */
    @JsonProperty(value = "deferredDeleteTimeInUTC")
    private OffsetDateTime deferredDeleteTimeInUtc;

    /*
     * Flag to identify whether the DS is scheduled for deferred delete
     */
    @JsonProperty(value = "isScheduledForDeferredDelete")
    private Boolean isScheduledForDeferredDelete;

    /*
     * Time remaining before the DS marked for deferred delete is permanently
     * deleted
     */
    @JsonProperty(value = "deferredDeleteTimeRemaining")
    private String deferredDeleteTimeRemaining;

    /*
     * Flag to identify whether the deferred deleted DS is to be purged soon
     */
    @JsonProperty(value = "isDeferredDeleteScheduleUpcoming")
    private Boolean isDeferredDeleteScheduleUpcoming;

    /*
     * Flag to identify that deferred deleted DS is to be moved into Pause
     * state
     */
    @JsonProperty(value = "isRehydrate")
    private Boolean isRehydrate;

    /**
     * Get the backupManagementType property: Type of backup management for the backed up item.
     *
     * @return the backupManagementType value.
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backupManagementType property: Type of backup management for the backed up item.
     *
     * @param backupManagementType the backupManagementType value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the workloadType property: Type of workload this item represents.
     *
     * @return the workloadType value.
     */
    public DataSourceType workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workloadType property: Type of workload this item represents.
     *
     * @param workloadType the workloadType value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withWorkloadType(DataSourceType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the containerName property: Unique name of container.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Unique name of container.
     *
     * @param containerName the containerName value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the sourceResourceId property: ARM ID of the resource to be backed up.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: ARM ID of the resource to be backed up.
     *
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the policyId property: ID of the backup policy with which this item is backed up.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: ID of the backup policy with which this item is backed up.
     *
     * @param policyId the policyId value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the lastRecoveryPoint property: Timestamp when the last (latest) backup copy was created for this backup
     * item.
     *
     * @return the lastRecoveryPoint value.
     */
    public OffsetDateTime lastRecoveryPoint() {
        return this.lastRecoveryPoint;
    }

    /**
     * Set the lastRecoveryPoint property: Timestamp when the last (latest) backup copy was created for this backup
     * item.
     *
     * @param lastRecoveryPoint the lastRecoveryPoint value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withLastRecoveryPoint(OffsetDateTime lastRecoveryPoint) {
        this.lastRecoveryPoint = lastRecoveryPoint;
        return this;
    }

    /**
     * Get the backupSetName property: Name of the backup set the backup item belongs to.
     *
     * @return the backupSetName value.
     */
    public String backupSetName() {
        return this.backupSetName;
    }

    /**
     * Set the backupSetName property: Name of the backup set the backup item belongs to.
     *
     * @param backupSetName the backupSetName value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withBackupSetName(String backupSetName) {
        this.backupSetName = backupSetName;
        return this;
    }

    /**
     * Get the createMode property: Create mode to indicate recovery of existing soft deleted data source or creation of
     * new data source.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Create mode to indicate recovery of existing soft deleted data source or creation of
     * new data source.
     *
     * @param createMode the createMode value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the deferredDeleteTimeInUtc property: Time for deferred deletion in UTC.
     *
     * @return the deferredDeleteTimeInUtc value.
     */
    public OffsetDateTime deferredDeleteTimeInUtc() {
        return this.deferredDeleteTimeInUtc;
    }

    /**
     * Set the deferredDeleteTimeInUtc property: Time for deferred deletion in UTC.
     *
     * @param deferredDeleteTimeInUtc the deferredDeleteTimeInUtc value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withDeferredDeleteTimeInUtc(OffsetDateTime deferredDeleteTimeInUtc) {
        this.deferredDeleteTimeInUtc = deferredDeleteTimeInUtc;
        return this;
    }

    /**
     * Get the isScheduledForDeferredDelete property: Flag to identify whether the DS is scheduled for deferred delete.
     *
     * @return the isScheduledForDeferredDelete value.
     */
    public Boolean isScheduledForDeferredDelete() {
        return this.isScheduledForDeferredDelete;
    }

    /**
     * Set the isScheduledForDeferredDelete property: Flag to identify whether the DS is scheduled for deferred delete.
     *
     * @param isScheduledForDeferredDelete the isScheduledForDeferredDelete value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withIsScheduledForDeferredDelete(Boolean isScheduledForDeferredDelete) {
        this.isScheduledForDeferredDelete = isScheduledForDeferredDelete;
        return this;
    }

    /**
     * Get the deferredDeleteTimeRemaining property: Time remaining before the DS marked for deferred delete is
     * permanently deleted.
     *
     * @return the deferredDeleteTimeRemaining value.
     */
    public String deferredDeleteTimeRemaining() {
        return this.deferredDeleteTimeRemaining;
    }

    /**
     * Set the deferredDeleteTimeRemaining property: Time remaining before the DS marked for deferred delete is
     * permanently deleted.
     *
     * @param deferredDeleteTimeRemaining the deferredDeleteTimeRemaining value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withDeferredDeleteTimeRemaining(String deferredDeleteTimeRemaining) {
        this.deferredDeleteTimeRemaining = deferredDeleteTimeRemaining;
        return this;
    }

    /**
     * Get the isDeferredDeleteScheduleUpcoming property: Flag to identify whether the deferred deleted DS is to be
     * purged soon.
     *
     * @return the isDeferredDeleteScheduleUpcoming value.
     */
    public Boolean isDeferredDeleteScheduleUpcoming() {
        return this.isDeferredDeleteScheduleUpcoming;
    }

    /**
     * Set the isDeferredDeleteScheduleUpcoming property: Flag to identify whether the deferred deleted DS is to be
     * purged soon.
     *
     * @param isDeferredDeleteScheduleUpcoming the isDeferredDeleteScheduleUpcoming value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withIsDeferredDeleteScheduleUpcoming(Boolean isDeferredDeleteScheduleUpcoming) {
        this.isDeferredDeleteScheduleUpcoming = isDeferredDeleteScheduleUpcoming;
        return this;
    }

    /**
     * Get the isRehydrate property: Flag to identify that deferred deleted DS is to be moved into Pause state.
     *
     * @return the isRehydrate value.
     */
    public Boolean isRehydrate() {
        return this.isRehydrate;
    }

    /**
     * Set the isRehydrate property: Flag to identify that deferred deleted DS is to be moved into Pause state.
     *
     * @param isRehydrate the isRehydrate value to set.
     * @return the ProtectedItem object itself.
     */
    public ProtectedItem withIsRehydrate(Boolean isRehydrate) {
        this.isRehydrate = isRehydrate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
