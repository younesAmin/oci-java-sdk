/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Attributes to filter Bitbucket Cloud events.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BitbucketCloudFilterAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BitbucketCloudFilterAttributes {
    @Deprecated
    @java.beans.ConstructorProperties({"headRef", "baseRef"})
    public BitbucketCloudFilterAttributes(String headRef, String baseRef) {
        super();
        this.headRef = headRef;
        this.baseRef = baseRef;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("headRef")
        private String headRef;

        public Builder headRef(String headRef) {
            this.headRef = headRef;
            this.__explicitlySet__.add("headRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baseRef")
        private String baseRef;

        public Builder baseRef(String baseRef) {
            this.baseRef = baseRef;
            this.__explicitlySet__.add("baseRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BitbucketCloudFilterAttributes build() {
            BitbucketCloudFilterAttributes __instance__ =
                    new BitbucketCloudFilterAttributes(headRef, baseRef);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BitbucketCloudFilterAttributes o) {
            Builder copiedBuilder = headRef(o.getHeadRef()).baseRef(o.getBaseRef());

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
     * Branch for push event; source branch for pull requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headRef")
    private final String headRef;

    public String getHeadRef() {
        return headRef;
    }

    /**
     * The target branch for pull requests; not applicable for push requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseRef")
    private final String baseRef;

    public String getBaseRef() {
        return baseRef;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BitbucketCloudFilterAttributes(");
        sb.append("headRef=").append(String.valueOf(this.headRef));
        sb.append(", baseRef=").append(String.valueOf(this.baseRef));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BitbucketCloudFilterAttributes)) {
            return false;
        }

        BitbucketCloudFilterAttributes other = (BitbucketCloudFilterAttributes) o;
        return java.util.Objects.equals(this.headRef, other.headRef)
                && java.util.Objects.equals(this.baseRef, other.baseRef)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.headRef == null ? 43 : this.headRef.hashCode());
        result = (result * PRIME) + (this.baseRef == null ? 43 : this.baseRef.hashCode());
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