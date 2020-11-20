package com.baumhaus.notecards.controller;

import com.baumhaus.notecards.controller.dto.ErrorResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;


@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ErrorResponse> handleClientError(HttpClientErrorException exception) {
        return new ResponseEntity<>(new ErrorResponse(404, "Invalid Request"), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception exception){
           return new ResponseEntity<>(new ErrorResponse(500, "Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
