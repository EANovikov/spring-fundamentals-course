package com.xevgnov;

import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
        context.getBean("dateTimeServiceImpl");
        dateTimeService.printDateTime();
    }

}