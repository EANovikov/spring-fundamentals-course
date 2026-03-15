package com.xevgnov.autowire.circular.solution.three.service;

import java.util.UUID;

import com.xevgnov.autowire.circular.solution.three.dto.Order;

public interface OrderService {

   UUID placeOrder(Order order);
   Order getOrder(UUID id);
   void setDeliveryService(DeliveryService deliveryService);
}
