/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListOperationsInsightsPrivateEndpointsResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * The returned OperationsInsightsPrivateEndpointCollection instance.
     */
    private com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
            operationsInsightsPrivateEndpointCollection;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "operationsInsightsPrivateEndpointCollection"
    })
    private ListOperationsInsightsPrivateEndpointsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpointCollection
                    operationsInsightsPrivateEndpointCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.operationsInsightsPrivateEndpointCollection =
                operationsInsightsPrivateEndpointCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListOperationsInsightsPrivateEndpointsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            operationsInsightsPrivateEndpointCollection(
                    o.getOperationsInsightsPrivateEndpointCollection());

            return this;
        }

        public ListOperationsInsightsPrivateEndpointsResponse build() {
            return new ListOperationsInsightsPrivateEndpointsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    operationsInsightsPrivateEndpointCollection);
        }
    }
}