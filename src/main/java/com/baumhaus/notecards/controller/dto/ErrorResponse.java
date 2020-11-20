package com.baumhaus.notecards.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

@Getter
@AllArgsConstructor
@Value
public class ErrorResponse {

    private int code;
    private String message;
}
