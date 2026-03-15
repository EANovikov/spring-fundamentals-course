package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FahrenheitTemperatureService implements TemperatureService {

    private PrintService printService;

    @Autowired
    public FahrenheitTemperatureService(PrintService printService) {
        this.printService = printService;
    }

    public FahrenheitTemperatureService() {}

    @Override
    public Temperature convert(double temperature) {
        return new Temperature((temperature - 32.0) / 1.8, TemperatureMode.CELSIUS);
    }

    @Override
    public void print(double temperature) {
        printService.print(temperature, TemperatureMode.FARENHEIT);
    }

}
