/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.api.exceptions.handler;

import static org.eclipse.xpanse.api.exceptions.handler.CommonExceptionHandler.getErrorResponse;

import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.xpanse.modules.models.credential.exceptions.CredentialCapabilityNotFound;
import org.eclipse.xpanse.modules.models.credential.exceptions.CredentialVariablesNotComplete;
import org.eclipse.xpanse.modules.models.credential.exceptions.CredentialsNotFoundException;
import org.eclipse.xpanse.modules.models.credential.exceptions.NoCredentialDefinitionAvailable;
import org.eclipse.xpanse.modules.models.response.Response;
import org.eclipse.xpanse.modules.models.response.ResultType;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Exception handler related to Credentials center for the REST API.
 */
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class CredentialManageExceptionHandler {

    /**
     * Exception handler for CredentialCapabilityNotFound.
     */
    @ExceptionHandler({CredentialCapabilityNotFound.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleCredentialCapabilityNotFound(CredentialCapabilityNotFound ex) {
        return getErrorResponse(ResultType.CREDENTIAL_CAPABILITY_NOT_FOUND,
                Collections.singletonList(ex.getMessage()));
    }

    /**
     * Exception handler for CredentialsNotFoundException.
     */
    @ExceptionHandler({CredentialsNotFoundException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleCredentialsNotFoundException(CredentialsNotFoundException ex) {
        return getErrorResponse(ResultType.CREDENTIALS_NOT_FOUND,
                Collections.singletonList(ex.getMessage()));
    }

    /**
     * Exception handler for CredentialVariablesNotComplete.
     */
    @ExceptionHandler({CredentialVariablesNotComplete.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleCredentialVariablesNotComplete(CredentialVariablesNotComplete ex) {
        return getErrorResponse(ResultType.CREDENTIALS_VARIABLES_NOT_COMPLETE,
                ex.getErrorReasons().stream().toList());
    }

    /**
     * Exception handler for NoCredentialDefinitionAvailable.
     */
    @ExceptionHandler({NoCredentialDefinitionAvailable.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleNoCredentialDefinitionAvailable(
            NoCredentialDefinitionAvailable ex) {
        return getErrorResponse(ResultType.CREDENTIAL_DEFINITIONS_NOT_AVAILABLE,
                Collections.singletonList(ex.getMessage()));
    }
}
