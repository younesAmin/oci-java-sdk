/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe;

import com.oracle.bmc.datasafe.requests.*;
import com.oracle.bmc.datasafe.responses.*;

/** APIs for using Oracle Data Safe. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public interface DataSafeAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Reactivates a previously deactivated Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateTargetDatabaseResponse> activateTargetDatabase(
            ActivateTargetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateTargetDatabaseRequest, ActivateTargetDatabaseResponse>
                    handler);

    /**
     * Adds columns to the specified masking policy from the associated sensitive data model. It
     * automatically pulls all the sensitive columns and their relationships from the sensitive data
     * model and uses this information to create columns in the masking policy. It also assigns
     * default masking formats to these columns based on the associated sensitive types.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddMaskingColumnsFromSdmResponse> addMaskingColumnsFromSdm(
            AddMaskingColumnsFromSdmRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddMaskingColumnsFromSdmRequest, AddMaskingColumnsFromSdmResponse>
                    handler);

    /**
     * Update alerts within a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AlertsUpdateResponse> alertsUpdate(
            AlertsUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<AlertsUpdateRequest, AlertsUpdateResponse>
                    handler);

    /**
     * Applies the results of a discovery job to the specified sensitive data model. Note that the
     * plannedAction attribute of discovery results is used for processing them. You should first
     * use PatchDiscoveryJobResults to set the plannedAction attribute of the discovery results you
     * want to process. ApplyDiscoveryJobResults automatically reads the plannedAction attribute and
     * updates the sensitive data model to reflect the actions you planned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApplyDiscoveryJobResultsResponse> applyDiscoveryJobResults(
            ApplyDiscoveryJobResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ApplyDiscoveryJobResultsRequest, ApplyDiscoveryJobResultsResponse>
                    handler);

    /**
     * Calculates the volume of audit events available on the target database to be collected.
     * Measurable up to the defined retention period of the audit target resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CalculateAuditVolumeAvailableResponse>
            calculateAuditVolumeAvailable(
                    CalculateAuditVolumeAvailableRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeAvailableRequest,
                                    CalculateAuditVolumeAvailableResponse>
                            handler);

    /**
     * Calculates the volume of audit events collected by data safe.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CalculateAuditVolumeCollectedResponse>
            calculateAuditVolumeCollected(
                    CalculateAuditVolumeCollectedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CalculateAuditVolumeCollectedRequest,
                                    CalculateAuditVolumeCollectedResponse>
                            handler);

    /**
     * Cancel the given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves the specified alert into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAlertCompartmentResponse> changeAlertCompartment(
            ChangeAlertCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeAlertCompartmentRequest, ChangeAlertCompartmentResponse>
                    handler);

    /**
     * Moves the archive retreival to the specified compartment. When provided, if-Match is checked
     * against ETag value of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAuditArchiveRetrievalCompartmentResponse>
            changeAuditArchiveRetrievalCompartment(
                    ChangeAuditArchiveRetrievalCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditArchiveRetrievalCompartmentRequest,
                                    ChangeAuditArchiveRetrievalCompartmentResponse>
                            handler);

    /**
     * Moves the specified audit policy and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAuditPolicyCompartmentResponse> changeAuditPolicyCompartment(
            ChangeAuditPolicyCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeAuditPolicyCompartmentRequest,
                            ChangeAuditPolicyCompartmentResponse>
                    handler);

    /**
     * Moves the specified audit profile and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAuditProfileCompartmentResponse>
            changeAuditProfileCompartment(
                    ChangeAuditProfileCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAuditProfileCompartmentRequest,
                                    ChangeAuditProfileCompartmentResponse>
                            handler);

    /**
     * Moves the Data Safe private endpoint and its dependent resources to the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDataSafePrivateEndpointCompartmentResponse>
            changeDataSafePrivateEndpointCompartment(
                    ChangeDataSafePrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSafePrivateEndpointCompartmentRequest,
                                    ChangeDataSafePrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves the specified discovery job and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDiscoveryJobCompartmentResponse>
            changeDiscoveryJobCompartment(
                    ChangeDiscoveryJobCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDiscoveryJobCompartmentRequest,
                                    ChangeDiscoveryJobCompartmentResponse>
                            handler);

    /**
     * Moves the specified library masking format into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLibraryMaskingFormatCompartmentResponse>
            changeLibraryMaskingFormatCompartment(
                    ChangeLibraryMaskingFormatCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLibraryMaskingFormatCompartmentRequest,
                                    ChangeLibraryMaskingFormatCompartmentResponse>
                            handler);

    /**
     * Moves the specified masking policy and its dependent resources into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMaskingPolicyCompartmentResponse>
            changeMaskingPolicyCompartment(
                    ChangeMaskingPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMaskingPolicyCompartmentRequest,
                                    ChangeMaskingPolicyCompartmentResponse>
                            handler);

    /**
     * Moves the specified on-premises connector into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOnPremConnectorCompartmentResponse>
            changeOnPremConnectorCompartment(
                    ChangeOnPremConnectorCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOnPremConnectorCompartmentRequest,
                                    ChangeOnPremConnectorCompartmentResponse>
                            handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeReportCompartmentResponse> changeReportCompartment(
            ChangeReportCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeReportCompartmentRequest, ChangeReportCompartmentResponse>
                    handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeReportDefinitionCompartmentResponse>
            changeReportDefinitionCompartment(
                    ChangeReportDefinitionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeReportDefinitionCompartmentRequest,
                                    ChangeReportDefinitionCompartmentResponse>
                            handler);

    /**
     * Change the online and offline months .
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRetentionResponse> changeRetention(
            ChangeRetentionRequest request,
            com.oracle.bmc.responses.AsyncHandler<ChangeRetentionRequest, ChangeRetentionResponse>
                    handler);

    /**
     * Moves the specified saved security assessment or future scheduled assessments into a
     * different compartment.
     *
     * <p>To start, call first the operation ListSecurityAssessments with filters \"type =
     * save_schedule\". This returns the scheduleAssessmentId. Then, call this changeCompartment
     * with the scheduleAssessmentId.
     *
     * <p>The existing saved security assessments created due to the schedule are not moved.
     * However, all new saves will be associated with the new compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSecurityAssessmentCompartmentResponse>
            changeSecurityAssessmentCompartment(
                    ChangeSecurityAssessmentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityAssessmentCompartmentRequest,
                                    ChangeSecurityAssessmentCompartmentResponse>
                            handler);

    /**
     * Moves the specified sensitive data model and its dependent resources into a different
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSensitiveDataModelCompartmentResponse>
            changeSensitiveDataModelCompartment(
                    ChangeSensitiveDataModelCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveDataModelCompartmentRequest,
                                    ChangeSensitiveDataModelCompartmentResponse>
                            handler);

    /**
     * Moves the specified sensitive type into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSensitiveTypeCompartmentResponse>
            changeSensitiveTypeCompartment(
                    ChangeSensitiveTypeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSensitiveTypeCompartmentRequest,
                                    ChangeSensitiveTypeCompartmentResponse>
                            handler);

    /**
     * Moves the specified target-alert policy Association into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTargetAlertPolicyAssociationCompartmentResponse>
            changeTargetAlertPolicyAssociationCompartment(
                    ChangeTargetAlertPolicyAssociationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetAlertPolicyAssociationCompartmentRequest,
                                    ChangeTargetAlertPolicyAssociationCompartmentResponse>
                            handler);

    /**
     * Moves the Data Safe target database to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTargetDatabaseCompartmentResponse>
            changeTargetDatabaseCompartment(
                    ChangeTargetDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTargetDatabaseCompartmentRequest,
                                    ChangeTargetDatabaseCompartmentResponse>
                            handler);

    /**
     * Moves the specified saved user assessment or future scheduled assessments into a different
     * compartment. To start storing scheduled user assessments on a different compartment, first
     * call the operation ListUserAssessments with the filters \"type = save_schedule\". That call
     * returns the scheduleAssessmentId. Then call ChangeUserAssessmentCompartment with the
     * scheduleAssessmentId. The existing saved user assessments created per the schedule are not be
     * moved. However, all new saves will be associated with the new compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeUserAssessmentCompartmentResponse>
            changeUserAssessmentCompartment(
                    ChangeUserAssessmentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeUserAssessmentCompartmentRequest,
                                    ChangeUserAssessmentCompartmentResponse>
                            handler);

    /**
     * Compares two security assessments. For this comparison, a security assessment can be a saved
     * assessment, a latest assessment, or a baseline assessment. For example, you can compare saved
     * assessment or a latest assessment against a baseline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CompareSecurityAssessmentResponse> compareSecurityAssessment(
            CompareSecurityAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CompareSecurityAssessmentRequest, CompareSecurityAssessmentResponse>
                    handler);

    /**
     * Compares two user assessments. For this comparison, a user assessment can be a saved, a
     * latest assessment, or a baseline. As an example, it can be used to compare a user assessment
     * saved or a latest assessment with a baseline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CompareUserAssessmentResponse> compareUserAssessment(
            CompareUserAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CompareUserAssessmentRequest, CompareUserAssessmentResponse>
                    handler);

    /**
     * Creates a work request to retrieve archived audit data. This asynchronous process will
     * usually take over an hour to complete. Save the id from the response of this operation. Call
     * GetAuditArchiveRetrieval operation after an hour, passing the id to know the status of this
     * operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAuditArchiveRetrievalResponse> createAuditArchiveRetrieval(
            CreateAuditArchiveRetrievalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAuditArchiveRetrievalRequest, CreateAuditArchiveRetrievalResponse>
                    handler);

    /**
     * Creates a new Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataSafePrivateEndpointResponse>
            createDataSafePrivateEndpoint(
                    CreateDataSafePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSafePrivateEndpointRequest,
                                    CreateDataSafePrivateEndpointResponse>
                            handler);

    /**
     * Performs incremental data discovery for the specified sensitive data model. It uses the
     * target database associated with the sensitive data model. After performing data discovery,
     * you can use ListDiscoveryJobResults to view the discovery results, PatchDiscoveryJobResults
     * to specify the action you want perform on these results, and then ApplyDiscoveryJobResults to
     * process the results and apply them to the sensitive data model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler);

    /**
     * Creates a new library masking format. A masking format can have one or more format entries.
     * The combined output of all the format entries is used for masking. It provides the
     * flexibility to define a masking format that can generate different parts of a data value
     * separately and then combine them to get the final data value for masking. Note that you
     * cannot define masking condition in a library masking format.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateLibraryMaskingFormatResponse> createLibraryMaskingFormat(
            CreateLibraryMaskingFormatRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLibraryMaskingFormatRequest, CreateLibraryMaskingFormatResponse>
                    handler);

    /**
     * Creates a new masking column in the specified masking policy. Use this operation to add
     * parent columns only. It automatically adds the child columns from the associated sensitive
     * data model or target database. If you provide the sensitiveTypeId attribute but not the
     * maskingFormats attribute, it automatically assigns the default masking format associated with
     * the specified sensitive type. Alternatively, if you provide the maskingFormats attribute, the
     * specified masking formats are assigned to the column.
     *
     * <p>Using the maskingFormats attribute, you can assign one or more masking formats to a
     * column. You need to specify a condition as part of each masking format. It enables you to do
     * <a
     * href=\"https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html\">conditional
     * masking</a> so that you can mask the column data values differently using different masking
     * conditions. A masking format can have one or more format entries. The combined output of all
     * the format entries is used for masking. It provides the flexibility to define a masking
     * format that can generate different parts of a data value separately and then combine them to
     * get the final data value for masking.
     *
     * <p>You can use the maskingColumnGroup attribute to group the columns that you would like to
     * mask together. It enables you to do <a
     * href=\"https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037\">group
     * or compound masking</a> that ensures that the masked data across the columns in a group
     * continue to retain the same logical relationship.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMaskingColumnResponse> createMaskingColumn(
            CreateMaskingColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingColumnRequest, CreateMaskingColumnResponse>
                    handler);

    /**
     * Creates a new masking policy and associates it with a sensitive data model or a reference
     * target database.
     *
     * <p>To use a sensitive data model as the source of masking columns, set the columnSource
     * attribute to SENSITIVE_DATA_MODEL and provide the sensitiveDataModelId attribute. After
     * creating a masking policy, you can use the AddMaskingColumnsFromSdm operation to
     * automatically add all the columns from the associated sensitive data model. In this case, the
     * target database associated with the sensitive data model is used for column and masking
     * format validations.
     *
     * <p>You can also create a masking policy without using a sensitive data model. In this case,
     * you need to associate your masking policy with a target database by setting the columnSource
     * attribute to TARGET and providing the targetId attribute. The specified target database is
     * used for column and masking format validations.
     *
     * <p>After creating a masking policy, you can use the CreateMaskingColumn or
     * PatchMaskingColumns operation to manually add columns to the policy. You need to add the
     * parent columns only, and it automatically adds the child columns (in referential relationship
     * with the parent columns) from the associated sensitive data model or target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMaskingPolicyResponse> createMaskingPolicy(
            CreateMaskingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMaskingPolicyRequest, CreateMaskingPolicyResponse>
                    handler);

    /**
     * Creates a new on-premises connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOnPremConnectorResponse> createOnPremConnector(
            CreateOnPremConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOnPremConnectorRequest, CreateOnPremConnectorResponse>
                    handler);

    /**
     * Creates a new report definition with parameters specified in the body. The report definition
     * is stored in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateReportDefinitionResponse> createReportDefinition(
            CreateReportDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateReportDefinitionRequest, CreateReportDefinitionResponse>
                    handler);

    /**
     * Creates a new saved security assessment for one or multiple targets in a compartment. When
     * this operation is performed, it will save the latest assessments in the specified
     * compartment. If a schedule is passed, it will persist the latest assessments, at the defined
     * date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityAssessmentResponse> createSecurityAssessment(
            CreateSecurityAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityAssessmentRequest, CreateSecurityAssessmentResponse>
                    handler);

    /**
     * Creates a new sensitive column in the specified sensitive data model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSensitiveColumnResponse> createSensitiveColumn(
            CreateSensitiveColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveColumnRequest, CreateSensitiveColumnResponse>
                    handler);

    /**
     * Creates a new sensitive data model. If schemas and sensitive types are provided, it
     * automatically runs data discovery and adds the discovered columns to the sensitive data
     * model. Otherwise, it creates an empty sensitive data model that can be updated later.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSensitiveDataModelResponse> createSensitiveDataModel(
            CreateSensitiveDataModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveDataModelRequest, CreateSensitiveDataModelResponse>
                    handler);

    /**
     * Creates a new sensitive type, which can be a basic sensitive type with regular expressions or
     * a sensitive category. While sensitive types are used for data discovery, sensitive categories
     * are used for logically grouping the related or similar sensitive types.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSensitiveTypeResponse> createSensitiveType(
            CreateSensitiveTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSensitiveTypeRequest, CreateSensitiveTypeResponse>
                    handler);

    /**
     * Creates a new target-alert policy association to track a alert policy applied on target.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTargetAlertPolicyAssociationResponse>
            createTargetAlertPolicyAssociation(
                    CreateTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateTargetAlertPolicyAssociationRequest,
                                    CreateTargetAlertPolicyAssociationResponse>
                            handler);

    /**
     * Registers the specified database with Data Safe and creates a Data Safe target database in
     * the Data Safe Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTargetDatabaseResponse> createTargetDatabase(
            CreateTargetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTargetDatabaseRequest, CreateTargetDatabaseResponse>
                    handler);

    /**
     * Creates a new saved user assessment for one or multiple targets in a compartment. It saves
     * the latest assessments in the specified compartment. If a scheduled is passed in, this
     * operation persists the latest assessments that exist at the defined date and time, in the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateUserAssessmentResponse> createUserAssessment(
            CreateUserAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateUserAssessmentRequest, CreateUserAssessmentResponse>
                    handler);

    /**
     * Deactivates a target database in Data Safe.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateTargetDatabaseResponse> deactivateTargetDatabase(
            DeactivateTargetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeactivateTargetDatabaseRequest, DeactivateTargetDatabaseResponse>
                    handler);

    /**
     * To unload retrieved archive data, call the operation ListAuditArchiveRetrieval first. This
     * will return the auditArchiveRetrievalId. Then call this operation with
     * auditArchiveRetrievalId.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAuditArchiveRetrievalResponse> deleteAuditArchiveRetrieval(
            DeleteAuditArchiveRetrievalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuditArchiveRetrievalRequest, DeleteAuditArchiveRetrievalResponse>
                    handler);

    /**
     * Deletes the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAuditTrailResponse> deleteAuditTrail(
            DeleteAuditTrailRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAuditTrailRequest, DeleteAuditTrailResponse>
                    handler);

    /**
     * Deletes the specified Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataSafePrivateEndpointResponse>
            deleteDataSafePrivateEndpoint(
                    DeleteDataSafePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSafePrivateEndpointRequest,
                                    DeleteDataSafePrivateEndpointResponse>
                            handler);

    /**
     * Deletes the specified discovery job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler);

    /**
     * Deletes the specified discovery result.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDiscoveryJobResultResponse> deleteDiscoveryJobResult(
            DeleteDiscoveryJobResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobResultRequest, DeleteDiscoveryJobResultResponse>
                    handler);

    /**
     * Deletes the specified library masking format.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLibraryMaskingFormatResponse> deleteLibraryMaskingFormat(
            DeleteLibraryMaskingFormatRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLibraryMaskingFormatRequest, DeleteLibraryMaskingFormatResponse>
                    handler);

    /**
     * Deletes the specified masking column.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMaskingColumnResponse> deleteMaskingColumn(
            DeleteMaskingColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingColumnRequest, DeleteMaskingColumnResponse>
                    handler);

    /**
     * Deletes the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMaskingPolicyResponse> deleteMaskingPolicy(
            DeleteMaskingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaskingPolicyRequest, DeleteMaskingPolicyResponse>
                    handler);

    /**
     * Deletes the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOnPremConnectorResponse> deleteOnPremConnector(
            DeleteOnPremConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOnPremConnectorRequest, DeleteOnPremConnectorResponse>
                    handler);

    /**
     * Deletes the specified report definition. Only the user created report definition can be
     * deleted. The seeded report definitions cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteReportDefinitionResponse> deleteReportDefinition(
            DeleteReportDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteReportDefinitionRequest, DeleteReportDefinitionResponse>
                    handler);

    /**
     * Deletes the specified saved security assessment or schedule. To delete a security assessment
     * schedule, first call the operation ListSecurityAssessments with filters \"type =
     * save_schedule\". That operation returns the scheduleAssessmentId. Then, call
     * DeleteSecurityAssessment with the scheduleAssessmentId. If the assessment being deleted is
     * the baseline for that compartment, then it will impact all baselines in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityAssessmentResponse> deleteSecurityAssessment(
            DeleteSecurityAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityAssessmentRequest, DeleteSecurityAssessmentResponse>
                    handler);

    /**
     * Deletes the specified sensitive column.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSensitiveColumnResponse> deleteSensitiveColumn(
            DeleteSensitiveColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveColumnRequest, DeleteSensitiveColumnResponse>
                    handler);

    /**
     * Deletes the specified sensitive data model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSensitiveDataModelResponse> deleteSensitiveDataModel(
            DeleteSensitiveDataModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveDataModelRequest, DeleteSensitiveDataModelResponse>
                    handler);

    /**
     * Deletes the specified sensitive type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSensitiveTypeResponse> deleteSensitiveType(
            DeleteSensitiveTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSensitiveTypeRequest, DeleteSensitiveTypeResponse>
                    handler);

    /**
     * Deletes the specified target-alert policy Association.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTargetAlertPolicyAssociationResponse>
            deleteTargetAlertPolicyAssociation(
                    DeleteTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteTargetAlertPolicyAssociationRequest,
                                    DeleteTargetAlertPolicyAssociationResponse>
                            handler);

    /**
     * Deregisters the specified database from Data Safe and removes the target database from the
     * Data Safe Console.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTargetDatabaseResponse> deleteTargetDatabase(
            DeleteTargetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTargetDatabaseRequest, DeleteTargetDatabaseResponse>
                    handler);

    /**
     * Deletes the specified saved user assessment or schedule. To delete a user assessment
     * schedule, first call the operation ListUserAssessments with filters \"type = save_schedule\".
     * That call returns the scheduleAssessmentId. Then call DeleteUserAssessment with the
     * scheduleAssessmentId. If the assessment being deleted is the baseline for that compartment,
     * then it will impact all baselines in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUserAssessmentResponse> deleteUserAssessment(
            DeleteUserAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserAssessmentRequest, DeleteUserAssessmentResponse>
                    handler);

    /**
     * Updates the list of audit trails created under audit profile.The operation can be used to
     * create new audit trails for target database when they become available for audit collection
     * because of change of database version or change of database unified mode or change of data
     * base edition or being deleted previously etc.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DiscoverAuditTrailsResponse> discoverAuditTrails(
            DiscoverAuditTrailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DiscoverAuditTrailsRequest, DiscoverAuditTrailsResponse>
                    handler);

    /**
     * Downloads an already-generated discovery report. Note that the
     * GenerateDiscoveryReportForDownload operation is a prerequisite for the
     * DownloadDiscoveryReport operation. Use GenerateDiscoveryReportForDownload to generate a
     * discovery report file and then use DownloadDiscoveryReport to download the generated file. By
     * default, it downloads report for all the columns in a sensitive data model. Use the
     * discoveryJobId attribute to download report for a specific discovery job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadDiscoveryReportResponse> downloadDiscoveryReport(
            DownloadDiscoveryReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadDiscoveryReportRequest, DownloadDiscoveryReportResponse>
                    handler);

    /**
     * Downloads the masking log generated by the last masking operation on a target database using
     * the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadMaskingLogResponse> downloadMaskingLog(
            DownloadMaskingLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingLogRequest, DownloadMaskingLogResponse>
                    handler);

    /**
     * Downloads an already-generated file corresponding to the specified masking policy. Note that
     * the GenerateMaskingPolicyForDownload operation is a prerequisite for the
     * DownloadMaskingPolicy operation. Use GenerateMaskingPolicyForDownload to generate a masking
     * policy file and then use DownloadMaskingPolicy to download the generated file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadMaskingPolicyResponse> downloadMaskingPolicy(
            DownloadMaskingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingPolicyRequest, DownloadMaskingPolicyResponse>
                    handler);

    /**
     * Downloads an already-generated masking report. Note that the GenerateMaskingReportForDownload
     * operation is a prerequisite for the DownloadMaskingReport operation. Use
     * GenerateMaskingReportForDownload to generate a masking report file and then use
     * DownloadMaskingReport to download the generated file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadMaskingReportResponse> downloadMaskingReport(
            DownloadMaskingReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadMaskingReportRequest, DownloadMaskingReportResponse>
                    handler);

    /**
     * Downloads the privilege script to grant/revoke required roles from the Data Safe account on
     * the target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadPrivilegeScriptResponse> downloadPrivilegeScript(
            DownloadPrivilegeScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadPrivilegeScriptRequest, DownloadPrivilegeScriptResponse>
                    handler);

    /**
     * Downloads the report of the specified security assessment. To download the security
     * assessment report, it needs to be generated first. Please use
     * GenerateSecurityAssessmentReport to generate a downloadable report in the preferred format
     * (PDF, XLS).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadSecurityAssessmentReportResponse>
            downloadSecurityAssessmentReport(
                    DownloadSecurityAssessmentReportRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadSecurityAssessmentReportRequest,
                                    DownloadSecurityAssessmentReportResponse>
                            handler);

    /**
     * Downloads an already-generated file corresponding to the specified sensitive data model. Note
     * that the GenerateSensitiveDataModelForDownload operation is a prerequisite for the
     * DownloadSensitiveDataModel operation. Use GenerateSensitiveDataModelForDownload to generate a
     * data model file and then use DownloadSensitiveDataModel to download the generated file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadSensitiveDataModelResponse> downloadSensitiveDataModel(
            DownloadSensitiveDataModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadSensitiveDataModelRequest, DownloadSensitiveDataModelResponse>
                    handler);

    /**
     * Downloads the report of the specified user assessment. To download the user assessment
     * report, it needs to be generated first. Please use GenerateUserAssessmentReport to generate a
     * downloadable report in the preferred format (PDF, XLS).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadUserAssessmentReportResponse> downloadUserAssessmentReport(
            DownloadUserAssessmentReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DownloadUserAssessmentReportRequest,
                            DownloadUserAssessmentReportResponse>
                    handler);

    /**
     * Enables Data Safe in the tenancy and region.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableDataSafeConfigurationResponse> enableDataSafeConfiguration(
            EnableDataSafeConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableDataSafeConfigurationRequest, EnableDataSafeConfigurationResponse>
                    handler);

    /**
     * Generates a downloadable discovery report. It's a prerequisite for the
     * DownloadDiscoveryReport operation. Use this endpoint to generate a discovery report file and
     * then use DownloadDiscoveryReport to download the generated file. By default, it generates
     * report for all the columns in a sensitive data model. Use the discoveryJobId attribute to
     * generate report for a specific discovery job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateDiscoveryReportForDownloadResponse>
            generateDiscoveryReportForDownload(
                    GenerateDiscoveryReportForDownloadRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateDiscoveryReportForDownloadRequest,
                                    GenerateDiscoveryReportForDownloadResponse>
                            handler);

    /**
     * Generates a downloadable file corresponding to the specified masking policy. It's a
     * prerequisite for the DownloadMaskingPolicy operation. Use this endpoint to generate a masking
     * policy file and then use DownloadMaskingPolicy to download the generated file. Note that file
     * generation and download are serial operations. The download operation can't be invoked while
     * the generate operation is in progress.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateMaskingPolicyForDownloadResponse>
            generateMaskingPolicyForDownload(
                    GenerateMaskingPolicyForDownloadRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingPolicyForDownloadRequest,
                                    GenerateMaskingPolicyForDownloadResponse>
                            handler);

    /**
     * Generates a downloadable masking report. It's a prerequisite for the DownloadMaskingReport
     * operation. Use this endpoint to generate a masking report file and then use
     * DownloadMaskingReport to download the generated file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateMaskingReportForDownloadResponse>
            generateMaskingReportForDownload(
                    GenerateMaskingReportForDownloadRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateMaskingReportForDownloadRequest,
                                    GenerateMaskingReportForDownloadResponse>
                            handler);

    /**
     * Creates and downloads the configuration of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateOnPremConnectorConfigurationResponse>
            generateOnPremConnectorConfiguration(
                    GenerateOnPremConnectorConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateOnPremConnectorConfigurationRequest,
                                    GenerateOnPremConnectorConfigurationResponse>
                            handler);

    /**
     * Generates a PDF or XLS report based on parameters and report definition.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateReportResponse> generateReport(
            GenerateReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GenerateReportRequest, GenerateReportResponse>
                    handler);

    /**
     * Generates the report of the specified security assessment. You can get the report in PDF or
     * XLS format. After generating the report, use DownloadSecurityAssessmentReport to download it
     * in the preferred format.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateSecurityAssessmentReportResponse>
            generateSecurityAssessmentReport(
                    GenerateSecurityAssessmentReportRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSecurityAssessmentReportRequest,
                                    GenerateSecurityAssessmentReportResponse>
                            handler);

    /**
     * Generates a downloadable file corresponding to the specified sensitive data model. It's a
     * prerequisite for the DownloadSensitiveDataModel operation. Use this endpoint to generate a
     * data model file and then use DownloadSensitiveDataModel to download the generated file. Note
     * that file generation and download are serial operations. The download operation can't be
     * invoked while the generate operation is in progress.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateSensitiveDataModelForDownloadResponse>
            generateSensitiveDataModelForDownload(
                    GenerateSensitiveDataModelForDownloadRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateSensitiveDataModelForDownloadRequest,
                                    GenerateSensitiveDataModelForDownloadResponse>
                            handler);

    /**
     * Generates the report of the specified user assessment. The report is available in PDF or XLS
     * format. After generating the report, use DownloadUserAssessmentReport to download it in the
     * preferred format.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateUserAssessmentReportResponse> generateUserAssessmentReport(
            GenerateUserAssessmentReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateUserAssessmentReportRequest,
                            GenerateUserAssessmentReportResponse>
                    handler);

    /**
     * Gets the details of alert by its ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAlertResponse> getAlert(
            GetAlertRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAlertRequest, GetAlertResponse> handler);

    /**
     * Gets the details of alert policy by its ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAlertPolicyResponse> getAlertPolicy(
            GetAlertPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAlertPolicyRequest, GetAlertPolicyResponse>
                    handler);

    /**
     * Gets the details of the specified archive retreival.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAuditArchiveRetrievalResponse> getAuditArchiveRetrieval(
            GetAuditArchiveRetrievalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAuditArchiveRetrievalRequest, GetAuditArchiveRetrievalResponse>
                    handler);

    /**
     * Gets a audit policy by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAuditPolicyResponse> getAuditPolicy(
            GetAuditPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAuditPolicyRequest, GetAuditPolicyResponse>
                    handler);

    /**
     * Gets the details of audit profile resource and associated audit trails of the audit profile.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAuditProfileResponse> getAuditProfile(
            GetAuditProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAuditProfileRequest, GetAuditProfileResponse>
                    handler);

    /**
     * Gets the details of audit trail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAuditTrailResponse> getAuditTrail(
            GetAuditTrailRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAuditTrailRequest, GetAuditTrailResponse>
                    handler);

    /**
     * Gets a list of basic masking formats compatible with the supported data types. The data types
     * are grouped into the following categories - Character - Includes CHAR, NCHAR, VARCHAR2, and
     * NVARCHAR2 Numeric - Includes NUMBER, FLOAT, RAW, BINARY_FLOAT, and BINARY_DOUBLE Date -
     * Includes DATE and TIMESTAMP LOB - Includes BLOB, CLOB, and NCLOB All - Includes all the
     * supported data types
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCompatibleFormatsForDataTypesResponse>
            getCompatibleFormatsForDataTypes(
                    GetCompatibleFormatsForDataTypesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForDataTypesRequest,
                                    GetCompatibleFormatsForDataTypesResponse>
                            handler);

    /**
     * Gets a list of library masking formats compatible with the existing sensitive types. For each
     * sensitive type, it returns the assigned default masking format as well as the other library
     * masking formats that have the sensitiveTypeIds attribute containing the OCID of the sensitive
     * type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCompatibleFormatsForSensitiveTypesResponse>
            getCompatibleFormatsForSensitiveTypes(
                    GetCompatibleFormatsForSensitiveTypesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCompatibleFormatsForSensitiveTypesRequest,
                                    GetCompatibleFormatsForSensitiveTypesResponse>
                            handler);

    /**
     * Gets the details of the Data Safe configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataSafeConfigurationResponse> getDataSafeConfiguration(
            GetDataSafeConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDataSafeConfigurationRequest, GetDataSafeConfigurationResponse>
                    handler);

    /**
     * Gets the details of the specified Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataSafePrivateEndpointResponse> getDataSafePrivateEndpoint(
            GetDataSafePrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDataSafePrivateEndpointRequest, GetDataSafePrivateEndpointResponse>
                    handler);

    /**
     * Gets the details of the specified discovery job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler);

    /**
     * Gets the details of the specified discovery result.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDiscoveryJobResultResponse> getDiscoveryJobResult(
            GetDiscoveryJobResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDiscoveryJobResultRequest, GetDiscoveryJobResultResponse>
                    handler);

    /**
     * Gets the details of the specified library masking format.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLibraryMaskingFormatResponse> getLibraryMaskingFormat(
            GetLibraryMaskingFormatRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLibraryMaskingFormatRequest, GetLibraryMaskingFormatResponse>
                    handler);

    /**
     * Gets the details of the specified masking column.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMaskingColumnResponse> getMaskingColumn(
            GetMaskingColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMaskingColumnRequest, GetMaskingColumnResponse>
                    handler);

    /**
     * Gets the details of the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMaskingPolicyResponse> getMaskingPolicy(
            GetMaskingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMaskingPolicyRequest, GetMaskingPolicyResponse>
                    handler);

    /**
     * Gets the details of the specified masking report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMaskingReportResponse> getMaskingReport(
            GetMaskingReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMaskingReportRequest, GetMaskingReportResponse>
                    handler);

    /**
     * Gets the details of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOnPremConnectorResponse> getOnPremConnector(
            GetOnPremConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOnPremConnectorRequest, GetOnPremConnectorResponse>
                    handler);

    /**
     * Gets a report by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetReportResponse> getReport(
            GetReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetReportRequest, GetReportResponse> handler);

    /**
     * Downloads the specified report in the form of PDF or XLXS.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetReportContentResponse> getReportContent(
            GetReportContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetReportContentRequest, GetReportContentResponse>
                    handler);

    /**
     * Gets the details of report definition specified by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetReportDefinitionResponse> getReportDefinition(
            GetReportDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetReportDefinitionRequest, GetReportDefinitionResponse>
                    handler);

    /**
     * Gets the details of the specified security assessment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityAssessmentResponse> getSecurityAssessment(
            GetSecurityAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSecurityAssessmentRequest, GetSecurityAssessmentResponse>
                    handler);

    /**
     * Gets the details of the comparison report on the security assessments submitted for
     * comparison.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityAssessmentComparisonResponse>
            getSecurityAssessmentComparison(
                    GetSecurityAssessmentComparisonRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetSecurityAssessmentComparisonRequest,
                                    GetSecurityAssessmentComparisonResponse>
                            handler);

    /**
     * Gets the details of the specified sensitive column.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSensitiveColumnResponse> getSensitiveColumn(
            GetSensitiveColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveColumnRequest, GetSensitiveColumnResponse>
                    handler);

    /**
     * Gets the details of the specified sensitive data model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSensitiveDataModelResponse> getSensitiveDataModel(
            GetSensitiveDataModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSensitiveDataModelRequest, GetSensitiveDataModelResponse>
                    handler);

    /**
     * Gets the details of the specified sensitive type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSensitiveTypeResponse> getSensitiveType(
            GetSensitiveTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSensitiveTypeRequest, GetSensitiveTypeResponse>
                    handler);

    /**
     * Gets the details of target-alert policy association by its ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetAlertPolicyAssociationResponse>
            getTargetAlertPolicyAssociation(
                    GetTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTargetAlertPolicyAssociationRequest,
                                    GetTargetAlertPolicyAssociationResponse>
                            handler);

    /**
     * Returns the details of the specified Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTargetDatabaseResponse> getTargetDatabase(
            GetTargetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTargetDatabaseRequest, GetTargetDatabaseResponse>
                    handler);

    /**
     * Gets a user assessment by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUserAssessmentResponse> getUserAssessment(
            GetUserAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserAssessmentRequest, GetUserAssessmentResponse>
                    handler);

    /**
     * Gets the details of the comparison report for the user assessments provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUserAssessmentComparisonResponse> getUserAssessmentComparison(
            GetUserAssessmentComparisonRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserAssessmentComparisonRequest, GetUserAssessmentComparisonResponse>
                    handler);

    /**
     * Gets the details of the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Returns aggregation details of alerts.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAlertAnalyticsResponse> listAlertAnalytics(
            ListAlertAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAlertAnalyticsRequest, ListAlertAnalyticsResponse>
                    handler);

    /**
     * Gets a list of all alert policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAlertPoliciesResponse> listAlertPolicies(
            ListAlertPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPoliciesRequest, ListAlertPoliciesResponse>
                    handler);

    /**
     * Lists the rules of the specified alert policy. The alert policy is said to be satisfied when
     * all rules in the policy evaulate to true. If there are three rules: rule1,rule2 and rule3,
     * the policy is satisfied if rule1 AND rule2 AND rule3 is True.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAlertPolicyRulesResponse> listAlertPolicyRules(
            ListAlertPolicyRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAlertPolicyRulesRequest, ListAlertPolicyRulesResponse>
                    handler);

    /**
     * Gets a list of all alerts.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAlertsResponse> listAlerts(
            ListAlertsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAlertsRequest, ListAlertsResponse> handler);

    /**
     * Returns the list of audit archive retrieval.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditArchiveRetrievalsResponse> listAuditArchiveRetrievals(
            ListAuditArchiveRetrievalsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuditArchiveRetrievalsRequest, ListAuditArchiveRetrievalsResponse>
                    handler);

    /**
     * By default ListAuditEventAnalytics operation will return all of the summary columns. To
     * filter desired summary columns, specify it in the `summaryOf` query parameter.
     *
     * <p>*Example:**
     * /ListAuditEventAnalytics?summaryField=targetName&summaryField=userName&summaryField=clientHostName&summaryField
     * &summaryField=dmls&summaryField=privilege_changes&summaryField=ddls&summaryField=login_failure&summaryField=login_success
     * &summaryField=eventcount&q=(operationTime ge '2021-06-13T23:49:14')&groupBy=targetName
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditEventAnalyticsResponse> listAuditEventAnalytics(
            ListAuditEventAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuditEventAnalyticsRequest, ListAuditEventAnalyticsResponse>
                    handler);

    /**
     * The ListAuditEvents operation returns specified `compartmentId` audit Events only. The list
     * does not include any audit Events associated with the `subcompartments` of the specified
     * `compartmentId`.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditEvents on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditEventsResponse> listAuditEvents(
            ListAuditEventsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAuditEventsRequest, ListAuditEventsResponse>
                    handler);

    /**
     * Retrieves a list of all audited targets with their corresponding provisioned audit policies,
     * and their provisioning conditions.
     *
     * <p>The ListAuditPolicies operation returns only the audit policies in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditPolicies on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditPoliciesResponse> listAuditPolicies(
            ListAuditPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuditPoliciesRequest, ListAuditPoliciesResponse>
                    handler);

    /**
     * Gets a list of audit profile aggregated details . A audit profile aggregation helps
     * understand the overall state of audit profile profiles. As an example, it helps understand
     * how many audit profiles have paid usage. It is especially useful to create dashboards or to
     * support analytics.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform AuditProfileAnalytics on
     * the `compartmentId` passed and when it is set to true, the entire hierarchy of compartments
     * can be returned. To get a full list of all compartments and subcompartments in the tenancy
     * (root compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditProfileAnalyticsResponse> listAuditProfileAnalytics(
            ListAuditProfileAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfileAnalyticsRequest, ListAuditProfileAnalyticsResponse>
                    handler);

    /**
     * Gets a list of all audit profiles.
     *
     * <p>The ListAuditProfiles operation returns only the audit profiles in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditProfiles on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditProfilesResponse> listAuditProfiles(
            ListAuditProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuditProfilesRequest, ListAuditProfilesResponse>
                    handler);

    /**
     * Gets a list of audit trail aggregated details . A audit trail aggregation helps understand
     * the overall state of trails. As an example, it helps understand how many trails are running
     * or stopped. It is especially useful to create dashboards or to support analytics.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform AuditTrailAnalytics on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditTrailAnalyticsResponse> listAuditTrailAnalytics(
            ListAuditTrailAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuditTrailAnalyticsRequest, ListAuditTrailAnalyticsResponse>
                    handler);

    /**
     * Gets a list of all audit trails. The ListAuditTrails operation returns only the audit trails
     * in the specified `compartmentId`. The list does not include any subcompartments of the
     * compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListAuditTrails on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuditTrailsResponse> listAuditTrails(
            ListAuditTrailsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAuditTrailsRequest, ListAuditTrailsResponse>
                    handler);

    /**
     * Retrieves a list of audit trails, and associated audit event volume for each trail up to
     * defined start date.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableAuditVolumesResponse> listAvailableAuditVolumes(
            ListAvailableAuditVolumesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableAuditVolumesRequest, ListAvailableAuditVolumesResponse>
                    handler);

    /**
     * Gets a list of all collected audit volume data points.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCollectedAuditVolumesResponse> listCollectedAuditVolumes(
            ListCollectedAuditVolumesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCollectedAuditVolumesRequest, ListCollectedAuditVolumesResponse>
                    handler);

    /**
     * Returns a list of column metadata objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListColumnsResponse> listColumns(
            ListColumnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListColumnsRequest, ListColumnsResponse> handler);

    /**
     * Gets a list of Data Safe private endpoints.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataSafePrivateEndpointsResponse> listDataSafePrivateEndpoints(
            ListDataSafePrivateEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataSafePrivateEndpointsRequest,
                            ListDataSafePrivateEndpointsResponse>
                    handler);

    /**
     * Gets consolidated discovery analytics data based on the specified query parameters. If
     * CompartmentIdInSubtreeQueryParam is specified as true, the behaviour is equivalent to
     * accessLevel \"ACCESSIBLE\" by default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDiscoveryAnalyticsResponse> listDiscoveryAnalytics(
            ListDiscoveryAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryAnalyticsRequest, ListDiscoveryAnalyticsResponse>
                    handler);

    /**
     * Gets a list of discovery results based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDiscoveryJobResultsResponse> listDiscoveryJobResults(
            ListDiscoveryJobResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobResultsRequest, ListDiscoveryJobResultsResponse>
                    handler);

    /**
     * Gets a list of incremental discovery jobs based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler);

    /**
     * List all the findings from all the targets in the specified assessment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFindingsResponse> listFindings(
            ListFindingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFindingsRequest, ListFindingsResponse>
                    handler);

    /**
     * Gets a list of grants for a particular user in the specified user assessment. A user grant
     * contains details such as the privilege name, type, category, and depth level. The depth level
     * indicates how deep in the hierarchy of roles granted to roles a privilege grant is. The
     * userKey in this operation is a system-generated identifier. Perform the operation ListUsers
     * to get the userKey for a particular user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListGrantsResponse> listGrants(
            ListGrantsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGrantsRequest, ListGrantsResponse> handler);

    /**
     * Gets a list of library masking formats based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLibraryMaskingFormatsResponse> listLibraryMaskingFormats(
            ListLibraryMaskingFormatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLibraryMaskingFormatsRequest, ListLibraryMaskingFormatsResponse>
                    handler);

    /**
     * Gets a list of masked columns present in the specified masking report and based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMaskedColumnsResponse> listMaskedColumns(
            ListMaskedColumnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaskedColumnsRequest, ListMaskedColumnsResponse>
                    handler);

    /**
     * Gets consolidated masking analytics data based on the specified query parameters. If
     * CompartmentIdInSubtreeQueryParam is specified as true, the behaviour is equivalent to
     * accessLevel \"ACCESSIBLE\" by default.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMaskingAnalyticsResponse> listMaskingAnalytics(
            ListMaskingAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingAnalyticsRequest, ListMaskingAnalyticsResponse>
                    handler);

    /**
     * Gets a list of masking columns present in the specified masking policy and based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMaskingColumnsResponse> listMaskingColumns(
            ListMaskingColumnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingColumnsRequest, ListMaskingColumnsResponse>
                    handler);

    /**
     * Gets a list of masking policies based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMaskingPoliciesResponse> listMaskingPolicies(
            ListMaskingPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingPoliciesRequest, ListMaskingPoliciesResponse>
                    handler);

    /**
     * Gets a list of masking reports based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMaskingReportsResponse> listMaskingReports(
            ListMaskingReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaskingReportsRequest, ListMaskingReportsResponse>
                    handler);

    /**
     * Gets a list of on-premises connectors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOnPremConnectorsResponse> listOnPremConnectors(
            ListOnPremConnectorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOnPremConnectorsRequest, ListOnPremConnectorsResponse>
                    handler);

    /**
     * Gets a list of report definitions. The ListReportDefinitions operation returns only the
     * report definitions in the specified `compartmentId`. It also returns the seeded report
     * definitions which are available to all the compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListReportDefinitionsResponse> listReportDefinitions(
            ListReportDefinitionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListReportDefinitionsRequest, ListReportDefinitionsResponse>
                    handler);

    /**
     * Gets a list of all the reports in the compartment. It contains information such as report
     * generation time.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListReportsResponse> listReports(
            ListReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse> handler);

    /**
     * Returns a list of role metadata objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRolesResponse> listRoles(
            ListRolesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRolesRequest, ListRolesResponse> handler);

    /**
     * Returns list of schema.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse> handler);

    /**
     * Gets a list of security assessments.
     *
     * <p>The ListSecurityAssessments operation returns only the assessments in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListSecurityAssessments on
     * the `compartmentId` passed and when it is set to true, the entire hierarchy of compartments
     * can be returned. To get a full list of all compartments and subcompartments in the tenancy
     * (root compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityAssessmentsResponse> listSecurityAssessments(
            ListSecurityAssessmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityAssessmentsRequest, ListSecurityAssessmentsResponse>
                    handler);

    /**
     * Gets a list of sensitive columns present in the specified sensitive data model based on the
     * specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSensitiveColumnsResponse> listSensitiveColumns(
            ListSensitiveColumnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveColumnsRequest, ListSensitiveColumnsResponse>
                    handler);

    /**
     * Gets a list of sensitive data models based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSensitiveDataModelsResponse> listSensitiveDataModels(
            ListSensitiveDataModelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveDataModelsRequest, ListSensitiveDataModelsResponse>
                    handler);

    /**
     * Gets a list of sensitive types based on the specified query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSensitiveTypesResponse> listSensitiveTypes(
            ListSensitiveTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSensitiveTypesRequest, ListSensitiveTypesResponse>
                    handler);

    /**
     * Returns a list of table metadata objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTablesResponse> listTables(
            ListTablesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTablesRequest, ListTablesResponse> handler);

    /**
     * Gets a list of all target-alert policy associations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetAlertPolicyAssociationsResponse>
            listTargetAlertPolicyAssociations(
                    ListTargetAlertPolicyAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListTargetAlertPolicyAssociationsRequest,
                                    ListTargetAlertPolicyAssociationsResponse>
                            handler);

    /**
     * Returns the list of registered target databases in Data Safe.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTargetDatabasesResponse> listTargetDatabases(
            ListTargetDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTargetDatabasesRequest, ListTargetDatabasesResponse>
                    handler);

    /**
     * Gets a list of aggregated user details from the specified user assessment. This provides
     * information about the overall state of database user security. For example, the user details
     * include how many users have the DBA role and how many users are in the critical category.
     * This data is especially useful content for dashboards or to support analytics.
     *
     * <p>When you perform the ListUserAnalytics operation, if the parameter compartmentIdInSubtree
     * is set to \"true,\" and if the parameter accessLevel is set to ACCESSIBLE, then the operation
     * returns compartments in which the requestor has INSPECT permissions on at least one resource,
     * directly or indirectly (in subcompartments). If the operation is performed at the root
     * compartment. If the requestor does not have access to at least one subcompartment of the
     * compartment specified by compartmentId, then \"Not Authorized\" is returned.
     *
     * <p>The parameter compartmentIdInSubtree applies when you perform ListUserAnalytics on the
     * compartmentId passed and when it is set to true, the entire hierarchy of compartments can be
     * returned.
     *
     * <p>To use ListUserAnalytics to get a full list of all compartments and subcompartments in the
     * tenancy from the root compartment, set the parameter compartmentIdInSubtree to true and
     * accessLevel to ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUserAnalyticsResponse> listUserAnalytics(
            ListUserAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserAnalyticsRequest, ListUserAnalyticsResponse>
                    handler);

    /**
     * Gets a list of user assessments.
     *
     * <p>The ListUserAssessments operation returns only the assessments in the specified
     * `compartmentId`. The list does not include any subcompartments of the compartmentId passed.
     *
     * <p>The parameter `accessLevel` specifies whether to return only those compartments for which
     * the requestor has INSPECT permissions on at least one resource directly or indirectly
     * (ACCESSIBLE) (the resource can be in a subcompartment) or to return Not Authorized if
     * Principal doesn't have access to even one of the child compartments. This is valid only when
     * `compartmentIdInSubtree` is set to `true`.
     *
     * <p>The parameter `compartmentIdInSubtree` applies when you perform ListUserAssessments on the
     * `compartmentId` passed and when it is set to true, the entire hierarchy of compartments can
     * be returned. To get a full list of all compartments and subcompartments in the tenancy (root
     * compartment), set the parameter `compartmentIdInSubtree` to true and `accessLevel` to
     * ACCESSIBLE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUserAssessmentsResponse> listUserAssessments(
            ListUserAssessmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserAssessmentsRequest, ListUserAssessmentsResponse>
                    handler);

    /**
     * Gets a list of users of the specified user assessment. The result contains the database user
     * details for each user, such as user type, account status, last login time, user creation
     * time, authentication type, user profile, and the date and time of the latest password change.
     * It also contains the user category derived from these user details as well as privileges
     * granted to each user.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUsersResponse> listUsers(
            ListUsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUsersRequest, ListUsersResponse> handler);

    /**
     * Gets a list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Gets a list of log entries for the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Gets a list of work requests.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Masks data using the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MaskDataResponse> maskData(
            MaskDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<MaskDataRequest, MaskDataResponse> handler);

    /**
     * Modifies Global Settings in Data Safe in the tenancy and region.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ModifyGlobalSettingsResponse> modifyGlobalSettings(
            ModifyGlobalSettingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ModifyGlobalSettingsRequest, ModifyGlobalSettingsResponse>
                    handler);

    /**
     * Patch alerts. Updates one or more alerts by specifying alert Ids.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchAlertsResponse> patchAlerts(
            PatchAlertsRequest request,
            com.oracle.bmc.responses.AsyncHandler<PatchAlertsRequest, PatchAlertsResponse> handler);

    /**
     * Patches one or more discovery results. You can use this operation to set the plannedAction
     * attribute before using ApplyDiscoveryJobResults to process the results based on this
     * attribute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchDiscoveryJobResultsResponse> patchDiscoveryJobResults(
            PatchDiscoveryJobResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchDiscoveryJobResultsRequest, PatchDiscoveryJobResultsResponse>
                    handler);

    /**
     * Patches one or more columns in the specified masking policy. Use it to create, or update
     * masking columns. To create masking columns, use CreateMaskingColumnDetails as the patch
     * value. And to update masking columns, use UpdateMaskingColumnDetails as the patch value.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchMaskingColumnsResponse> patchMaskingColumns(
            PatchMaskingColumnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchMaskingColumnsRequest, PatchMaskingColumnsResponse>
                    handler);

    /**
     * Patches one or more columns in the specified sensitive data model. Use it to create, update,
     * or delete sensitive columns. To create sensitive columns, use CreateSensitiveColumnDetails as
     * the patch value. And to update sensitive columns, use UpdateSensitiveColumnDetails as the
     * patch value.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchSensitiveColumnsResponse> patchSensitiveColumns(
            PatchSensitiveColumnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchSensitiveColumnsRequest, PatchSensitiveColumnsResponse>
                    handler);

    /**
     * Creates new target-alert policy associations that will be applied on target.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchTargetAlertPolicyAssociationResponse>
            patchTargetAlertPolicyAssociation(
                    PatchTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PatchTargetAlertPolicyAssociationRequest,
                                    PatchTargetAlertPolicyAssociationResponse>
                            handler);

    /**
     * Provision audit policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ProvisionAuditPolicyResponse> provisionAuditPolicy(
            ProvisionAuditPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ProvisionAuditPolicyRequest, ProvisionAuditPolicyResponse>
                    handler);

    /**
     * Runs a security assessment, refreshes the latest assessment, and saves it for future
     * reference. The assessment runs with a securityAssessmentId of type LATEST. Before you start,
     * first call the ListSecurityAssessments operation with filter \"type = latest\" to get the
     * security assessment id for the target's latest assessment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RefreshSecurityAssessmentResponse> refreshSecurityAssessment(
            RefreshSecurityAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RefreshSecurityAssessmentRequest, RefreshSecurityAssessmentResponse>
                    handler);

    /**
     * Refreshes the latest assessment and saves it for future reference. This operation runs with a
     * userAssessmentId of type LATEST. Before you start, first call the ListUserAssessments
     * operation with filter \"type = latest\" to get the user assessment ID for the target's latest
     * assessment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RefreshUserAssessmentResponse> refreshUserAssessment(
            RefreshUserAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RefreshUserAssessmentRequest, RefreshUserAssessmentResponse>
                    handler);

    /**
     * Deletes schedule of a PDF or XLS report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveScheduleReportResponse> removeScheduleReport(
            RemoveScheduleReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveScheduleReportRequest, RemoveScheduleReportResponse>
                    handler);

    /**
     * Resumes the specified audit trail once it got stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResumeAuditTrailResponse> resumeAuditTrail(
            ResumeAuditTrailRequest request,
            com.oracle.bmc.responses.AsyncHandler<ResumeAuditTrailRequest, ResumeAuditTrailResponse>
                    handler);

    /**
     * Resume the given work request. Issuing a resume does not guarantee of immediate resume of the
     * work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ResumeWorkRequestResponse> resumeWorkRequest(
            ResumeWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ResumeWorkRequestRequest, ResumeWorkRequestResponse>
                    handler);

    /**
     * Retrieves the audit policy details from the source target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RetrieveAuditPoliciesResponse> retrieveAuditPolicies(
            RetrieveAuditPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RetrieveAuditPoliciesRequest, RetrieveAuditPoliciesResponse>
                    handler);

    /**
     * Schedules a PDF or XLS report based on parameters and report definition.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleReportResponse> scheduleReport(
            ScheduleReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<ScheduleReportRequest, ScheduleReportResponse>
                    handler);

    /**
     * Sets the saved security assessment as the baseline in the compartment where the the specified
     * assessment resides. The security assessment needs to be of type 'SAVED'.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SetSecurityAssessmentBaselineResponse>
            setSecurityAssessmentBaseline(
                    SetSecurityAssessmentBaselineRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SetSecurityAssessmentBaselineRequest,
                                    SetSecurityAssessmentBaselineResponse>
                            handler);

    /**
     * Sets the saved user assessment as the baseline in the compartment where the specified
     * assessment resides. The user assessment needs to be of type 'SAVED'.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SetUserAssessmentBaselineResponse> setUserAssessmentBaseline(
            SetUserAssessmentBaselineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SetUserAssessmentBaselineRequest, SetUserAssessmentBaselineResponse>
                    handler);

    /**
     * Starts collection of audit records on the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartAuditTrailResponse> startAuditTrail(
            StartAuditTrailRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartAuditTrailRequest, StartAuditTrailResponse>
                    handler);

    /**
     * Stops the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopAuditTrailResponse> stopAuditTrail(
            StopAuditTrailRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopAuditTrailRequest, StopAuditTrailResponse>
                    handler);

    /**
     * Suspend the given work request. Issuing a suspend does not guarantee of a immediate suspend
     * of the work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SuspendWorkRequestResponse> suspendWorkRequest(
            SuspendWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SuspendWorkRequestRequest, SuspendWorkRequestResponse>
                    handler);

    /**
     * Removes the baseline setting for the saved security assessment. The saved security assessment
     * is no longer considered a baseline. Sets the if-match parameter to the value of the etag from
     * a previous GET or POST response for that resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnsetSecurityAssessmentBaselineResponse>
            unsetSecurityAssessmentBaseline(
                    UnsetSecurityAssessmentBaselineRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UnsetSecurityAssessmentBaselineRequest,
                                    UnsetSecurityAssessmentBaselineResponse>
                            handler);

    /**
     * Removes the baseline setting for the saved user assessment. The saved user assessment is no
     * longer considered a baseline. Sets the if-match parameter to the value of the etag from a
     * previous GET or POST response for that resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnsetUserAssessmentBaselineResponse> unsetUserAssessmentBaseline(
            UnsetUserAssessmentBaselineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UnsetUserAssessmentBaselineRequest, UnsetUserAssessmentBaselineResponse>
                    handler);

    /**
     * Updates alert status of the specified alert.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAlertResponse> updateAlert(
            UpdateAlertRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAlertRequest, UpdateAlertResponse> handler);

    /**
     * Updates the audit archive retrieval.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuditArchiveRetrievalResponse> updateAuditArchiveRetrieval(
            UpdateAuditArchiveRetrievalRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditArchiveRetrievalRequest, UpdateAuditArchiveRetrievalResponse>
                    handler);

    /**
     * Updates the audit policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuditPolicyResponse> updateAuditPolicy(
            UpdateAuditPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditPolicyRequest, UpdateAuditPolicyResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified audit profile.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuditProfileResponse> updateAuditProfile(
            UpdateAuditProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuditProfileRequest, UpdateAuditProfileResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified audit trail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuditTrailResponse> updateAuditTrail(
            UpdateAuditTrailRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAuditTrailRequest, UpdateAuditTrailResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified Data Safe private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataSafePrivateEndpointResponse>
            updateDataSafePrivateEndpoint(
                    UpdateDataSafePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSafePrivateEndpointRequest,
                                    UpdateDataSafePrivateEndpointResponse>
                            handler);

    /**
     * Updates one or more attributes of the specified library masking format. Note that updating
     * the formatEntries attribute replaces all the existing masking format entries with the
     * specified format entries.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLibraryMaskingFormatResponse> updateLibraryMaskingFormat(
            UpdateLibraryMaskingFormatRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLibraryMaskingFormatRequest, UpdateLibraryMaskingFormatResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified masking column. Note that updating the
     * maskingFormats attribute replaces the currently assigned masking formats with the specified
     * masking formats.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMaskingColumnResponse> updateMaskingColumn(
            UpdateMaskingColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingColumnRequest, UpdateMaskingColumnResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified masking policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMaskingPolicyResponse> updateMaskingPolicy(
            UpdateMaskingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaskingPolicyRequest, UpdateMaskingPolicyResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified on-premises connector.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOnPremConnectorResponse> updateOnPremConnector(
            UpdateOnPremConnectorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnPremConnectorRequest, UpdateOnPremConnectorResponse>
                    handler);

    /**
     * Updates the wallet for the specified on-premises connector to a new version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOnPremConnectorWalletResponse> updateOnPremConnectorWallet(
            UpdateOnPremConnectorWalletRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOnPremConnectorWalletRequest, UpdateOnPremConnectorWalletResponse>
                    handler);

    /**
     * Updates the specified report definition. Only user created report definition can be updated.
     * Seeded report definitions need to be saved as new report definition first.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateReportDefinitionResponse> updateReportDefinition(
            UpdateReportDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateReportDefinitionRequest, UpdateReportDefinitionResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified security assessment. This operation allows to
     * update the security assessment displayName, description, or schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityAssessmentResponse> updateSecurityAssessment(
            UpdateSecurityAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityAssessmentRequest, UpdateSecurityAssessmentResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified sensitive column.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSensitiveColumnResponse> updateSensitiveColumn(
            UpdateSensitiveColumnRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveColumnRequest, UpdateSensitiveColumnResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified sensitive data model. Note that updating any
     * attribute of a sensitive data model does not perform data discovery.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSensitiveDataModelResponse> updateSensitiveDataModel(
            UpdateSensitiveDataModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveDataModelRequest, UpdateSensitiveDataModelResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified sensitive type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSensitiveTypeResponse> updateSensitiveType(
            UpdateSensitiveTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSensitiveTypeRequest, UpdateSensitiveTypeResponse>
                    handler);

    /**
     * Updates the specified target-alert policy association.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetAlertPolicyAssociationResponse>
            updateTargetAlertPolicyAssociation(
                    UpdateTargetAlertPolicyAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateTargetAlertPolicyAssociationRequest,
                                    UpdateTargetAlertPolicyAssociationResponse>
                            handler);

    /**
     * Updates one or more attributes of the specified Data Safe target database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTargetDatabaseResponse> updateTargetDatabase(
            UpdateTargetDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTargetDatabaseRequest, UpdateTargetDatabaseResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified user assessment. This operation allows to
     * update the user assessment displayName, description, or schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserAssessmentResponse> updateUserAssessment(
            UpdateUserAssessmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserAssessmentRequest, UpdateUserAssessmentResponse>
                    handler);

    /**
     * Uploads a masking policy file (also called template) to update the specified masking policy.
     * To create a new masking policy using a file, first use the CreateMaskingPolicy operation to
     * create an empty masking policy and then use this endpoint to upload the masking policy file.
     * Note that the upload operation replaces the content of the specified masking policy,
     * including all the existing columns and masking formats, with the content of the file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UploadMaskingPolicyResponse> uploadMaskingPolicy(
            UploadMaskingPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UploadMaskingPolicyRequest, UploadMaskingPolicyResponse>
                    handler);

    /**
     * Uploads a sensitive data model file (also called template) to update the specified sensitive
     * data model. To create a new sensitive data model using a file, first use the
     * CreateSensitiveDataModel operation to create an empty data model and then use this endpoint
     * to upload the data model file. Note that the upload operation replaces the content of the
     * specified sensitive data model, including all the existing columns and their relationships,
     * with the content of the file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UploadSensitiveDataModelResponse> uploadSensitiveDataModel(
            UploadSensitiveDataModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UploadSensitiveDataModelRequest, UploadSensitiveDataModelResponse>
                    handler);
}
