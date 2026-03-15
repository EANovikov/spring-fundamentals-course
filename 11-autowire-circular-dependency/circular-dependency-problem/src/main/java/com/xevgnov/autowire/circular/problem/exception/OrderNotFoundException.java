package com.xevgnov.autowire.circular.problem.exception;

public class OrderNotFoundException extends OrderServiceException {

    public OrderNotFoundException(String message) {
        super(message);
    }
    
}
