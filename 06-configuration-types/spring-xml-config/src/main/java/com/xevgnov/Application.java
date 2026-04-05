package com.xevgnov;

import com.xevgnov.service.DateTimeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        context.registerShutdownHook();
        DateTimeService dateTimeService = context.getBean(DateTimeService.class);
        dateTimeService.printDateTime();
    }


}