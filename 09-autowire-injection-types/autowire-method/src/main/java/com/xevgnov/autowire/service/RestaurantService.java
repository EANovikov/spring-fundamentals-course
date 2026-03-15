package com.xevgnov.autowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xevgnov.autowire.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RestaurantService {

    private FoodService foodService;

    private PaymentService paymentService;

    private DeliveryService deliveryService;

    private ClientService clientService;


    public void makeOrder(Order order) {
        log.info("Starting to handle the order [{}]", order.getId());
        clientService.sendEmail(order);
        paymentService.processPayment(order);
        foodService.cookFood(order);
        deliveryService.deliver(order);
        clientService.sendSurvey(order);
        log.info("Finishing to handle the order [{}]", order.getId());
    }

    //typical setter injection
    @Autowired
    public void setFoodService(FoodService foodService) {
        this.foodService = foodService;
    }

    //typical setter injection
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //any method can be used for injection
    @Autowired
    public void initDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    //any method can be used for injection, even private one
    @Autowired
    private void initClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    //it is also possible to inject multiple dependencies in one method, but it is not recommended as it can make the code less readable
    @Autowired
    private void initClientServiceAndDeliveryService(ClientService clientService, DeliveryService deliveryService) {
        this.clientService = clientService;
        this.deliveryService = deliveryService;
    }
}