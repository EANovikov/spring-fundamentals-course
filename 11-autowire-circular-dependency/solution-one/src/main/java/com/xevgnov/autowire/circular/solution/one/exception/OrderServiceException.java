package com.xevgnov.autowire.circular.solution.one.exception;

public class OrderServiceException extends RuntimeException {

    public OrderServiceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public OrderServiceException(String message) {
        super(message);
    }
    
}
