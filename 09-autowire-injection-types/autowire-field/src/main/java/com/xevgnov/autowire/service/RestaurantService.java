package com.xevgnov.autowire.service;

import com.xevgnov.autowire.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RestaurantService {

    //field injections
    @Autowired
    private FoodService foodService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private DeliveryService deliveryService;
    @Autowired
    public ClientService clientService;

    public void makeOrder(Order order) {
        log.info("Starting to handle the order [{}]", order.getId());
        clientService.sendEmail(order);
        paymentService.processPayment(order);
        foodService.cookFood(order);
        deliveryService.deliver(order);
        clientService.sendSurvey(order);
        log.info("Finishing to handle the order [{}]", order.getId());
    }

}