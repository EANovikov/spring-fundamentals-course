package com.xevgnov.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service("dateTimeService")
//Uncomment the line to fix the bean naming conflict
//@Service("dateTimeServiceImplV2")
public class DateTimeServiceImplV2 implements DateTimeService, ApplicationRunner {

    private final DateService dateService;
    private final TimeService timeService;

    public DateTimeServiceImplV2(DateService dateService, TimeService timeService) {
        System.out.println("Creating dateTimeServiceImplV2 service");
        this.dateService = dateService;
        this.timeService = timeService;
    }

    public void printDateTime() {
        System.out.println("Calling dateTimeServiceImplV2.printDateTime();");
        dateService.printDate();
        timeService.printTime();
    }

    @Override
    public void run(ApplicationArguments args) {
        printDateTime();
    }
}