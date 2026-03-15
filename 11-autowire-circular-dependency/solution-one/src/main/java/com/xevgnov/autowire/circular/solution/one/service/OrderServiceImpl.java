package com.xevgnov.autowire.circular.solution.one.service;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.xevgnov.autowire.circular.solution.one.dto.Order;
import com.xevgnov.autowire.circular.solution.one.dto.Status;
import com.xevgnov.autowire.circular.solution.one.exception.OrderNotFoundException;
import com.xevgnov.autowire.circular.solution.one.exception.OrderServiceException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

   private static final Map<UUID, Order> orders = new ConcurrentHashMap<>();
   private final ProcessingService processingService;
   private final DeliveryService deliveryService;

   static {
      Order testOrder = Order.builder()
            .id(UUID.randomUUID())
            .clientEmail("john.doe@gmail.com")
            .deliveryAddress("Wroclaw, Plac Konstytucji 3 Maja")
            .dishes(List.of("Pizza", "Chips", "Gyros"))
            .paymentId(UUID.randomUUID())
            .status(Status.DELIVERED)
            .build();
      log.info("test order: " + testOrder);
      orders.put(testOrder.getId(), testOrder);
   }

   public OrderServiceImpl(ProcessingService processingService, DeliveryService deliveryService) {
      this.processingService = processingService;
      this.deliveryService = deliveryService;
   }

   @Override
   public UUID placeOrder(Order order) {
      log.info("Order {} is accepted", order.getId());
      try {
         order.setStatus(Status.NEW);
         orders.put(order.getId(), order);
         processingService.process(order);
         order.setEstimatedTime(deliveryService.getEstimatedDeliveryTime());
         return order.getId();
      } catch (Exception e) {
         String message = String.format("Order ID=%s placement issue", order.getId());
         OrderServiceException orderServiceException = new OrderServiceException(message);
         throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, message, orderServiceException);
      }
   }

   @Override
   public Order getOrder(UUID id) {
      Order order = orders.get(id);
      if (order == null) {
         String message = String.format("Order ID=%s not found", id);
         throw new ResponseStatusException(HttpStatus.NOT_FOUND, message, new OrderNotFoundException(message));
      }
      return order;
   }

}
