package com.xevgnov;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xevgnov.service.DateTimeService;

@SpringBootApplication
public class ApplicationInjectingBeansWithTheSameType {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationInjectingBeansWithTheSameType.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(
            DateTimeService dateTimeService
	// To avoid an issues with getting by type use @Qualifier to specify the bean name
	// @Qualifier("dateTimeServiceImplV1") DateTimeService dateTimeService
	// @Qualifier("dateTimeServiceImplV2") DateTimeService dateTimeService
	) {
		return args -> dateTimeService.printDateTime();
	}

}
