package com.xevgnov.autowire.circular.solution.three.exception;

public class OrderNotFoundException extends OrderServiceException {

    public OrderNotFoundException(String message) {
        super(message);
    }
    
}
