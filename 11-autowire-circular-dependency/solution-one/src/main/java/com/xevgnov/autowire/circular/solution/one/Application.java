package com.xevgnov.autowire.circular.solution.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAsync
@SpringBootApplication
public class Application {

	/* Fixing the circular dependency issue by re-designing the services: 
	 * Changing
	 * DeliveryService method deliveryOrder(UUID id)
	 * to
	 * DeliveryService method deliveryOrder(Order order)
	 * Now DeliveryService does not need to inject OrderService any more
	*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
