package com.xevgnov;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Application {

    //Context types
    // 1) AnnotationConfigApplicationContext
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        context.registerShutdownHook();
        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
        context.getBean("dateTimeServiceImpl");
        dateTimeService.printDateTime();
    }

    // 2) ClassPathXmlApplicationContext
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        context.registerShutdownHook();
//        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
//            context.getBean("dateTimeServiceImpl");
//            dateTimeService.printDateTime();
//    }


    // 3) FileSystemXmlApplicationContext
//    public static void main(String[] args) {
//        //Important: do not point to src/main/resources/application-config.xml file
//        //copy application-config.xml and paste it some external place like C:/Users/<username>
//        // Update the path in FileSystemXmlApplicationContext constructor
//        ConfigurableApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/ENovikov/application-config.xml");
//        context.registerShutdownHook();
//        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
//        context.getBean("dateTimeServiceImpl");
//        dateTimeService.printDateTime();
//    }


}