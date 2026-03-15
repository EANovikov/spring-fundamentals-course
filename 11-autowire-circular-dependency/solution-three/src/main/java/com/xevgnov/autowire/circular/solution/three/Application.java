package com.xevgnov.autowire.circular.solution.three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAsync
@SpringBootApplication
public class Application {

	// GET http://localhost:8080/orders/55e53f23-ee18-4a1e-8b18-52aee8287b1c
	// POST http://localhost:8080/orders
	//{
	// 	"clientEmail": "john.doe@gmail.com",
	// 	"deliveryAddress": "731 Lexington Ave, New York, NY 10022, United States",
	// 	"dishes": [
	// 		"Fish",
	// 		"Chips"
	// 	],
	// 	"paymentId": "01debdb4-4c3e-45e0-bc86-ebc505877da6"
	// }

    /*
	 * Get read of autowiring in one service and delegate injection to other service
	 * which does injection
	 * 1) add setDeliveryService constructor to OrderService
	 * 2) DeliveryService injects OrderService i.e. via constructor
	 * 3) DeliveryService calls setDeliveryService and injects itself to DeliveryService
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
