package com.xevgnov.service;

import org.springframework.stereotype.Service;

@Service("dateTimeServiceImplV2")
public class DateTimeServiceImplV2 implements DateTimeService {

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

}