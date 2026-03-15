package com.xevgnov.autowire.circular.solution.two.service;

import java.util.UUID;

import com.xevgnov.autowire.circular.solution.two.dto.Order;

public interface OrderService {

   UUID placeOrder(Order order);
   Order getOrder(UUID id);

}
