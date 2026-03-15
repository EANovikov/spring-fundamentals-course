package com.xevgnov.autowire.optional.service;

import org.springframework.stereotype.Service;

import com.xevgnov.autowire.optional.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DeliveryService {
    public void deliver(Order order) {
        log.info("Delivering order [{}] to [{}]",
                order.getId(), order.getDeliveryAddress());
    }
}
