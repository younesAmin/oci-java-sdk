/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * The location of the input(s).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "locationType",
    defaultImpl = InputLocation.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ObjectListFileInputLocation.class,
        name = "OBJECT_LIST_FILE_INPUT_LOCATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ObjectListInlineInputLocation.class,
        name = "OBJECT_LIST_INLINE_INPUT_LOCATION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InputLocation {

    /**
     * The type of input location.
     * Allowed values are:
     * - {@code OBJECT_LIST_INLINE_INPUT_LOCATION}: A list of object locations in Object Storage.
     * - {@code OBJECT_LIST_FILE_INPUT_LOCATION}: An object in Object Storage that contains a list of input files.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LocationType {
        ObjectListInlineInputLocation("OBJECT_LIST_INLINE_INPUT_LOCATION"),
        ObjectListFileInputLocation("OBJECT_LIST_FILE_INPUT_LOCATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LocationType> map;

        static {
            map = new java.util.HashMap<>();
            for (LocationType v : LocationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LocationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LocationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LocationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}