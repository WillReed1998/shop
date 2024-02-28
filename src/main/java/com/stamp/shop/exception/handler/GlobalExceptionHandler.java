package com.stamp.shop.exception.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class, RuntimeException.class})
    public final ResponseEntity<Map<String, List<String>>> handleGenericException(Exception e) {
        var errors = List.of(e.getMessage());

        return getException(errors, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<Map<String, List<String>>> getException(List<String> errors, HttpStatus httpStatus) {

        return new ResponseEntity<>(
                Map.of("errors", errors),
                new HttpHeaders(),
                httpStatus
        );
    }
}
