/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configration for a metric based horizontal scale-in policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MetricBasedHorizontalScaleInConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricBasedHorizontalScaleInConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"metric", "minNodeCount", "stepSize"})
    public MetricBasedHorizontalScaleInConfig(
            AutoScalePolicyMetricRule metric, Integer minNodeCount, Integer stepSize) {
        super();
        this.metric = metric;
        this.minNodeCount = minNodeCount;
        this.stepSize = stepSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private AutoScalePolicyMetricRule metric;

        public Builder metric(AutoScalePolicyMetricRule metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minNodeCount")
        private Integer minNodeCount;

        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = minNodeCount;
            this.__explicitlySet__.add("minNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepSize")
        private Integer stepSize;

        public Builder stepSize(Integer stepSize) {
            this.stepSize = stepSize;
            this.__explicitlySet__.add("stepSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricBasedHorizontalScaleInConfig build() {
            MetricBasedHorizontalScaleInConfig __instance__ =
                    new MetricBasedHorizontalScaleInConfig(metric, minNodeCount, stepSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricBasedHorizontalScaleInConfig o) {
            Builder copiedBuilder =
                    metric(o.getMetric())
                            .minNodeCount(o.getMinNodeCount())
                            .stepSize(o.getStepSize());

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

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final AutoScalePolicyMetricRule metric;

    public AutoScalePolicyMetricRule getMetric() {
        return metric;
    }

    /**
     * This value is the minimum number of nodes the cluster can be scaled-in to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minNodeCount")
    private final Integer minNodeCount;

    public Integer getMinNodeCount() {
        return minNodeCount;
    }

    /**
     * This value is the number of nodes to remove during a scale-in event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepSize")
    private final Integer stepSize;

    public Integer getStepSize() {
        return stepSize;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MetricBasedHorizontalScaleInConfig(");
        sb.append("metric=").append(String.valueOf(this.metric));
        sb.append(", minNodeCount=").append(String.valueOf(this.minNodeCount));
        sb.append(", stepSize=").append(String.valueOf(this.stepSize));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricBasedHorizontalScaleInConfig)) {
            return false;
        }

        MetricBasedHorizontalScaleInConfig other = (MetricBasedHorizontalScaleInConfig) o;
        return java.util.Objects.equals(this.metric, other.metric)
                && java.util.Objects.equals(this.minNodeCount, other.minNodeCount)
                && java.util.Objects.equals(this.stepSize, other.stepSize)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result = (result * PRIME) + (this.minNodeCount == null ? 43 : this.minNodeCount.hashCode());
        result = (result * PRIME) + (this.stepSize == null ? 43 : this.stepSize.hashCode());
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