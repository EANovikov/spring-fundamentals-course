package com.xevgnov.autowire.circular.solution.one.service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.stereotype.Service;

import com.xevgnov.autowire.circular.solution.one.dto.Order;
import com.xevgnov.autowire.circular.solution.one.dto.Status;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DeliveryServiceImpl implements DeliveryService {

    public static long MAX_DELIVERY_DELAY = 180000L;
    public static long MIN_DELIVERY_DELAY = 60000L;

    private static final ExecutorService couriers = Executors.newFixedThreadPool(3);

    @Override
    public String getEstimatedDeliveryTime() {
        LocalTime current = LocalTime.now();
        ThreadPoolExecutor threadPool = (ThreadPoolExecutor) couriers;
        int queueSize = threadPool.getQueue().isEmpty() ? 1 : threadPool.getQueue().size();
        long minDelaySec = Duration.ofMillis(queueSize * MIN_DELIVERY_DELAY).getSeconds();
        long maxDelaySec = Duration.ofMillis(queueSize * MAX_DELIVERY_DELAY).getSeconds();
        Duration minWait = Duration.between(current, current.plusSeconds(minDelaySec));
        Duration maxWait = Duration.between(current, current.plusSeconds(maxDelaySec));
        String outputFormat = "%d min - %d min";
        return String.format(outputFormat, minWait.toMinutes(), maxWait.toMinutes());
    }

    @Override
    public void deliveryOrder(Order order) {
        couriers.submit(() -> doDelivery(order));
    }

    private void doDelivery(Order order) {
        order.setStatus(Status.IN_DELIVERY);
        try {
            long orderDeliveryTime = ThreadLocalRandom.current().nextLong(MIN_DELIVERY_DELAY, MAX_DELIVERY_DELAY);
            Thread.sleep(orderDeliveryTime);
        } catch (InterruptedException e) {
            log.error("Order delivery issue. Order details: {}", order, e);
        }
        order.setStatus(Status.DELIVERED);
        log.info("Order {} is delivered", order.getId());
    }

    @PreDestroy
    private void preDestroy() {
        if (!couriers.isShutdown()) {
            couriers.shutdown();
        }
    }

}
