/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateAuthenticationProviderResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Fully qualified URL for the newly created resource.
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned AuthenticationProvider instance.
     */
    private com.oracle.bmc.oda.model.AuthenticationProvider authenticationProvider;

    public com.oracle.bmc.oda.model.AuthenticationProvider getAuthenticationProvider() {
        return authenticationProvider;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "location",
        "etag",
        "opcRequestId",
        "authenticationProvider"
    })
    private CreateAuthenticationProviderResponse(
            int __httpStatusCode__,
            String location,
            String etag,
            String opcRequestId,
            com.oracle.bmc.oda.model.AuthenticationProvider authenticationProvider) {
        super(__httpStatusCode__);
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.authenticationProvider = authenticationProvider;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.oda.model.AuthenticationProvider authenticationProvider;

        public Builder authenticationProvider(
                com.oracle.bmc.oda.model.AuthenticationProvider authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateAuthenticationProviderResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            authenticationProvider(o.getAuthenticationProvider());

            return this;
        }

        public CreateAuthenticationProviderResponse build() {
            return new CreateAuthenticationProviderResponse(
                    __httpStatusCode__, location, etag, opcRequestId, authenticationProvider);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",authenticationProvider=").append(String.valueOf(authenticationProvider));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAuthenticationProviderResponse)) {
            return false;
        }

        CreateAuthenticationProviderResponse other = (CreateAuthenticationProviderResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.authenticationProvider, other.authenticationProvider);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationProvider == null
                                ? 43
                                : this.authenticationProvider.hashCode());
        return result;
    }
}