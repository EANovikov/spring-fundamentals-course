package com.xevgnov.autowire.circular.solution.two.service;

import java.util.UUID;

public interface DeliveryService {
    
    void deliveryOrder(UUID id);
    String getEstimatedDeliveryTime();

}
