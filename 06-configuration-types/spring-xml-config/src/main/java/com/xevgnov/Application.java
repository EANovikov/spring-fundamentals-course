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


    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        context.registerShutdownHook();
        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
            context.getBean("dateTimeService");
            dateTimeService.printDateTime();
    }


}