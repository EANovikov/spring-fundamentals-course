package com.xevgnov.iocdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;

@Service
public class FahrenheitTemperatureService implements TemperatureService {

    // Field injection - injecting PrintServiceImpl
    @Autowired
    private PrintService printService;

    @Override
    public Temperature convert(double temperature) {
        return new Temperature((temperature - 32.0) / 1.8, TemperatureMode.CELSIUS);
    }

    @Override
    public void print(double temperature) {
        printService.print(temperature, TemperatureMode.FARENHEIT);
    }

}
