package com.xevgnov;

import com.xevgnov.service.DateTimeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        // Creating context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        // Getting a bean
        DateTimeService dateTimeService = context.getBean(DateTimeService.class);
        dateTimeService.printDateTime();
    }

}