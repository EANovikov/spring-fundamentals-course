package com.xevgnov.autowire.circular.problem.service;

import com.xevgnov.autowire.circular.problem.dto.Order;
import com.xevgnov.autowire.circular.problem.dto.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Service
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
public class ProcessingServiceImpl implements ProcessingService {

    private final DeliveryService deliveryService;

    public ProcessingServiceImpl(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Async
    @Override
    public void process(Order order) {
        try {
            order.setStatus(Status.PROCESSING);
            long orderProcessingTime = ThreadLocalRandom.current().nextLong(1000L, 2000L);
            Thread.sleep(orderProcessingTime);
            order.setStatus(Status.READY);
            log.info("Order {} processed successfully", order.getId());
            deliveryService.deliveryOrder(order.getId());
            order.setEstimatedTime(deliveryService.getEstimatedDeliveryTime());
        } catch (InterruptedException e) {
            log.error("Order proccessing issue. Order details: {}", order, e);
        }

    }

}
