package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.domain.TemperatureMode;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

@Service
public class FahrenheitTemperatureService implements TemperatureService {


    @Override
    public Temperature convert(double temperature) {
        return new Temperature((temperature - 32.0) / 1.8, TemperatureMode.CELSIUS);
    }

    // Uncomment to see a lookup injection
    @Override
    public void print(double temperature) {
        PrintService printService = getPrintService();
        printService.print(temperature, TemperatureMode.FARENHEIT);
    }

    @Lookup
    PrintService getPrintService() {
        return null;
    }
}
