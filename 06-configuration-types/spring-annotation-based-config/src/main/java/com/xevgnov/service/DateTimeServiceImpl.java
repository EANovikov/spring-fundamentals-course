package com.xevgnov.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DateTimeServiceImpl implements DateTimeService {

    private final DateService dateService;
    private final TimeService timeService;

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