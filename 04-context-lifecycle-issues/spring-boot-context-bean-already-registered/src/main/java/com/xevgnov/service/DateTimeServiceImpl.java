package com.xevgnov.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class DateTimeServiceImpl implements DateTimeService, ApplicationRunner {

    private final DateService dateService;
    private final TimeService timeService;

    public DateTimeServiceImpl(DateService dateService, TimeService timeService) {
        System.out.println("Creating dateTimeServiceImpl service");
        this.dateService = dateService;
        this.timeService = timeService;
    }

    public void printDateTime() {
        System.out.println("Calling dateTimeServiceImpl.printDateTime();");
        dateService.printDate();
        timeService.printTime();
    }

    @Override
    public void run(ApplicationArguments args) {
        printDateTime();
    }
}