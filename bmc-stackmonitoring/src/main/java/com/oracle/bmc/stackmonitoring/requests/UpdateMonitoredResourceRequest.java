/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/UpdateMonitoredResourceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMonitoredResourceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class UpdateMonitoredResourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored resource.
     */
    private String monitoredResourceId;

    public String getMonitoredResourceId() {
        return monitoredResourceId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails
            updateMonitoredResourceDetails;

    public com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails
            getUpdateMonitoredResourceDetails() {
        return updateMonitoredResourceDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails getBody$() {
        return updateMonitoredResourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMonitoredResourceRequest,
                    com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String monitoredResourceId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of monitored resource.
         * @return this builder instance
         */
        public Builder monitoredResourceId(String monitoredResourceId) {
            this.monitoredResourceId = monitoredResourceId;
            return this;
        }

        private com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails
                updateMonitoredResourceDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder updateMonitoredResourceDetails(
                com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails
                        updateMonitoredResourceDetails) {
            this.updateMonitoredResourceDetails = updateMonitoredResourceDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateMonitoredResourceRequest o) {
            monitoredResourceId(o.getMonitoredResourceId());
            updateMonitoredResourceDetails(o.getUpdateMonitoredResourceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMonitoredResourceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateMonitoredResourceRequest
         */
        public UpdateMonitoredResourceRequest build() {
            UpdateMonitoredResourceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.stackmonitoring.model.UpdateMonitoredResourceDetails body) {
            updateMonitoredResourceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMonitoredResourceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMonitoredResourceRequest
         */
        public UpdateMonitoredResourceRequest buildWithoutInvocationCallback() {
            UpdateMonitoredResourceRequest request = new UpdateMonitoredResourceRequest();
            request.monitoredResourceId = monitoredResourceId;
            request.updateMonitoredResourceDetails = updateMonitoredResourceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMonitoredResourceRequest(monitoredResourceId, updateMonitoredResourceDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .monitoredResourceId(monitoredResourceId)
                .updateMonitoredResourceDetails(updateMonitoredResourceDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",monitoredResourceId=").append(String.valueOf(this.monitoredResourceId));
        sb.append(",updateMonitoredResourceDetails=")
                .append(String.valueOf(this.updateMonitoredResourceDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMonitoredResourceRequest)) {
            return false;
        }

        UpdateMonitoredResourceRequest other = (UpdateMonitoredResourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.monitoredResourceId, other.monitoredResourceId)
                && java.util.Objects.equals(
                        this.updateMonitoredResourceDetails, other.updateMonitoredResourceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.monitoredResourceId == null
                                ? 43
                                : this.monitoredResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMonitoredResourceDetails == null
                                ? 43
                                : this.updateMonitoredResourceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}