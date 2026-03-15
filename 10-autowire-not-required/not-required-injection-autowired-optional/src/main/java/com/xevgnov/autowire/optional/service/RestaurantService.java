package com.xevgnov.autowire.optional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xevgnov.autowire.optional.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RestaurantService {

    //field injection
    @Autowired
    private FoodService foodService;

    private PaymentService paymentService;

    private DeliveryService deliveryService;

    private ClientService clientService;

    //constructor injection
    @Autowired
    public RestaurantService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //only one constructor can be used for constructor injection
    //uncomment to see
    //org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'restaurantService': Invalid autowire-marked constructor: public com.xevgnov.autowire.service.RestaurantService(com.xevgnov.autowire.service.PaymentService). Found constructor with 'required' Autowired annotation already: public com.xevgnov.autowire.service.RestaurantService()
    //@Autowired
    public RestaurantService() {
    }

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
    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    //any method can be used for injection, even private one
    @Autowired
    private void initClientService(ClientService clientService) {
        this.clientService = clientService;
    }

}