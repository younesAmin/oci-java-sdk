/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * A metric namespace for the compartment-specific list.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoringSourceSelectedNamespace.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitoringSourceSelectedNamespace {
    @Deprecated
    @java.beans.ConstructorProperties({"namespace", "metrics"})
    public MonitoringSourceSelectedNamespace(
            String namespace, MonitoringSourceMetricDetails metrics) {
        super();
        this.namespace = namespace;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private MonitoringSourceMetricDetails metrics;

        public Builder metrics(MonitoringSourceMetricDetails metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoringSourceSelectedNamespace build() {
            MonitoringSourceSelectedNamespace __instance__ =
                    new MonitoringSourceSelectedNamespace(namespace, metrics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoringSourceSelectedNamespace o) {
            Builder copiedBuilder = namespace(o.getNamespace()).metrics(o.getMetrics());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The source service or application to use when querying for metric data points. Must begin with {@code oci_}.
     * <p>
     * Example: {@code oci_computeagent}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    public String getNamespace() {
        return namespace;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final MonitoringSourceMetricDetails metrics;

    public MonitoringSourceMetricDetails getMetrics() {
        return metrics;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MonitoringSourceSelectedNamespace(");
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitoringSourceSelectedNamespace)) {
            return false;
        }

        MonitoringSourceSelectedNamespace other = (MonitoringSourceSelectedNamespace) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}