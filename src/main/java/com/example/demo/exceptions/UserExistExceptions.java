package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class UserExistExceptions extends RuntimeException {
    public UserExistExceptions(String message) {
        super(message);
    }
}
