package com.xevgnov.autowire.circular.solution.three.dto;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

  @JsonIgnore
  private UUID id = UUID.randomUUID();

  @Email(message = "Not a valid email")
  private String clientEmail;

  @NotBlank(message = "Delivery address cannot be empty")
  private String deliveryAddress;

  @NotEmpty(message = "Your order should include at least on dish")
  private List<String> dishes;

  @NotNull(message = "Paymet ID is required")
  private UUID paymentId;

  private String estimatedTime;

  private Status status;

}
