package com.java.interview.exam_app.exception;

// Custom Exception for Not Found
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}