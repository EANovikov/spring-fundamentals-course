package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;

public class FahrenheitTemperatureService implements TemperatureService {

    private final PrintService printService;

    public FahrenheitTemperatureService(PrintService printService) {
        this.printService = printService;
    }

    @Override
    public Temperature convert(double temperature) {
        return new Temperature((temperature - 32.0) / 1.8, TemperatureMode.CELSIUS);
    }

    @Override
    public void print(double temperature) {
        printService.print(temperature, TemperatureMode.FARENHEIT);
    }

}
