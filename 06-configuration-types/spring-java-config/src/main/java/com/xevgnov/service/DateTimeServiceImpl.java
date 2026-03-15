package com.xevgnov.service;

import org.springframework.beans.factory.annotation.Autowired;


public class DateTimeServiceImpl implements DateTimeService {

    private DateService dateService;
    private TimeService timeService;

    @Autowired
    public DateTimeServiceImpl(DateService dateService, TimeService timeService) {
        this.dateService = dateService;
        this.timeService = timeService;
    }

    public void printDateTime() {
        dateService.printDate();
        timeService.printTime();
    }

}