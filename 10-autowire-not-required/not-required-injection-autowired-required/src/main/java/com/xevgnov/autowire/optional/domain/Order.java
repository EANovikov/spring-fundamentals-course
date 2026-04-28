package com.xevgnov.autowire.optional.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Builder
@Data
public class Order {

    private UUID id = UUID.randomUUID();
    private String clientEmail;
    private String deliveryAddress;
    private List<String> dishes;
    private UUID paymentId;

}
