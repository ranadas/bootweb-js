package com.rdas.spring.exception;

/**
 * Created by rdas on 23/07/2016.
 */
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
