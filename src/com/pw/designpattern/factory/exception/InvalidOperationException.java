package com.pw.designpattern.factory.exception;

// An exception class invokes when user input invalid choice for operation
public class InvalidOperationException extends Exception{
    public InvalidOperationException(String message) {
        super(message);
    }

}
