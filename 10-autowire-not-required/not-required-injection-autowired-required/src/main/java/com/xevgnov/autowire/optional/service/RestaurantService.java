package com.xevgnov.autowire.optional.service;

import com.xevgnov.autowire.optional.domain.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RestaurantService {

    private final FoodService foodService;

    private final PaymentService paymentService;

    private final DeliveryService deliveryService;

    private final ClientService clientService;

    public RestaurantService(FoodService foodService, PaymentService paymentService, DeliveryService deliveryService, ClientService clientService) {
        this.foodService = foodService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.clientService = clientService;
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

}