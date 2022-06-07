/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListDigitalAssistantsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDigitalAssistantsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ListDigitalAssistantsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * Unique Digital Assistant identifier.
     */
    private String digitalAssistantId;

    public String getDigitalAssistantId() {
        return digitalAssistantId;
    }
    /**
     * List only Bot resources with this category.
     */
    private String category;

    public String getCategory() {
        return category;
    }
    /**
     * List only Bot resources with this name. Names are unique and may not change.
     * <p>
     * Example: {@code MySkill}
     *
     */
    private String name;

    public String getName() {
        return name;
    }
    /**
     * List only Bot resources with this version. Versions are unique and may not change.
     * <p>
     * Example: {@code 1.0}
     *
     */
    private String version;

    public String getVersion() {
        return version;
    }
    /**
     * List only Bot resources with this namespace. Namespaces may not change.
     * <p>
     * Example: {@code MyNamespace}
     *
     */
    private String namespace;

    public String getNamespace() {
        return namespace;
    }
    /**
     * List only Bot resources with this platform version.
     *
     */
    private String platformVersion;

    public String getPlatformVersion() {
        return platformVersion;
    }
    /**
     * List only the resources that are in this lifecycle state.
     */
    private com.oracle.bmc.oda.model.LifecycleState lifecycleState;

    public com.oracle.bmc.oda.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * List only Bot resources with this lifecycle details.
     *
     */
    private String lifecycleDetails;

    public String getLifecycleDetails() {
        return lifecycleDetails;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page at which to start retrieving results.
     * <p>
     * You get this value from the {@code opc-next-page} header in a previous list request.
     * To retireve the first page, omit this query parameter.
     * <p>
     * Example: {@code MToxMA==}
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    private SortOrder sortOrder;

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
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
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
     * <p>
     * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
     * For all other sort fields the default sort order is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        Name("name"),
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
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDigitalAssistantsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        private String digitalAssistantId = null;

        /**
         * Unique Digital Assistant identifier.
         * @return this builder instance
         */
        public Builder digitalAssistantId(String digitalAssistantId) {
            this.digitalAssistantId = digitalAssistantId;
            return this;
        }

        private String category = null;

        /**
         * List only Bot resources with this category.
         * @return this builder instance
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        private String name = null;

        /**
         * List only Bot resources with this name. Names are unique and may not change.
         * <p>
         * Example: {@code MySkill}
         *
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        private String version = null;

        /**
         * List only Bot resources with this version. Versions are unique and may not change.
         * <p>
         * Example: {@code 1.0}
         *
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        private String namespace = null;

        /**
         * List only Bot resources with this namespace. Namespaces may not change.
         * <p>
         * Example: {@code MyNamespace}
         *
         * @return this builder instance
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        private String platformVersion = null;

        /**
         * List only Bot resources with this platform version.
         *
         * @return this builder instance
         */
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        private com.oracle.bmc.oda.model.LifecycleState lifecycleState = null;

        /**
         * List only the resources that are in this lifecycle state.
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.oda.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String lifecycleDetails = null;

        /**
         * List only Bot resources with this lifecycle details.
         *
         * @return this builder instance
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page at which to start retrieving results.
         * <p>
         * You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         * <p>
         * Example: {@code MToxMA==}
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC} (descending).
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code timeCreated}.
         * <p>
         * The default sort order for {@code timeCreated} and {@code timeUpdated} is descending.
         * For all other sort fields the default sort order is ascending.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
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
        public Builder copy(ListDigitalAssistantsRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            digitalAssistantId(o.getDigitalAssistantId());
            category(o.getCategory());
            name(o.getName());
            version(o.getVersion());
            namespace(o.getNamespace());
            platformVersion(o.getPlatformVersion());
            lifecycleState(o.getLifecycleState());
            lifecycleDetails(o.getLifecycleDetails());
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
         * Build the instance of ListDigitalAssistantsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDigitalAssistantsRequest
         */
        public ListDigitalAssistantsRequest build() {
            ListDigitalAssistantsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDigitalAssistantsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDigitalAssistantsRequest
         */
        public ListDigitalAssistantsRequest buildWithoutInvocationCallback() {
            ListDigitalAssistantsRequest request = new ListDigitalAssistantsRequest();
            request.odaInstanceId = odaInstanceId;
            request.digitalAssistantId = digitalAssistantId;
            request.category = category;
            request.name = name;
            request.version = version;
            request.namespace = namespace;
            request.platformVersion = platformVersion;
            request.lifecycleState = lifecycleState;
            request.lifecycleDetails = lifecycleDetails;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDigitalAssistantsRequest(odaInstanceId, digitalAssistantId, category, name, version, namespace, platformVersion, lifecycleState, lifecycleDetails, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .digitalAssistantId(digitalAssistantId)
                .category(category)
                .name(name)
                .version(version)
                .namespace(namespace)
                .platformVersion(platformVersion)
                .lifecycleState(lifecycleState)
                .lifecycleDetails(lifecycleDetails)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",digitalAssistantId=").append(String.valueOf(this.digitalAssistantId));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",namespace=").append(String.valueOf(this.namespace));
        sb.append(",platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof ListDigitalAssistantsRequest)) {
            return false;
        }

        ListDigitalAssistantsRequest other = (ListDigitalAssistantsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.digitalAssistantId, other.digitalAssistantId)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.digitalAssistantId == null
                                ? 43
                                : this.digitalAssistantId.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}