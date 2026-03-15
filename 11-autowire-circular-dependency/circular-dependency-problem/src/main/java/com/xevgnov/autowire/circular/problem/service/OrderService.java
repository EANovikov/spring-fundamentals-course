package com.xevgnov.autowire.circular.problem.service;

import java.util.UUID;

import com.xevgnov.autowire.circular.problem.dto.Order;

public interface OrderService {

   UUID placeOrder(Order order);
   Order getOrder(UUID id);

}
