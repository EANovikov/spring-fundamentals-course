package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.TemperatureMode;

public class PrintServiceImpl implements PrintService {

    @Override
    public void print(double value, TemperatureMode mode) {
        switch (mode) {
            case TemperatureMode.FARENHEIT:
                System.out.println(value + " °F");
                break;
            case TemperatureMode.CELSIUS:
                System.out.println(value + " °C");
                break;
            default:
                System.err.println(value + " unknown mode");
                break;
        }

    }

}
