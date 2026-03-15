package com.xevgnov.autowire.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xevgnov.autowire.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FoodService {
    public void cookFood(Order order) {
        order.getDishes()
                .forEach(dish -> log.info("Cooking [{}] for order [{}]", dish, order.getId()));
    }
}
