package com.xevgnov;

import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-config.xml")
public class SpringBootWebApplication {

    // call SpringApplication.run to configure and create the context
    // if we need to run any logic right after application start, ApplicationRunner or CommandLineRunner bean can be used
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	//to run the logic on application startup
	@Bean
    ApplicationRunner commandLineRunner(DateTimeService dateTimeService) {
		return args -> System.out.println("on application start: " + dateTimeService.getDateTime());
	}

    // Alternative way to run any logic after application start is to access context directly
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(SpringBootWebApplication.class, args);
//        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
//        System.out.println("on application start: " + context.getClass());
//        System.out.println("on application start: " + dateTimeService.getDateTime());
//    }

}
