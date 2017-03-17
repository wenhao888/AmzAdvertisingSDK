/*******************************************************************************
 * Copyright 2009-2017 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Marketplace Web Service Orders
 * API Version: 2013-09-01
 * Library Version: 2017-02-22
 * Generated: Thu Mar 02 12:41:03 UTC 2017
 */
package com.amazon.mws.order;


import com.amazon.mws.order.model.ResponseHeaderMetadata;
import com.amazon.mws.shared.MwsException;
import com.amazon.mws.shared.MwsResponseHeaderMetadata;
import com.amazon.mws.shared.*;

/**
 * Exceptions thrown by MarketplaceWebServiceOrders operations.
 */
public class MarketplaceWebServiceOrdersException extends MwsException {

    /** For serialization. */
    private static final long serialVersionUID = 1L;

    @Override
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        MwsResponseHeaderMetadata baseRHMD = super.getResponseHeaderMetadata();
        if(baseRHMD != null) {
            return new ResponseHeaderMetadata(baseRHMD);
        } else {
            return null;
        }
    }

    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd) {
        super.setResponseHeaderMetadata(rhmd);
    }

    public MarketplaceWebServiceOrdersException(String message) {
        super(0, message, null);
    }

    public MarketplaceWebServiceOrdersException(String message, int statusCode) {
        super(statusCode, message, null);
    }

    public MarketplaceWebServiceOrdersException(Throwable t) {
        super(0, null, t);
    }

    public MarketplaceWebServiceOrdersException(String message, Throwable t) {
        super(0, message, t);
    }

    public MarketplaceWebServiceOrdersException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml, ResponseHeaderMetadata rhmd) {
        super(statusCode, message, errorCode, errorType, xml, rhmd);
    }

    public MarketplaceWebServiceOrdersException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml) {
        super(statusCode, message, errorCode, errorType, xml, null);
    }

}

