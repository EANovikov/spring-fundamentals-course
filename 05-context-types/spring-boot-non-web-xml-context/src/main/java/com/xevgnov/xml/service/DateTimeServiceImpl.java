package com.xevgnov.xml.service;

import org.springframework.stereotype.Service;

@Service
public class DateTimeServiceImpl implements DateTimeService {

    private DateService dateService;
    private TimeService timeService;

    public DateTimeServiceImpl(DateService dateService, TimeService timeService) {
        this.dateService = dateService;
        this.timeService = timeService;
    }

    public void printDateTime() {
        dateService.printDate();
        timeService.printTime();
    }

}