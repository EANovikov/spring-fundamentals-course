package com.xevgnov.autowire.service;

import org.springframework.stereotype.Service;

import com.xevgnov.autowire.domain.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClientService {
    public void sendEmail(Order order) {
        log.info("Sending order details [{}] to [{}]",
                order, order.getClientEmail());
    }

    public void sendSurvey(Order order) {
        log.info("Sending survey [{}] to [{}]",
                order, order.getClientEmail());
    }
}
