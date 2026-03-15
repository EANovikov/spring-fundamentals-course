package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CelsiusTemperatureService implements TemperatureService {

    private PrintService printService;

    @Autowired
    public CelsiusTemperatureService(PrintService printService) {
        this.printService = printService;
    }

    public CelsiusTemperatureService() {}

    @Override
    public Temperature convert(double temperature) {
        return new Temperature(temperature * 1.8 + 32.0, TemperatureMode.FARENHEIT);
    }

    @Override
    public void print(double temperature) {
        printService.print(temperature, TemperatureMode.CELSIUS);
    }

}
