/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Description of an ODA instance attachment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OdaInstanceAttachment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OdaInstanceAttachment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "instanceId",
        "attachToId",
        "attachmentType",
        "attachmentMetadata",
        "restrictedOperations",
        "owner",
        "timeCreated",
        "timeLastUpdate",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public OdaInstanceAttachment(
            String id,
            String instanceId,
            String attachToId,
            AttachmentType attachmentType,
            String attachmentMetadata,
            java.util.List<String> restrictedOperations,
            OdaInstanceOwner owner,
            java.util.Date timeCreated,
            java.util.Date timeLastUpdate,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.instanceId = instanceId;
        this.attachToId = attachToId;
        this.attachmentType = attachmentType;
        this.attachmentMetadata = attachmentMetadata;
        this.restrictedOperations = restrictedOperations;
        this.owner = owner;
        this.timeCreated = timeCreated;
        this.timeLastUpdate = timeLastUpdate;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachToId")
        private String attachToId;

        public Builder attachToId(String attachToId) {
            this.attachToId = attachToId;
            this.__explicitlySet__.add("attachToId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachmentMetadata")
        private String attachmentMetadata;

        public Builder attachmentMetadata(String attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            this.__explicitlySet__.add("attachmentMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("restrictedOperations")
        private java.util.List<String> restrictedOperations;

        public Builder restrictedOperations(java.util.List<String> restrictedOperations) {
            this.restrictedOperations = restrictedOperations;
            this.__explicitlySet__.add("restrictedOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OdaInstanceOwner owner;

        public Builder owner(OdaInstanceOwner owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdate")
        private java.util.Date timeLastUpdate;

        public Builder timeLastUpdate(java.util.Date timeLastUpdate) {
            this.timeLastUpdate = timeLastUpdate;
            this.__explicitlySet__.add("timeLastUpdate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdaInstanceAttachment build() {
            OdaInstanceAttachment __instance__ =
                    new OdaInstanceAttachment(
                            id,
                            instanceId,
                            attachToId,
                            attachmentType,
                            attachmentMetadata,
                            restrictedOperations,
                            owner,
                            timeCreated,
                            timeLastUpdate,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdaInstanceAttachment o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .instanceId(o.getInstanceId())
                            .attachToId(o.getAttachToId())
                            .attachmentType(o.getAttachmentType())
                            .attachmentMetadata(o.getAttachmentMetadata())
                            .restrictedOperations(o.getRestrictedOperations())
                            .owner(o.getOwner())
                            .timeCreated(o.getTimeCreated())
                            .timeLastUpdate(o.getTimeLastUpdate())
                            .lifecycleState(o.getLifecycleState())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * Unique immutable identifier that was assigned when the ODA instance attachment was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the ODA instance to which the attachment applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    /**
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which the ODA instance is or is being attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachToId")
    private final String attachToId;

    public String getAttachToId() {
        return attachToId;
    }

    /**
     * The type of attachment defined as an enum.
     **/
    public enum AttachmentType {
        Fusion("FUSION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttachmentType.class);

        private final String value;
        private static java.util.Map<String, AttachmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttachmentType v : AttachmentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttachmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttachmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttachmentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of attachment defined as an enum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    private final AttachmentType attachmentType;

    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    /**
     * Attachment-specific metadata, defined by the target service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentMetadata")
    private final String attachmentMetadata;

    public String getAttachmentMetadata() {
        return attachmentMetadata;
    }

    /**
     * List of operation names that are restricted while this ODA instance is attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restrictedOperations")
    private final java.util.List<String> restrictedOperations;

    public java.util.List<String> getRestrictedOperations() {
        return restrictedOperations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OdaInstanceOwner owner;

    public OdaInstanceOwner getOwner() {
        return owner;
    }

    /**
     * The time the attachment was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the attachment was last modified. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdate")
    private final java.util.Date timeLastUpdate;

    public java.util.Date getTimeLastUpdate() {
        return timeLastUpdate;
    }

    /**
     * The current state of the attachment.
     **/
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Active("ACTIVE"),
        Detaching("DETACHING"),
        Inactive("INACTIVE"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OdaInstanceAttachment(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", attachToId=").append(String.valueOf(this.attachToId));
        sb.append(", attachmentType=").append(String.valueOf(this.attachmentType));
        sb.append(", attachmentMetadata=").append(String.valueOf(this.attachmentMetadata));
        sb.append(", restrictedOperations=").append(String.valueOf(this.restrictedOperations));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastUpdate=").append(String.valueOf(this.timeLastUpdate));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdaInstanceAttachment)) {
            return false;
        }

        OdaInstanceAttachment other = (OdaInstanceAttachment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.attachToId, other.attachToId)
                && java.util.Objects.equals(this.attachmentType, other.attachmentType)
                && java.util.Objects.equals(this.attachmentMetadata, other.attachmentMetadata)
                && java.util.Objects.equals(this.restrictedOperations, other.restrictedOperations)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastUpdate, other.timeLastUpdate)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.attachToId == null ? 43 : this.attachToId.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentType == null ? 43 : this.attachmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentMetadata == null
                                ? 43
                                : this.attachmentMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.restrictedOperations == null
                                ? 43
                                : this.restrictedOperations.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdate == null ? 43 : this.timeLastUpdate.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
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