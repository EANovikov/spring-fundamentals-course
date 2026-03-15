package com.xevgnov.autowire.circular.problem.service;

import java.util.UUID;

public interface DeliveryService {
    
    void deliveryOrder(UUID id);
    String getEstimatedDeliveryTime();

}
