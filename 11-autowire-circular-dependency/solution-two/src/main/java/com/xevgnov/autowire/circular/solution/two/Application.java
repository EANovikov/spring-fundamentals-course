package com.xevgnov.autowire.circular.solution.two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAsync
@SpringBootApplication
public class Application {

    /*
	 * One of the classes inject another with @Lazy annotaion
	 * Instead of eager intialization on application start, 
	 * the bean initialized later in the moment of the first usage
	 * DeliveryService injects @Lazy OrderService orderService
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
