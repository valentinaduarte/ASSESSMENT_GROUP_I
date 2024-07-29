package com.riwi.assentment_project.api.controllers.error_handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.riwi.assentment_project.api.dto.errors.BaseErrorResponse;
import com.riwi.assentment_project.api.dto.errors.ErrorResponse;
import com.riwi.assentment_project.api.dto.errors.ListErrorsResponse;
import com.riwi.assentment_project.util.errors.IdNotFoundException;

@RestControllerAdvice
public class BadRequestController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseErrorResponse handlerBadRequest(MethodArgumentNotValidException exception){
        List<String> errors = new ArrayList<>();
        exception.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
        BaseErrorResponse baseErrorResponse = ListErrorsResponse.builder().code(HttpStatus.BAD_REQUEST.value()).status(HttpStatus.BAD_REQUEST.name()).errors(errors).build();
        return baseErrorResponse;
    }

    @ExceptionHandler(IdNotFoundException.class)
    public BaseErrorResponse handleIdNotFound(IdNotFoundException exception) {
        return ErrorResponse.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .status(HttpStatus.NOT_FOUND.name())
                .message(exception.getMessage())
                .build();
    }

}