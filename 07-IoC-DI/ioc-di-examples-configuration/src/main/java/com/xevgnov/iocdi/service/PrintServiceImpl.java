package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.TemperatureMode;

public class PrintServiceImpl implements PrintService {

    @Override
    public void print(double value, TemperatureMode mode) {
        switch (mode) {
            case TemperatureMode.FAHRENHEIT -> System.out.println(value + " °F");
            case TemperatureMode.CELSIUS -> System.out.println(value + " °C");
            default -> System.err.println(value + " unknown mode");
        }
    }

}
