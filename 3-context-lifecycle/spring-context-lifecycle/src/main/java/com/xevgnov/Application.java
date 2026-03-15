package com.xevgnov;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;


public class Application {

    // Context lifecycle
    // ConfigurableApplicationContext - registerShutdownHook
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
        // Alternative ways to get beans
        // DateTimeService dateTimeService = context.getBean("dateTimeServiceImpl", DateTimeServiceImpl.class);
        // DateTimeService dateTimeService = (DateTimeService) context.getBean("dateTimeServiceImpl");
        dateTimeService.printDateTime();
    }

    // ConfigurableApplicationContext - created in try-with-resources
//    public static void main(String[] args) {
//        try (ConfigurableApplicationContext context = new
//                AnnotationConfigApplicationContext(
//                ApplicationConfig.class)) {
//            DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
//            dateTimeService.printDateTime();
//        }
//    }


    // ConfigurableApplicationContext - call close method
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new
//                AnnotationConfigApplicationContext(ApplicationConfig.class);
//        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
//        dateTimeService.printDateTime();
//        context.close();
//    }

}