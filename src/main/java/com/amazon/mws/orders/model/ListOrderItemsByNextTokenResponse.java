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
 * List Order Items By Next Token Response
 * API Version: 2013-09-01
 * Library Version: 2017-02-22
 * Generated: Thu Mar 02 12:41:03 UTC 2017
 */
package com.amazon.mws.orders.model;


import com.amazon.mws.shared.AbstractMwsObject;
import com.amazon.mws.shared.MwsReader;
import com.amazon.mws.shared.MwsWriter;

/**
 * ListOrderItemsByNextTokenResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListOrderItemsByNextTokenResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListOrderItemsByNextTokenResult" type="{https://mws.amazonservices.com/Orders/2013-09-01}ListOrderItemsByNextTokenResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/Orders/2013-09-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class ListOrderItemsByNextTokenResponse extends AbstractMwsObject implements MWSResponse {

    private ListOrderItemsByNextTokenResult listOrderItemsByNextTokenResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListOrderItemsByNextTokenResult.
     *
     * @return The value of ListOrderItemsByNextTokenResult.
     */
    public ListOrderItemsByNextTokenResult getListOrderItemsByNextTokenResult() {
        return listOrderItemsByNextTokenResult;
    }

    /**
     * Set the value of ListOrderItemsByNextTokenResult.
     *
     * @param listOrderItemsByNextTokenResult
     *            The new value to set.
     */
    public void setListOrderItemsByNextTokenResult(ListOrderItemsByNextTokenResult listOrderItemsByNextTokenResult) {
        this.listOrderItemsByNextTokenResult = listOrderItemsByNextTokenResult;
    }

    /**
     * Check to see if ListOrderItemsByNextTokenResult is set.
     *
     * @return true if ListOrderItemsByNextTokenResult is set.
     */
    public boolean isSetListOrderItemsByNextTokenResult() {
        return listOrderItemsByNextTokenResult != null;
    }

    /**
     * Set the value of ListOrderItemsByNextTokenResult, return this.
     *
     * @param listOrderItemsByNextTokenResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListOrderItemsByNextTokenResponse withListOrderItemsByNextTokenResult(ListOrderItemsByNextTokenResult listOrderItemsByNextTokenResult) {
        this.listOrderItemsByNextTokenResult = listOrderItemsByNextTokenResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListOrderItemsByNextTokenResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public ListOrderItemsByNextTokenResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    public void readFragmentFrom(MwsReader r) {
        listOrderItemsByNextTokenResult = r.read("ListOrderItemsByNextTokenResult", ListOrderItemsByNextTokenResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    public void writeFragmentTo(MwsWriter w) {
        w.write("ListOrderItemsByNextTokenResult", listOrderItemsByNextTokenResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "ListOrderItemsByNextTokenResponse",this);
    }


    /** Default constructor. */
    public ListOrderItemsByNextTokenResponse() {
        super();
    }

}