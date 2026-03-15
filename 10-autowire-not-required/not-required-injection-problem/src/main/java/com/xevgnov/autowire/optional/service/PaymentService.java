package com.xevgnov.autowire.optional.service;

import org.springframework.stereotype.Service;
import com.xevgnov.autowire.optional.domain.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PaymentService {
    public void processPayment(Order order) {
        log.info("Handling payment [{}] for order [{}]",
                order.getPaymentId(), order.getId());
    }
}
