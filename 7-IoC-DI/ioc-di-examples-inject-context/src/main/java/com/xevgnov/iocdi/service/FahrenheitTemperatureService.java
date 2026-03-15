package com.xevgnov.iocdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;

@Service
public class FahrenheitTemperatureService implements TemperatureService {
    
    // Field injection - injecting whole context
    // Usually we need to inject one or several specific beans, i.e. @Autowired private PrintService printService
    // However Springs allows to inject the whole context, so we can get any bean from it
    @Autowired 
    private ApplicationContext context;

    @Override
    public Temperature convert(double temperature) {
        return new Temperature((temperature - 32.0) / 1.8, TemperatureMode.CELSIUS);
    }

    @Override
    public void print(double temperature) {
        // fetching PrintServiceImpl from IoC container
        PrintService printService = context.getBean(PrintService.class);
        printService.print(temperature, TemperatureMode.FARENHEIT);
    }

}
