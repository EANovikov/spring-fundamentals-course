package com.xevgnov.annotations;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xevgnov.annotations.service.DateTimeService;

@SpringBootApplication
public class Application {

    // call SpringApplication.run to configure and create the context
	// if we need to run any logic right after application start, ApplicationRunner or CommandLineRunner bean can be used
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	//to run the logic on application startup
	@Bean
	CommandLineRunner commandLineRunner(DateTimeService dateTimeService) {
		return args -> dateTimeService.printDateTime();
	}

	// Alternative way to run any logic after application start is to access context directly 

//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//		DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
//		System.out.println("on application start: " + context.getClass());
//		dateTimeService.printDateTime();
//	}


}
