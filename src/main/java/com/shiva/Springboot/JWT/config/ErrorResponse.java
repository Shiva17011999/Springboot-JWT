package com.shiva.Springboot.JWT.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    private HttpStatus statusCode;
    private String errorMessage;
    private Object body;
    public ErrorResponse(HttpStatus statusCode,String errorMessage,Object body){
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
        this.body = body;
    }

    // Constructor with two arguments
    public ErrorResponse(HttpStatus statusCode, String errorMessage) {
        this(statusCode, errorMessage, null);
    }

    public int getStatusCodeValue;

}
