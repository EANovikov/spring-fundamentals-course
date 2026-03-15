package com.xevgnov.iocdi.service;

import com.xevgnov.iocdi.domain.TemperatureMode;

public interface PrintService {
    void print(double value, TemperatureMode mode);
}
