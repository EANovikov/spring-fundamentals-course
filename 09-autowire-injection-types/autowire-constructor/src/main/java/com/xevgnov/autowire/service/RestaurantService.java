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

    @Autowired
    public RestaurantService(FoodService foodService,
                             PaymentService paymentService,
                             DeliveryService deliveryService,
                             ClientService clientService) {
        this.foodService = foodService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.clientService = clientService;
    }

    // Uncomment to see BeanCreationException:
    // Invalid autowire-marked constructor: public com.xevgnov.autowire.service.RestaurantService().
    // Found constructor with 'required' Autowired annotation already
    // @Autowired
    public RestaurantService() { }

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