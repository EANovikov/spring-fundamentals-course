package com.xevgnov.autowire.circular.solution.one.service;

import java.util.UUID;

import com.xevgnov.autowire.circular.solution.one.dto.Order;

public interface DeliveryService {
    
    void deliveryOrder(Order order);
    String getEstimatedDeliveryTime();

}
