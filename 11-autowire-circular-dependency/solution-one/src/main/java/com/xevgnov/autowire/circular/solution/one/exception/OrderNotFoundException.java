package com.xevgnov.autowire.circular.solution.one.exception;

public class OrderNotFoundException extends OrderServiceException {

    public OrderNotFoundException(String message) {
        super(message);
    }
    
}
