/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.responses;

import com.oracle.bmc.servicemesh.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class CreateVirtualServiceResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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
     * Location header field identifying the URL of the new resource.
     *
     */
    private String location;

    public String getLocation() {
        return location;
    }

    /**
     * The returned VirtualService instance.
     */
    private com.oracle.bmc.servicemesh.model.VirtualService virtualService;

    public com.oracle.bmc.servicemesh.model.VirtualService getVirtualService() {
        return virtualService;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "virtualService"
    })
    private CreateVirtualServiceResponse(
            int __httpStatusCode__,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            com.oracle.bmc.servicemesh.model.VirtualService virtualService) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.virtualService = virtualService;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcWorkRequestId;

        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String location;

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        private com.oracle.bmc.servicemesh.model.VirtualService virtualService;

        public Builder virtualService(
                com.oracle.bmc.servicemesh.model.VirtualService virtualService) {
            this.virtualService = virtualService;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateVirtualServiceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            virtualService(o.getVirtualService());

            return this;
        }

        public CreateVirtualServiceResponse build() {
            return new CreateVirtualServiceResponse(
                    __httpStatusCode__,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    location,
                    virtualService);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",virtualService=").append(String.valueOf(virtualService));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVirtualServiceResponse)) {
            return false;
        }

        CreateVirtualServiceResponse other = (CreateVirtualServiceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.virtualService, other.virtualService);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualService == null ? 43 : this.virtualService.hashCode());
        return result;
    }
}