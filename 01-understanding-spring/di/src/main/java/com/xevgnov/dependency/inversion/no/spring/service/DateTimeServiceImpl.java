package com.xevgnov.dependency.inversion.no.spring.service;


public class DateTimeServiceImpl implements DateTimeService {

    private final DateService dateService;
    private final TimeService timeService;

    public DateTimeServiceImpl(DateService dateService, TimeService timeService) {
        this.dateService = dateService;
        this.timeService = timeService;
    }

    public void printDateTime() {
        dateService.printDate();
        timeService.printTime();
    }

}