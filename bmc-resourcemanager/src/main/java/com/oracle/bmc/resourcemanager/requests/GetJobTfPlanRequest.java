/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobTfPlanExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetJobTfPlanRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class GetJobTfPlanRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     */
    private String jobId;

    public String getJobId() {
        return jobId;
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
     * The output format of the Terraform plan.
     *
     */
    private TfPlanFormat tfPlanFormat;

    /**
     * The output format of the Terraform plan.
     *
     **/
    public enum TfPlanFormat {
        Binary("BINARY"),
        Json("JSON"),
        ;

        private final String value;
        private static java.util.Map<String, TfPlanFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (TfPlanFormat v : TfPlanFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        TfPlanFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TfPlanFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TfPlanFormat: " + key);
        }
    };

    public TfPlanFormat getTfPlanFormat() {
        return tfPlanFormat;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetJobTfPlanRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String jobId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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

        private TfPlanFormat tfPlanFormat = null;

        /**
         * The output format of the Terraform plan.
         *
         * @return this builder instance
         */
        public Builder tfPlanFormat(TfPlanFormat tfPlanFormat) {
            this.tfPlanFormat = tfPlanFormat;
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
        public Builder copy(GetJobTfPlanRequest o) {
            jobId(o.getJobId());
            opcRequestId(o.getOpcRequestId());
            tfPlanFormat(o.getTfPlanFormat());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJobTfPlanRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetJobTfPlanRequest
         */
        public GetJobTfPlanRequest build() {
            GetJobTfPlanRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetJobTfPlanRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetJobTfPlanRequest
         */
        public GetJobTfPlanRequest buildWithoutInvocationCallback() {
            GetJobTfPlanRequest request = new GetJobTfPlanRequest();
            request.jobId = jobId;
            request.opcRequestId = opcRequestId;
            request.tfPlanFormat = tfPlanFormat;
            return request;
            // new GetJobTfPlanRequest(jobId, opcRequestId, tfPlanFormat);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().jobId(jobId).opcRequestId(opcRequestId).tfPlanFormat(tfPlanFormat);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",tfPlanFormat=").append(String.valueOf(this.tfPlanFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJobTfPlanRequest)) {
            return false;
        }

        GetJobTfPlanRequest other = (GetJobTfPlanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.tfPlanFormat, other.tfPlanFormat);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.tfPlanFormat == null ? 43 : this.tfPlanFormat.hashCode());
        return result;
    }
}