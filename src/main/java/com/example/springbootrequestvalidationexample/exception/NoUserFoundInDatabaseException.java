package com.example.springbootrequestvalidationexample.exception;

public class NoUserFoundInDatabaseException extends Exception {
    public NoUserFoundInDatabaseException(String message) {
        super(message);
    }
}
