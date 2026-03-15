package com.xevgnov.autowire.domain;

import java.util.List;
import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Order {

  private UUID id = UUID.randomUUID();  
  private String clientEmail;  
  private String deliveryAddress;
  private List<String> dishes;
  private UUID paymentId;
  
}
