// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.administration.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/**
 * Exception thrown for an invalid response with KeyVaultError information.
 */
public class KeyVaultException extends HttpResponseException {
    /**
     * Initializes a new instance of the KeyVaultErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public KeyVaultException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the KeyVaultErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public KeyVaultException(String message, HttpResponse response, KeyVaultError value) {
        super(message, response, value);
    }

    @Override
    public KeyVaultError getValue() {
        return (KeyVaultError) super.getValue();
    }
}
