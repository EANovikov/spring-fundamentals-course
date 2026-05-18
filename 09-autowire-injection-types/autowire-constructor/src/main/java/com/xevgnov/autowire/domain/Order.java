package com.xevgnov.autowire.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;


@Data
@Builder
public class Order {

    private UUID id = UUID.randomUUID();
    private String clientEmail;
    private String deliveryAddress;
    private List<String> dishes;
    private UUID paymentId;

}
