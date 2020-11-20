package com.baumhaus.notecards.controller;


import com.baumhaus.notecards.controller.dto.ErrorResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.*;

public class GlobalExceptionHandlerTest {
    private GlobalExceptionHandler exceptionHandler = new GlobalExceptionHandler();

    @Test
    public void handleExcpetion() {
        ResponseEntity<ErrorResponse> response = exceptionHandler.handleException(new RuntimeException("Error"));

        assertThat(response.getStatusCode()).isEqualTo(INTERNAL_SERVER_ERROR);
        assertThat(response.getBody().getCode()).isEqualTo(500);
        assertThat(response.getBody().getMessage()).isEqualTo("Server Error");
    }

    @Test
    public void handleHttpClientError() {
        ResponseEntity<ErrorResponse> response = exceptionHandler.handleClientError(new HttpClientErrorException(BAD_REQUEST));

        assertThat(response.getStatusCode()).isEqualTo(NOT_FOUND);
        assertThat(response.getBody().getCode()).isEqualTo(404);
        assertThat(response.getBody().getMessage()).isEqualTo("Invalid Request");
    }

}
