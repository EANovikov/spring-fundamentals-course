package com.xevgnov.service;

import org.springframework.stereotype.Service;

@Service("dateTimeServiceImplV1")
public class DateTimeServiceImplV1 implements DateTimeService {

    private final DateService dateService;
    private final TimeService timeService;

    public DateTimeServiceImplV1(DateService dateService, TimeService timeService) {
        System.out.println("Creating dateTimeServiceImplV1 service");
        this.dateService = dateService;
        this.timeService = timeService;
    }

    public void printDateTime() {
        System.out.println("Calling dateTimeServiceImplV1.printDateTime();");
        dateService.printDate();
        timeService.printTime();
    }

}