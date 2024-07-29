package com.riwi.assentment_project.api.controllers.error_handler;


import org.springframework.http.HttpStatus;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.riwi.assentment_project.api.dto.errors.BaseErrorResponse;
import com.riwi.assentment_project.api.dto.errors.ErrorResponse;


@RestControllerAdvice
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerController {
    @ExceptionHandler(CannotCreateTransactionException.class)
    public BaseErrorResponse handleCannotCreateTransactionException(CannotCreateTransactionException ex) {
        return ErrorResponse.builder()
                .message("A transaction could not be opened for the database. Please try again later.")
                .status(HttpStatus.INTERNAL_SERVER_ERROR.name())
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
    }

    @ExceptionHandler(Exception.class)
    public BaseErrorResponse handleGlobalException(Exception ex) {
        return ErrorResponse.builder()
                .message("An unexpected error occurred: " + ex.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.name())
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
    }
}