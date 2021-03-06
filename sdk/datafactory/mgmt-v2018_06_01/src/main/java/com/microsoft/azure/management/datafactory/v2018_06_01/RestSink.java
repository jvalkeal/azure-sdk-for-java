/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Rest service Sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = RestSink.class)
@JsonTypeName("RestSink")
public class RestSink extends CopySink {
    /**
     * The HTTP method used to call the RESTful API. The default is POST. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /**
     * The additional HTTP headers in the request to the RESTful API. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "additionalHeaders")
    private Object additionalHeaders;

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get
     * a response, not the timeout to read response data. Default value:
     * 00:01:40. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /**
     * The time to await before sending next request, in milliseconds.
     */
    @JsonProperty(value = "requestInterval")
    private Object requestInterval;

    /**
     * Compression Type to Send data in compressed format with Optimal
     * Compression Level, Default is None. And The Only Supported option is
     * Gzip.
     */
    @JsonProperty(value = "compressionType")
    private Object compressionType;

    /**
     * Wraps Request Array Json into an Object before calling the rest endpoint
     * , Default is false. ex: if true request content sample format is {
     * rows:[]} else the format is [].
     */
    @JsonProperty(value = "wrapRequestJsonInAnObject")
    private Object wrapRequestJsonInAnObject;

    /**
     * Get the HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     *
     * @return the requestMethod value
     */
    public Object requestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set
     * @return the RestSink object itself.
     */
    public RestSink withRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     *
     * @return the additionalHeaders value
     */
    public Object additionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set
     * @return the RestSink object itself.
     */
    public RestSink withAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the httpRequestTimeout value
     */
    public Object httpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param httpRequestTimeout the httpRequestTimeout value to set
     * @return the RestSink object itself.
     */
    public RestSink withHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /**
     * Get the time to await before sending next request, in milliseconds.
     *
     * @return the requestInterval value
     */
    public Object requestInterval() {
        return this.requestInterval;
    }

    /**
     * Set the time to await before sending next request, in milliseconds.
     *
     * @param requestInterval the requestInterval value to set
     * @return the RestSink object itself.
     */
    public RestSink withRequestInterval(Object requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

    /**
     * Get compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     *
     * @return the compressionType value
     */
    public Object compressionType() {
        return this.compressionType;
    }

    /**
     * Set compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     *
     * @param compressionType the compressionType value to set
     * @return the RestSink object itself.
     */
    public RestSink withCompressionType(Object compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    /**
     * Get wraps Request Array Json into an Object before calling the rest endpoint , Default is false. ex: if true request content sample format is { rows:[]} else the format is [].
     *
     * @return the wrapRequestJsonInAnObject value
     */
    public Object wrapRequestJsonInAnObject() {
        return this.wrapRequestJsonInAnObject;
    }

    /**
     * Set wraps Request Array Json into an Object before calling the rest endpoint , Default is false. ex: if true request content sample format is { rows:[]} else the format is [].
     *
     * @param wrapRequestJsonInAnObject the wrapRequestJsonInAnObject value to set
     * @return the RestSink object itself.
     */
    public RestSink withWrapRequestJsonInAnObject(Object wrapRequestJsonInAnObject) {
        this.wrapRequestJsonInAnObject = wrapRequestJsonInAnObject;
        return this;
    }

}
