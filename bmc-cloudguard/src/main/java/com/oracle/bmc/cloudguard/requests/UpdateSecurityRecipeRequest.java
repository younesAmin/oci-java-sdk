/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateSecurityRecipeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSecurityRecipeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class UpdateSecurityRecipeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails> {

    /**
     * The unique identifier of the security zone recipe ({@code SecurityRecipe})
     */
    private String securityRecipeId;

    public String getSecurityRecipeId() {
        return securityRecipeId;
    }
    /**
     * The information to be updated in the security zone recipe.
     */
    private com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails updateSecurityRecipeDetails;

    public com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails
            getUpdateSecurityRecipeDetails() {
        return updateSecurityRecipeDetails;
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
     * The client request ID for tracing.
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
    public com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails getBody$() {
        return updateSecurityRecipeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSecurityRecipeRequest,
                    com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String securityRecipeId = null;

        /**
         * The unique identifier of the security zone recipe ({@code SecurityRecipe})
         * @return this builder instance
         */
        public Builder securityRecipeId(String securityRecipeId) {
            this.securityRecipeId = securityRecipeId;
            return this;
        }

        private com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails
                updateSecurityRecipeDetails = null;

        /**
         * The information to be updated in the security zone recipe.
         * @return this builder instance
         */
        public Builder updateSecurityRecipeDetails(
                com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails
                        updateSecurityRecipeDetails) {
            this.updateSecurityRecipeDetails = updateSecurityRecipeDetails;
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
         * The client request ID for tracing.
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
        public Builder copy(UpdateSecurityRecipeRequest o) {
            securityRecipeId(o.getSecurityRecipeId());
            updateSecurityRecipeDetails(o.getUpdateSecurityRecipeDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSecurityRecipeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSecurityRecipeRequest
         */
        public UpdateSecurityRecipeRequest build() {
            UpdateSecurityRecipeRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.cloudguard.model.UpdateSecurityRecipeDetails body) {
            updateSecurityRecipeDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSecurityRecipeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSecurityRecipeRequest
         */
        public UpdateSecurityRecipeRequest buildWithoutInvocationCallback() {
            UpdateSecurityRecipeRequest request = new UpdateSecurityRecipeRequest();
            request.securityRecipeId = securityRecipeId;
            request.updateSecurityRecipeDetails = updateSecurityRecipeDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateSecurityRecipeRequest(securityRecipeId, updateSecurityRecipeDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .securityRecipeId(securityRecipeId)
                .updateSecurityRecipeDetails(updateSecurityRecipeDetails)
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
        sb.append(",securityRecipeId=").append(String.valueOf(this.securityRecipeId));
        sb.append(",updateSecurityRecipeDetails=")
                .append(String.valueOf(this.updateSecurityRecipeDetails));
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
        if (!(o instanceof UpdateSecurityRecipeRequest)) {
            return false;
        }

        UpdateSecurityRecipeRequest other = (UpdateSecurityRecipeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.securityRecipeId, other.securityRecipeId)
                && java.util.Objects.equals(
                        this.updateSecurityRecipeDetails, other.updateSecurityRecipeDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityRecipeId == null ? 43 : this.securityRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSecurityRecipeDetails == null
                                ? 43
                                : this.updateSecurityRecipeDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}