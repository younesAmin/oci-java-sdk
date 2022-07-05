/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the IPSec tunnel attached to the DRG.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IpsecTunnelDrgAttachmentNetworkDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IpsecTunnelDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The IPSec connection that contains the attached IPSec tunnel.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
        private String ipsecConnectionId;

        /**
         * The IPSec connection that contains the attached IPSec tunnel.
         * @param ipsecConnectionId the value to set
         * @return this builder
         **/
        public Builder ipsecConnectionId(String ipsecConnectionId) {
            this.ipsecConnectionId = ipsecConnectionId;
            this.__explicitlySet__.add("ipsecConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpsecTunnelDrgAttachmentNetworkDetails build() {
            IpsecTunnelDrgAttachmentNetworkDetails __instance__ =
                    new IpsecTunnelDrgAttachmentNetworkDetails(id, ipsecConnectionId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpsecTunnelDrgAttachmentNetworkDetails o) {
            Builder copiedBuilder = id(o.getId()).ipsecConnectionId(o.getIpsecConnectionId());

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

    @Deprecated
    public IpsecTunnelDrgAttachmentNetworkDetails(String id, String ipsecConnectionId) {
        super(id);
        this.ipsecConnectionId = ipsecConnectionId;
    }

    /**
     * The IPSec connection that contains the attached IPSec tunnel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
    private final String ipsecConnectionId;

    /**
     * The IPSec connection that contains the attached IPSec tunnel.
     * @return the value
     **/
    public String getIpsecConnectionId() {
        return ipsecConnectionId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IpsecTunnelDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", ipsecConnectionId=").append(String.valueOf(this.ipsecConnectionId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpsecTunnelDrgAttachmentNetworkDetails)) {
            return false;
        }

        IpsecTunnelDrgAttachmentNetworkDetails other = (IpsecTunnelDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.ipsecConnectionId, other.ipsecConnectionId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ipsecConnectionId == null ? 43 : this.ipsecConnectionId.hashCode());
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