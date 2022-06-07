/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * These details are included in a request to create a virtual test access point (VTAP).
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
    builder = CreateVtapDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateVtapDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "vcnId",
        "definedTags",
        "displayName",
        "freeformTags",
        "sourceId",
        "targetId",
        "targetIp",
        "captureFilterId",
        "encapsulationProtocol",
        "vxlanNetworkIdentifier",
        "isVtapEnabled",
        "sourceType",
        "trafficMode",
        "maxPacketSize",
        "targetType",
        "sourcePrivateEndpointIp",
        "sourcePrivateEndpointSubnetId"
    })
    public CreateVtapDetails(
            String compartmentId,
            String vcnId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String sourceId,
            String targetId,
            String targetIp,
            String captureFilterId,
            EncapsulationProtocol encapsulationProtocol,
            Long vxlanNetworkIdentifier,
            Boolean isVtapEnabled,
            SourceType sourceType,
            TrafficMode trafficMode,
            Integer maxPacketSize,
            TargetType targetType,
            String sourcePrivateEndpointIp,
            String sourcePrivateEndpointSubnetId) {
        super();
        this.compartmentId = compartmentId;
        this.vcnId = vcnId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.targetIp = targetIp;
        this.captureFilterId = captureFilterId;
        this.encapsulationProtocol = encapsulationProtocol;
        this.vxlanNetworkIdentifier = vxlanNetworkIdentifier;
        this.isVtapEnabled = isVtapEnabled;
        this.sourceType = sourceType;
        this.trafficMode = trafficMode;
        this.maxPacketSize = maxPacketSize;
        this.targetType = targetType;
        this.sourcePrivateEndpointIp = sourcePrivateEndpointIp;
        this.sourcePrivateEndpointSubnetId = sourcePrivateEndpointSubnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetIp")
        private String targetIp;

        public Builder targetIp(String targetIp) {
            this.targetIp = targetIp;
            this.__explicitlySet__.add("targetIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captureFilterId")
        private String captureFilterId;

        public Builder captureFilterId(String captureFilterId) {
            this.captureFilterId = captureFilterId;
            this.__explicitlySet__.add("captureFilterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encapsulationProtocol")
        private EncapsulationProtocol encapsulationProtocol;

        public Builder encapsulationProtocol(EncapsulationProtocol encapsulationProtocol) {
            this.encapsulationProtocol = encapsulationProtocol;
            this.__explicitlySet__.add("encapsulationProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vxlanNetworkIdentifier")
        private Long vxlanNetworkIdentifier;

        public Builder vxlanNetworkIdentifier(Long vxlanNetworkIdentifier) {
            this.vxlanNetworkIdentifier = vxlanNetworkIdentifier;
            this.__explicitlySet__.add("vxlanNetworkIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVtapEnabled")
        private Boolean isVtapEnabled;

        public Builder isVtapEnabled(Boolean isVtapEnabled) {
            this.isVtapEnabled = isVtapEnabled;
            this.__explicitlySet__.add("isVtapEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trafficMode")
        private TrafficMode trafficMode;

        public Builder trafficMode(TrafficMode trafficMode) {
            this.trafficMode = trafficMode;
            this.__explicitlySet__.add("trafficMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxPacketSize")
        private Integer maxPacketSize;

        public Builder maxPacketSize(Integer maxPacketSize) {
            this.maxPacketSize = maxPacketSize;
            this.__explicitlySet__.add("maxPacketSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointIp")
        private String sourcePrivateEndpointIp;

        public Builder sourcePrivateEndpointIp(String sourcePrivateEndpointIp) {
            this.sourcePrivateEndpointIp = sourcePrivateEndpointIp;
            this.__explicitlySet__.add("sourcePrivateEndpointIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointSubnetId")
        private String sourcePrivateEndpointSubnetId;

        public Builder sourcePrivateEndpointSubnetId(String sourcePrivateEndpointSubnetId) {
            this.sourcePrivateEndpointSubnetId = sourcePrivateEndpointSubnetId;
            this.__explicitlySet__.add("sourcePrivateEndpointSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVtapDetails build() {
            CreateVtapDetails __instance__ =
                    new CreateVtapDetails(
                            compartmentId,
                            vcnId,
                            definedTags,
                            displayName,
                            freeformTags,
                            sourceId,
                            targetId,
                            targetIp,
                            captureFilterId,
                            encapsulationProtocol,
                            vxlanNetworkIdentifier,
                            isVtapEnabled,
                            sourceType,
                            trafficMode,
                            maxPacketSize,
                            targetType,
                            sourcePrivateEndpointIp,
                            sourcePrivateEndpointSubnetId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVtapDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .vcnId(o.getVcnId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .sourceId(o.getSourceId())
                            .targetId(o.getTargetId())
                            .targetIp(o.getTargetIp())
                            .captureFilterId(o.getCaptureFilterId())
                            .encapsulationProtocol(o.getEncapsulationProtocol())
                            .vxlanNetworkIdentifier(o.getVxlanNetworkIdentifier())
                            .isVtapEnabled(o.getIsVtapEnabled())
                            .sourceType(o.getSourceType())
                            .trafficMode(o.getTrafficMode())
                            .maxPacketSize(o.getMaxPacketSize())
                            .targetType(o.getTargetType())
                            .sourcePrivateEndpointIp(o.getSourcePrivateEndpointIp())
                            .sourcePrivateEndpointSubnetId(o.getSourcePrivateEndpointSubnetId());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code Vtap} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN containing the {@code Vtap} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    public String getVcnId() {
        return vcnId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source point where packets are captured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    public String getSourceId() {
        return sourceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the destination resource where mirrored packets are sent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * The IP address of the destination resource where mirrored packets are sent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIp")
    private final String targetIp;

    public String getTargetIp() {
        return targetIp;
    }

    /**
     * The capture filter's Oracle ID ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captureFilterId")
    private final String captureFilterId;

    public String getCaptureFilterId() {
        return captureFilterId;
    }

    /**
     * Defines an encapsulation header type for the VTAP's mirrored traffic.
     *
     **/
    public enum EncapsulationProtocol {
        Vxlan("VXLAN"),
        ;

        private final String value;
        private static java.util.Map<String, EncapsulationProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (EncapsulationProtocol v : EncapsulationProtocol.values()) {
                map.put(v.getValue(), v);
            }
        }

        EncapsulationProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncapsulationProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EncapsulationProtocol: " + key);
        }
    };
    /**
     * Defines an encapsulation header type for the VTAP's mirrored traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encapsulationProtocol")
    private final EncapsulationProtocol encapsulationProtocol;

    public EncapsulationProtocol getEncapsulationProtocol() {
        return encapsulationProtocol;
    }

    /**
     * The virtual extensible LAN (VXLAN) network identifier (or VXLAN segment ID) that uniquely identifies the VXLAN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vxlanNetworkIdentifier")
    private final Long vxlanNetworkIdentifier;

    public Long getVxlanNetworkIdentifier() {
        return vxlanNetworkIdentifier;
    }

    /**
     * Used to start or stop a {@code Vtap} resource.
     * <p>
     * {@code TRUE} directs the VTAP to start mirroring traffic.
     * * {@code FALSE} (Default) directs the VTAP to stop mirroring traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVtapEnabled")
    private final Boolean isVtapEnabled;

    public Boolean getIsVtapEnabled() {
        return isVtapEnabled;
    }

    /**
     * The source type for the VTAP.
     *
     **/
    public enum SourceType {
        Vnic("VNIC"),
        Subnet("SUBNET"),
        LoadBalancer("LOAD_BALANCER"),
        DbSystem("DB_SYSTEM"),
        ExadataVmCluster("EXADATA_VM_CLUSTER"),
        AutonomousDataWarehouse("AUTONOMOUS_DATA_WAREHOUSE"),
        ;

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SourceType: " + key);
        }
    };
    /**
     * The source type for the VTAP.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    public SourceType getSourceType() {
        return sourceType;
    }

    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value is DEFAULT
     **/
    public enum TrafficMode {
        Default("DEFAULT"),
        Priority("PRIORITY"),
        ;

        private final String value;
        private static java.util.Map<String, TrafficMode> map;

        static {
            map = new java.util.HashMap<>();
            for (TrafficMode v : TrafficMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        TrafficMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrafficMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TrafficMode: " + key);
        }
    };
    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value is DEFAULT
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficMode")
    private final TrafficMode trafficMode;

    public TrafficMode getTrafficMode() {
        return trafficMode;
    }

    /**
     * The maximum size of the packets to be included in the filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPacketSize")
    private final Integer maxPacketSize;

    public Integer getMaxPacketSize() {
        return maxPacketSize;
    }

    /**
     * The target type for the VTAP.
     *
     **/
    public enum TargetType {
        Vnic("VNIC"),
        NetworkLoadBalancer("NETWORK_LOAD_BALANCER"),
        IpAddress("IP_ADDRESS"),
        ;

        private final String value;
        private static java.util.Map<String, TargetType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetType v : TargetType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetType: " + key);
        }
    };
    /**
     * The target type for the VTAP.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final TargetType targetType;

    public TargetType getTargetType() {
        return targetType;
    }

    /**
     * The IP Address of the source private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointIp")
    private final String sourcePrivateEndpointIp;

    public String getSourcePrivateEndpointIp() {
        return sourcePrivateEndpointIp;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet that source private endpoint belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointSubnetId")
    private final String sourcePrivateEndpointSubnetId;

    public String getSourcePrivateEndpointSubnetId() {
        return sourcePrivateEndpointSubnetId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateVtapDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetIp=").append(String.valueOf(this.targetIp));
        sb.append(", captureFilterId=").append(String.valueOf(this.captureFilterId));
        sb.append(", encapsulationProtocol=").append(String.valueOf(this.encapsulationProtocol));
        sb.append(", vxlanNetworkIdentifier=").append(String.valueOf(this.vxlanNetworkIdentifier));
        sb.append(", isVtapEnabled=").append(String.valueOf(this.isVtapEnabled));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", trafficMode=").append(String.valueOf(this.trafficMode));
        sb.append(", maxPacketSize=").append(String.valueOf(this.maxPacketSize));
        sb.append(", targetType=").append(String.valueOf(this.targetType));
        sb.append(", sourcePrivateEndpointIp=")
                .append(String.valueOf(this.sourcePrivateEndpointIp));
        sb.append(", sourcePrivateEndpointSubnetId=")
                .append(String.valueOf(this.sourcePrivateEndpointSubnetId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVtapDetails)) {
            return false;
        }

        CreateVtapDetails other = (CreateVtapDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetIp, other.targetIp)
                && java.util.Objects.equals(this.captureFilterId, other.captureFilterId)
                && java.util.Objects.equals(this.encapsulationProtocol, other.encapsulationProtocol)
                && java.util.Objects.equals(
                        this.vxlanNetworkIdentifier, other.vxlanNetworkIdentifier)
                && java.util.Objects.equals(this.isVtapEnabled, other.isVtapEnabled)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.trafficMode, other.trafficMode)
                && java.util.Objects.equals(this.maxPacketSize, other.maxPacketSize)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(
                        this.sourcePrivateEndpointIp, other.sourcePrivateEndpointIp)
                && java.util.Objects.equals(
                        this.sourcePrivateEndpointSubnetId, other.sourcePrivateEndpointSubnetId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetIp == null ? 43 : this.targetIp.hashCode());
        result =
                (result * PRIME)
                        + (this.captureFilterId == null ? 43 : this.captureFilterId.hashCode());
        result =
                (result * PRIME)
                        + (this.encapsulationProtocol == null
                                ? 43
                                : this.encapsulationProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.vxlanNetworkIdentifier == null
                                ? 43
                                : this.vxlanNetworkIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.isVtapEnabled == null ? 43 : this.isVtapEnabled.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.trafficMode == null ? 43 : this.trafficMode.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPacketSize == null ? 43 : this.maxPacketSize.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePrivateEndpointIp == null
                                ? 43
                                : this.sourcePrivateEndpointIp.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePrivateEndpointSubnetId == null
                                ? 43
                                : this.sourcePrivateEndpointSubnetId.hashCode());
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