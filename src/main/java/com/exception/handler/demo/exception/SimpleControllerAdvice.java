package com.exception.handler.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SimpleControllerAdvice {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> handleSimple(ArithmeticException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("stop!!!");
    }
}