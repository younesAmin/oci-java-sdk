/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/EnableExternalContainerDatabaseStackMonitoringExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use EnableExternalContainerDatabaseStackMonitoringRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class EnableExternalContainerDatabaseStackMonitoringRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model
                        .EnableExternalContainerDatabaseStackMonitoringDetails> {

    /**
     * The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String externalContainerDatabaseId;

    public String getExternalContainerDatabaseId() {
        return externalContainerDatabaseId;
    }
    /**
     * Details to enable Stack Monitoring on the external container database.
     *
     */
    private com.oracle.bmc.database.model.EnableExternalContainerDatabaseStackMonitoringDetails
            enableExternalContainerDatabaseStackMonitoringDetails;

    public com.oracle.bmc.database.model.EnableExternalContainerDatabaseStackMonitoringDetails
            getEnableExternalContainerDatabaseStackMonitoringDetails() {
        return enableExternalContainerDatabaseStackMonitoringDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.EnableExternalContainerDatabaseStackMonitoringDetails
            getBody$() {
        return enableExternalContainerDatabaseStackMonitoringDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EnableExternalContainerDatabaseStackMonitoringRequest,
                    com.oracle.bmc.database.model
                            .EnableExternalContainerDatabaseStackMonitoringDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String externalContainerDatabaseId = null;

        /**
         * The ExternalContainerDatabase [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @return this builder instance
         */
        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            this.externalContainerDatabaseId = externalContainerDatabaseId;
            return this;
        }

        private com.oracle.bmc.database.model.EnableExternalContainerDatabaseStackMonitoringDetails
                enableExternalContainerDatabaseStackMonitoringDetails = null;

        /**
         * Details to enable Stack Monitoring on the external container database.
         *
         * @return this builder instance
         */
        public Builder enableExternalContainerDatabaseStackMonitoringDetails(
                com.oracle.bmc.database.model.EnableExternalContainerDatabaseStackMonitoringDetails
                        enableExternalContainerDatabaseStackMonitoringDetails) {
            this.enableExternalContainerDatabaseStackMonitoringDetails =
                    enableExternalContainerDatabaseStackMonitoringDetails;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(EnableExternalContainerDatabaseStackMonitoringRequest o) {
            externalContainerDatabaseId(o.getExternalContainerDatabaseId());
            enableExternalContainerDatabaseStackMonitoringDetails(
                    o.getEnableExternalContainerDatabaseStackMonitoringDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EnableExternalContainerDatabaseStackMonitoringRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of EnableExternalContainerDatabaseStackMonitoringRequest
         */
        public EnableExternalContainerDatabaseStackMonitoringRequest build() {
            EnableExternalContainerDatabaseStackMonitoringRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.EnableExternalContainerDatabaseStackMonitoringDetails
                        body) {
            enableExternalContainerDatabaseStackMonitoringDetails(body);
            return this;
        }

        /**
         * Build the instance of EnableExternalContainerDatabaseStackMonitoringRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EnableExternalContainerDatabaseStackMonitoringRequest
         */
        public EnableExternalContainerDatabaseStackMonitoringRequest
                buildWithoutInvocationCallback() {
            EnableExternalContainerDatabaseStackMonitoringRequest request =
                    new EnableExternalContainerDatabaseStackMonitoringRequest();
            request.externalContainerDatabaseId = externalContainerDatabaseId;
            request.enableExternalContainerDatabaseStackMonitoringDetails =
                    enableExternalContainerDatabaseStackMonitoringDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new EnableExternalContainerDatabaseStackMonitoringRequest(externalContainerDatabaseId, enableExternalContainerDatabaseStackMonitoringDetails, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .externalContainerDatabaseId(externalContainerDatabaseId)
                .enableExternalContainerDatabaseStackMonitoringDetails(
                        enableExternalContainerDatabaseStackMonitoringDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",externalContainerDatabaseId=")
                .append(String.valueOf(this.externalContainerDatabaseId));
        sb.append(",enableExternalContainerDatabaseStackMonitoringDetails=")
                .append(String.valueOf(this.enableExternalContainerDatabaseStackMonitoringDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalContainerDatabaseStackMonitoringRequest)) {
            return false;
        }

        EnableExternalContainerDatabaseStackMonitoringRequest other =
                (EnableExternalContainerDatabaseStackMonitoringRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.externalContainerDatabaseId, other.externalContainerDatabaseId)
                && java.util.Objects.equals(
                        this.enableExternalContainerDatabaseStackMonitoringDetails,
                        other.enableExternalContainerDatabaseStackMonitoringDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalContainerDatabaseId == null
                                ? 43
                                : this.externalContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.enableExternalContainerDatabaseStackMonitoringDetails == null
                                ? 43
                                : this.enableExternalContainerDatabaseStackMonitoringDetails
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}