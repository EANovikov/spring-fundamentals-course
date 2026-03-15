package com.xevgnov.autowire.circular.solution.one.service;

import java.util.UUID;

import com.xevgnov.autowire.circular.solution.one.dto.Order;

public interface OrderService {

   UUID placeOrder(Order order);
   Order getOrder(UUID id);

}
