package com.example.domain.exceptions;

public class UserException extends Exception {

    private final String errorCode;
    private final String errorMessage;

    public UserException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}