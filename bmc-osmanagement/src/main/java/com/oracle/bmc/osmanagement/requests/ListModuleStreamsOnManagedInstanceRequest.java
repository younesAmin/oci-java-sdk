/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListModuleStreamsOnManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListModuleStreamsOnManagedInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class ListModuleStreamsOnManagedInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * OCID for the managed instance
     */
    private String managedInstanceId;

    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * The ID of the compartment in which to list resources. This parameter is optional and in some cases may have no effect.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The name of a module.  This parameter is required if a
     * streamName is specified.
     *
     */
    private String moduleName;

    public String getModuleName() {
        return moduleName;
    }
    /**
     * The name of the stream of the containing module.  This parameter
     * is required if a profileName is specified.
     *
     */
    private String streamName;

    public String getStreamName() {
        return streamName;
    }
    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     */
    private StreamStatus streamStatus;

    /**
     * The status of the stream
     * <p>
     * A stream with the "ENABLED" status can be used as a source for installing
     * profiles.  Streams with this status are also "ACTIVE".
     * <p>
     * A stream with the "DISABLED" status cannot be the source for installing
     * profiles.  To install profiles and packages from this stream, it must be
     * enabled.
     * <p>
     * A stream with the "ACTIVE" status can be used as a source for installing
     * profiles.  The packages that comprise the stream are also used when a
     * matching package is installed directly.  In general, a stream can have
     * this status if it is the default stream for the module and no stream has
     * been explicitly enabled.
     *
     **/
    public enum StreamStatus {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Active("ACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, StreamStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (StreamStatus v : StreamStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        StreamStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StreamStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StreamStatus: " + key);
        }
    };

    public StreamStatus getStreamStatus() {
        return streamStatus;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListModuleStreamsOnManagedInstanceRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String managedInstanceId = null;

        /**
         * OCID for the managed instance
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources. This parameter is optional and in some cases may have no effect.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private String moduleName = null;

        /**
         * The name of a module.  This parameter is required if a
         * streamName is specified.
         *
         * @return this builder instance
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        private String streamName = null;

        /**
         * The name of the stream of the containing module.  This parameter
         * is required if a profileName is specified.
         *
         * @return this builder instance
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }

        private StreamStatus streamStatus = null;

        /**
         * The status of the stream
         * <p>
         * A stream with the "ENABLED" status can be used as a source for installing
         * profiles.  Streams with this status are also "ACTIVE".
         * <p>
         * A stream with the "DISABLED" status cannot be the source for installing
         * profiles.  To install profiles and packages from this stream, it must be
         * enabled.
         * <p>
         * A stream with the "ACTIVE" status can be used as a source for installing
         * profiles.  The packages that comprise the stream are also used when a
         * matching package is installed directly.  In general, a stream can have
         * this status if it is the default stream for the module and no stream has
         * been explicitly enabled.
         *
         * @return this builder instance
         */
        public Builder streamStatus(StreamStatus streamStatus) {
            this.streamStatus = streamStatus;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListModuleStreamsOnManagedInstanceRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            compartmentId(o.getCompartmentId());
            moduleName(o.getModuleName());
            streamName(o.getStreamName());
            streamStatus(o.getStreamStatus());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListModuleStreamsOnManagedInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListModuleStreamsOnManagedInstanceRequest
         */
        public ListModuleStreamsOnManagedInstanceRequest build() {
            ListModuleStreamsOnManagedInstanceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListModuleStreamsOnManagedInstanceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListModuleStreamsOnManagedInstanceRequest
         */
        public ListModuleStreamsOnManagedInstanceRequest buildWithoutInvocationCallback() {
            ListModuleStreamsOnManagedInstanceRequest request =
                    new ListModuleStreamsOnManagedInstanceRequest();
            request.managedInstanceId = managedInstanceId;
            request.compartmentId = compartmentId;
            request.moduleName = moduleName;
            request.streamName = streamName;
            request.streamStatus = streamStatus;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListModuleStreamsOnManagedInstanceRequest(managedInstanceId, compartmentId, moduleName, streamName, streamStatus, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .compartmentId(compartmentId)
                .moduleName(moduleName)
                .streamName(streamName)
                .streamStatus(streamStatus)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",moduleName=").append(String.valueOf(this.moduleName));
        sb.append(",streamName=").append(String.valueOf(this.streamName));
        sb.append(",streamStatus=").append(String.valueOf(this.streamStatus));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListModuleStreamsOnManagedInstanceRequest)) {
            return false;
        }

        ListModuleStreamsOnManagedInstanceRequest other =
                (ListModuleStreamsOnManagedInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.streamStatus, other.streamStatus)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.streamStatus == null ? 43 : this.streamStatus.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}