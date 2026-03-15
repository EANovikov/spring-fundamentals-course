package com.xevgnov.autowire.circular.solution.two.exception;

public class OrderNotFoundException extends OrderServiceException {

    public OrderNotFoundException(String message) {
        super(message);
    }
    
}
