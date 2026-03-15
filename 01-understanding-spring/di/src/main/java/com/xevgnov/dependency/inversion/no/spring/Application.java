package com.xevgnov.dependency.inversion.no.spring;

import com.xevgnov.dependency.inversion.no.spring.service.DateService;
import com.xevgnov.dependency.inversion.no.spring.service.DateServiceImpl;
import com.xevgnov.dependency.inversion.no.spring.service.DateTimeService;
import com.xevgnov.dependency.inversion.no.spring.service.DateTimeServiceImpl;
import com.xevgnov.dependency.inversion.no.spring.service.TimeService;
import com.xevgnov.dependency.inversion.no.spring.service.TimeServiceImpl;

public class Application {
    public static void main(String[] args) {
        DateService dateService = new DateServiceImpl();
        TimeService timeService = new TimeServiceImpl();
        DateTimeService dateTimeService = new DateTimeServiceImpl(dateService, timeService);
        dateTimeService.printDateTime();
    }
}