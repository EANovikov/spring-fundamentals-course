package com.xevgnov;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;


public class Application {

    public static void main(String[] args) {
        // Creating context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        // Getting a bean
        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
        dateTimeService.printDateTime();
    }

}