package com.flipkart.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlredyExist.class)
    ResponseEntity<String> handleUserAlredyExist(UserAlredyExist userAlredyExist) {
        return ResponseEntity.badRequest().body(userAlredyExist.getMessage());
    }
}
