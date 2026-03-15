package com.xevgnov.iocdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;

@Service
public class CelsiusTemperatureService implements TemperatureService {

    private ApplicationContext context;

    // Constructor injection - injecting whole context
    public CelsiusTemperatureService(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public Temperature convert(double temperature) {
        return new Temperature(temperature * 1.8 + 32.0, TemperatureMode.FARENHEIT);
    }

    @Override
    public void print(double temperature) {
        // fetching PrintServiceImpl from IoC container
        PrintService printService = context.getBean(PrintService.class);
        printService.print(temperature, TemperatureMode.CELSIUS);
    }

}
