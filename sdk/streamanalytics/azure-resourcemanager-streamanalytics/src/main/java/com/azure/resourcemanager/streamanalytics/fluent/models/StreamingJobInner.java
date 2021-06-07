// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.models.ClusterInfo;
import com.azure.resourcemanager.streamanalytics.models.CompatibilityLevel;
import com.azure.resourcemanager.streamanalytics.models.ContentStoragePolicy;
import com.azure.resourcemanager.streamanalytics.models.EventsOutOfOrderPolicy;
import com.azure.resourcemanager.streamanalytics.models.External;
import com.azure.resourcemanager.streamanalytics.models.Identity;
import com.azure.resourcemanager.streamanalytics.models.JobStorageAccount;
import com.azure.resourcemanager.streamanalytics.models.JobType;
import com.azure.resourcemanager.streamanalytics.models.OutputErrorPolicy;
import com.azure.resourcemanager.streamanalytics.models.OutputStartMode;
import com.azure.resourcemanager.streamanalytics.models.StreamingJobSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** A streaming job object, containing all information associated with the named streaming job. */
@JsonFlatten
@Fluent
public class StreamingJobInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingJobInner.class);

    /*
     * Describes the system-assigned managed identity assigned to this job that
     * can be used to authenticate with inputs and outputs.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Describes the SKU of the streaming job. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties.sku")
    private StreamingJobSku sku;

    /*
     * A GUID uniquely identifying the streaming job. This GUID is generated
     * upon creation of the streaming job.
     */
    @JsonProperty(value = "properties.jobId", access = JsonProperty.Access.WRITE_ONLY)
    private String jobId;

    /*
     * Describes the provisioning status of the streaming job.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Describes the state of the streaming job.
     */
    @JsonProperty(value = "properties.jobState", access = JsonProperty.Access.WRITE_ONLY)
    private String jobState;

    /*
     * Describes the type of the job. Valid modes are `Cloud` and 'Edge'.
     */
    @JsonProperty(value = "properties.jobType")
    private JobType jobType;

    /*
     * This property should only be utilized when it is desired that the job be
     * started immediately upon creation. Value may be JobStartTime,
     * CustomTime, or LastOutputEventTime to indicate whether the starting
     * point of the output event stream should start whenever the job is
     * started, start at a custom user time stamp specified via the
     * outputStartTime property, or start from the last event output time.
     */
    @JsonProperty(value = "properties.outputStartMode")
    private OutputStartMode outputStartMode;

    /*
     * Value is either an ISO-8601 formatted time stamp that indicates the
     * starting point of the output event stream, or null to indicate that the
     * output event stream will start whenever the streaming job is started.
     * This property must have a value if outputStartMode is set to CustomTime.
     */
    @JsonProperty(value = "properties.outputStartTime")
    private OffsetDateTime outputStartTime;

    /*
     * Value is either an ISO-8601 formatted timestamp indicating the last
     * output event time of the streaming job or null indicating that output
     * has not yet been produced. In case of multiple outputs or multiple
     * streams, this shows the latest value in that set.
     */
    @JsonProperty(value = "properties.lastOutputEventTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastOutputEventTime;

    /*
     * Indicates the policy to apply to events that arrive out of order in the
     * input event stream.
     */
    @JsonProperty(value = "properties.eventsOutOfOrderPolicy")
    private EventsOutOfOrderPolicy eventsOutOfOrderPolicy;

    /*
     * Indicates the policy to apply to events that arrive at the output and
     * cannot be written to the external storage due to being malformed
     * (missing column values, column values of wrong type or size).
     */
    @JsonProperty(value = "properties.outputErrorPolicy")
    private OutputErrorPolicy outputErrorPolicy;

    /*
     * The maximum tolerable delay in seconds where out-of-order events can be
     * adjusted to be back in order.
     */
    @JsonProperty(value = "properties.eventsOutOfOrderMaxDelayInSeconds")
    private Integer eventsOutOfOrderMaxDelayInSeconds;

    /*
     * The maximum tolerable delay in seconds where events arriving late could
     * be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1
     * is used to specify wait indefinitely. If the property is absent, it is
     * interpreted to have a value of -1.
     */
    @JsonProperty(value = "properties.eventsLateArrivalMaxDelayInSeconds")
    private Integer eventsLateArrivalMaxDelayInSeconds;

    /*
     * The data locale of the stream analytics job. Value should be the name of
     * a supported .NET Culture from the set
     * https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx.
     * Defaults to 'en-US' if none specified.
     */
    @JsonProperty(value = "properties.dataLocale")
    private String dataLocale;

    /*
     * Controls certain runtime behaviors of the streaming job.
     */
    @JsonProperty(value = "properties.compatibilityLevel")
    private CompatibilityLevel compatibilityLevel;

    /*
     * Value is an ISO-8601 formatted UTC timestamp indicating when the
     * streaming job was created.
     */
    @JsonProperty(value = "properties.createdDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdDate;

    /*
     * A list of one or more inputs to the streaming job. The name property for
     * each input is required when specifying this property in a PUT request.
     * This property cannot be modify via a PATCH operation. You must use the
     * PATCH API available for the individual input.
     */
    @JsonProperty(value = "properties.inputs")
    private List<InputInner> inputs;

    /*
     * Indicates the query and the number of streaming units to use for the
     * streaming job. The name property of the transformation is required when
     * specifying this property in a PUT request. This property cannot be
     * modify via a PATCH operation. You must use the PATCH API available for
     * the individual transformation.
     */
    @JsonProperty(value = "properties.transformation")
    private TransformationInner transformation;

    /*
     * A list of one or more outputs for the streaming job. The name property
     * for each output is required when specifying this property in a PUT
     * request. This property cannot be modify via a PATCH operation. You must
     * use the PATCH API available for the individual output.
     */
    @JsonProperty(value = "properties.outputs")
    private List<OutputInner> outputs;

    /*
     * A list of one or more functions for the streaming job. The name property
     * for each function is required when specifying this property in a PUT
     * request. This property cannot be modify via a PATCH operation. You must
     * use the PATCH API available for the individual transformation.
     */
    @JsonProperty(value = "properties.functions")
    private List<FunctionInner> functions;

    /*
     * The current entity tag for the streaming job. This is an opaque string.
     * You can use it to detect whether the resource has changed between
     * requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     */
    @JsonProperty(value = "properties.etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The properties that are associated with an Azure Storage account with
     * MSI
     */
    @JsonProperty(value = "properties.jobStorageAccount")
    private JobStorageAccount jobStorageAccount;

    /*
     * Valid values are JobStorageAccount and SystemAccount. If set to
     * JobStorageAccount, this requires the user to also specify
     * jobStorageAccount property. .
     */
    @JsonProperty(value = "properties.contentStoragePolicy")
    private ContentStoragePolicy contentStoragePolicy;

    /*
     * The storage account where the custom code artifacts are located.
     */
    @JsonProperty(value = "properties.externals")
    private External externals;

    /*
     * The cluster which streaming jobs will run on.
     */
    @JsonProperty(value = "properties.cluster")
    private ClusterInfo cluster;

    /**
     * Get the identity property: Describes the system-assigned managed identity assigned to this job that can be used
     * to authenticate with inputs and outputs.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Describes the system-assigned managed identity assigned to this job that can be used
     * to authenticate with inputs and outputs.
     *
     * @param identity the identity value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     *
     * @return the sku value.
     */
    public StreamingJobSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     *
     * @param sku the sku value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withSku(StreamingJobSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the jobId property: A GUID uniquely identifying the streaming job. This GUID is generated upon creation of
     * the streaming job.
     *
     * @return the jobId value.
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Get the provisioningState property: Describes the provisioning status of the streaming job.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the jobState property: Describes the state of the streaming job.
     *
     * @return the jobState value.
     */
    public String jobState() {
        return this.jobState;
    }

    /**
     * Get the jobType property: Describes the type of the job. Valid modes are `Cloud` and 'Edge'.
     *
     * @return the jobType value.
     */
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: Describes the type of the job. Valid modes are `Cloud` and 'Edge'.
     *
     * @param jobType the jobType value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withJobType(JobType jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the outputStartMode property: This property should only be utilized when it is desired that the job be
     * started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate
     * whether the starting point of the output event stream should start whenever the job is started, start at a custom
     * user time stamp specified via the outputStartTime property, or start from the last event output time.
     *
     * @return the outputStartMode value.
     */
    public OutputStartMode outputStartMode() {
        return this.outputStartMode;
    }

    /**
     * Set the outputStartMode property: This property should only be utilized when it is desired that the job be
     * started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate
     * whether the starting point of the output event stream should start whenever the job is started, start at a custom
     * user time stamp specified via the outputStartTime property, or start from the last event output time.
     *
     * @param outputStartMode the outputStartMode value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputStartMode(OutputStartMode outputStartMode) {
        this.outputStartMode = outputStartMode;
        return this;
    }

    /**
     * Get the outputStartTime property: Value is either an ISO-8601 formatted time stamp that indicates the starting
     * point of the output event stream, or null to indicate that the output event stream will start whenever the
     * streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     *
     * @return the outputStartTime value.
     */
    public OffsetDateTime outputStartTime() {
        return this.outputStartTime;
    }

    /**
     * Set the outputStartTime property: Value is either an ISO-8601 formatted time stamp that indicates the starting
     * point of the output event stream, or null to indicate that the output event stream will start whenever the
     * streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     *
     * @param outputStartTime the outputStartTime value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputStartTime(OffsetDateTime outputStartTime) {
        this.outputStartTime = outputStartTime;
        return this;
    }

    /**
     * Get the lastOutputEventTime property: Value is either an ISO-8601 formatted timestamp indicating the last output
     * event time of the streaming job or null indicating that output has not yet been produced. In case of multiple
     * outputs or multiple streams, this shows the latest value in that set.
     *
     * @return the lastOutputEventTime value.
     */
    public OffsetDateTime lastOutputEventTime() {
        return this.lastOutputEventTime;
    }

    /**
     * Get the eventsOutOfOrderPolicy property: Indicates the policy to apply to events that arrive out of order in the
     * input event stream.
     *
     * @return the eventsOutOfOrderPolicy value.
     */
    public EventsOutOfOrderPolicy eventsOutOfOrderPolicy() {
        return this.eventsOutOfOrderPolicy;
    }

    /**
     * Set the eventsOutOfOrderPolicy property: Indicates the policy to apply to events that arrive out of order in the
     * input event stream.
     *
     * @param eventsOutOfOrderPolicy the eventsOutOfOrderPolicy value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withEventsOutOfOrderPolicy(EventsOutOfOrderPolicy eventsOutOfOrderPolicy) {
        this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
        return this;
    }

    /**
     * Get the outputErrorPolicy property: Indicates the policy to apply to events that arrive at the output and cannot
     * be written to the external storage due to being malformed (missing column values, column values of wrong type or
     * size).
     *
     * @return the outputErrorPolicy value.
     */
    public OutputErrorPolicy outputErrorPolicy() {
        return this.outputErrorPolicy;
    }

    /**
     * Set the outputErrorPolicy property: Indicates the policy to apply to events that arrive at the output and cannot
     * be written to the external storage due to being malformed (missing column values, column values of wrong type or
     * size).
     *
     * @param outputErrorPolicy the outputErrorPolicy value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputErrorPolicy(OutputErrorPolicy outputErrorPolicy) {
        this.outputErrorPolicy = outputErrorPolicy;
        return this;
    }

    /**
     * Get the eventsOutOfOrderMaxDelayInSeconds property: The maximum tolerable delay in seconds where out-of-order
     * events can be adjusted to be back in order.
     *
     * @return the eventsOutOfOrderMaxDelayInSeconds value.
     */
    public Integer eventsOutOfOrderMaxDelayInSeconds() {
        return this.eventsOutOfOrderMaxDelayInSeconds;
    }

    /**
     * Set the eventsOutOfOrderMaxDelayInSeconds property: The maximum tolerable delay in seconds where out-of-order
     * events can be adjusted to be back in order.
     *
     * @param eventsOutOfOrderMaxDelayInSeconds the eventsOutOfOrderMaxDelayInSeconds value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withEventsOutOfOrderMaxDelayInSeconds(Integer eventsOutOfOrderMaxDelayInSeconds) {
        this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
        return this;
    }

    /**
     * Get the eventsLateArrivalMaxDelayInSeconds property: The maximum tolerable delay in seconds where events arriving
     * late could be included. Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait
     * indefinitely. If the property is absent, it is interpreted to have a value of -1.
     *
     * @return the eventsLateArrivalMaxDelayInSeconds value.
     */
    public Integer eventsLateArrivalMaxDelayInSeconds() {
        return this.eventsLateArrivalMaxDelayInSeconds;
    }

    /**
     * Set the eventsLateArrivalMaxDelayInSeconds property: The maximum tolerable delay in seconds where events arriving
     * late could be included. Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait
     * indefinitely. If the property is absent, it is interpreted to have a value of -1.
     *
     * @param eventsLateArrivalMaxDelayInSeconds the eventsLateArrivalMaxDelayInSeconds value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withEventsLateArrivalMaxDelayInSeconds(Integer eventsLateArrivalMaxDelayInSeconds) {
        this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
        return this;
    }

    /**
     * Get the dataLocale property: The data locale of the stream analytics job. Value should be the name of a supported
     * .NET Culture from the set
     * https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if
     * none specified.
     *
     * @return the dataLocale value.
     */
    public String dataLocale() {
        return this.dataLocale;
    }

    /**
     * Set the dataLocale property: The data locale of the stream analytics job. Value should be the name of a supported
     * .NET Culture from the set
     * https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if
     * none specified.
     *
     * @param dataLocale the dataLocale value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withDataLocale(String dataLocale) {
        this.dataLocale = dataLocale;
        return this;
    }

    /**
     * Get the compatibilityLevel property: Controls certain runtime behaviors of the streaming job.
     *
     * @return the compatibilityLevel value.
     */
    public CompatibilityLevel compatibilityLevel() {
        return this.compatibilityLevel;
    }

    /**
     * Set the compatibilityLevel property: Controls certain runtime behaviors of the streaming job.
     *
     * @param compatibilityLevel the compatibilityLevel value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withCompatibilityLevel(CompatibilityLevel compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
        return this;
    }

    /**
     * Get the createdDate property: Value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was
     * created.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Get the inputs property: A list of one or more inputs to the streaming job. The name property for each input is
     * required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation.
     * You must use the PATCH API available for the individual input.
     *
     * @return the inputs value.
     */
    public List<InputInner> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: A list of one or more inputs to the streaming job. The name property for each input is
     * required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation.
     * You must use the PATCH API available for the individual input.
     *
     * @param inputs the inputs value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withInputs(List<InputInner> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the transformation property: Indicates the query and the number of streaming units to use for the streaming
     * job. The name property of the transformation is required when specifying this property in a PUT request. This
     * property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual
     * transformation.
     *
     * @return the transformation value.
     */
    public TransformationInner transformation() {
        return this.transformation;
    }

    /**
     * Set the transformation property: Indicates the query and the number of streaming units to use for the streaming
     * job. The name property of the transformation is required when specifying this property in a PUT request. This
     * property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual
     * transformation.
     *
     * @param transformation the transformation value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withTransformation(TransformationInner transformation) {
        this.transformation = transformation;
        return this;
    }

    /**
     * Get the outputs property: A list of one or more outputs for the streaming job. The name property for each output
     * is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation.
     * You must use the PATCH API available for the individual output.
     *
     * @return the outputs value.
     */
    public List<OutputInner> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: A list of one or more outputs for the streaming job. The name property for each output
     * is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation.
     * You must use the PATCH API available for the individual output.
     *
     * @param outputs the outputs value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withOutputs(List<OutputInner> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get the functions property: A list of one or more functions for the streaming job. The name property for each
     * function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH
     * operation. You must use the PATCH API available for the individual transformation.
     *
     * @return the functions value.
     */
    public List<FunctionInner> functions() {
        return this.functions;
    }

    /**
     * Set the functions property: A list of one or more functions for the streaming job. The name property for each
     * function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH
     * operation. You must use the PATCH API available for the individual transformation.
     *
     * @param functions the functions value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withFunctions(List<FunctionInner> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the etag property: The current entity tag for the streaming job. This is an opaque string. You can use it to
     * detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match
     * headers for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the jobStorageAccount property: The properties that are associated with an Azure Storage account with MSI.
     *
     * @return the jobStorageAccount value.
     */
    public JobStorageAccount jobStorageAccount() {
        return this.jobStorageAccount;
    }

    /**
     * Set the jobStorageAccount property: The properties that are associated with an Azure Storage account with MSI.
     *
     * @param jobStorageAccount the jobStorageAccount value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withJobStorageAccount(JobStorageAccount jobStorageAccount) {
        this.jobStorageAccount = jobStorageAccount;
        return this;
    }

    /**
     * Get the contentStoragePolicy property: Valid values are JobStorageAccount and SystemAccount. If set to
     * JobStorageAccount, this requires the user to also specify jobStorageAccount property. .
     *
     * @return the contentStoragePolicy value.
     */
    public ContentStoragePolicy contentStoragePolicy() {
        return this.contentStoragePolicy;
    }

    /**
     * Set the contentStoragePolicy property: Valid values are JobStorageAccount and SystemAccount. If set to
     * JobStorageAccount, this requires the user to also specify jobStorageAccount property. .
     *
     * @param contentStoragePolicy the contentStoragePolicy value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withContentStoragePolicy(ContentStoragePolicy contentStoragePolicy) {
        this.contentStoragePolicy = contentStoragePolicy;
        return this;
    }

    /**
     * Get the externals property: The storage account where the custom code artifacts are located.
     *
     * @return the externals value.
     */
    public External externals() {
        return this.externals;
    }

    /**
     * Set the externals property: The storage account where the custom code artifacts are located.
     *
     * @param externals the externals value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withExternals(External externals) {
        this.externals = externals;
        return this;
    }

    /**
     * Get the cluster property: The cluster which streaming jobs will run on.
     *
     * @return the cluster value.
     */
    public ClusterInfo cluster() {
        return this.cluster;
    }

    /**
     * Set the cluster property: The cluster which streaming jobs will run on.
     *
     * @param cluster the cluster value to set.
     * @return the StreamingJobInner object itself.
     */
    public StreamingJobInner withCluster(ClusterInfo cluster) {
        this.cluster = cluster;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StreamingJobInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StreamingJobInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
        if (transformation() != null) {
            transformation().validate();
        }
        if (outputs() != null) {
            outputs().forEach(e -> e.validate());
        }
        if (functions() != null) {
            functions().forEach(e -> e.validate());
        }
        if (jobStorageAccount() != null) {
            jobStorageAccount().validate();
        }
        if (externals() != null) {
            externals().validate();
        }
        if (cluster() != null) {
            cluster().validate();
        }
    }
}
