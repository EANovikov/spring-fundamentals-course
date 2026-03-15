package com.xevgnov.iocdi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;

@Service
public class CelsiusTemperatureService implements TemperatureService {

    @Override
    public Temperature convert(double temperature) {
        return new Temperature(temperature * 1.8 + 32.0, TemperatureMode.FARENHEIT);
    }

    @Override
    public void print(double temperature) {
        PrintService printService = getPrintService();
        printService.print(temperature, TemperatureMode.CELSIUS);
    }

    @Lookup
    PrintService getPrintService() {
        return null;
    }

}
