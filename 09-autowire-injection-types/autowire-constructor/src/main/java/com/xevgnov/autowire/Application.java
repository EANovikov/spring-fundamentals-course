package com.xevgnov.autowire;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xevgnov.autowire.domain.Order;
import com.xevgnov.autowire.service.RestaurantService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(RestaurantService restaurantService) {
		restaurantService.makeOrder(Order.builder()
				.clientEmail("john.doe@gmail.com")
				.deliveryAddress("Wroclaw, Plac Konstytucji 3 Maja")
				.dishes(List.of("Pizza", "Chips", "Gyros"))
				.paymentId(UUID.randomUUID()).build());
		return args -> log.info("Done!");
	}

}
