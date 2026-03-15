package com.xevgnov.spring.di;

import com.xevgnov.spring.di.service.DateTimeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        //no need to create service instances (timeService, dataService), Spring will do it for us and inject dependencies
        DateTimeService dateTimeService = context.getBean(DateTimeService.class);
        dateTimeService.printDateTime();
    }
}