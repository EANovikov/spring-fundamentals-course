package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.Temperature;


public interface TemperatureService {

    void print(double temperature);

    Temperature convert(double temperature);
}
