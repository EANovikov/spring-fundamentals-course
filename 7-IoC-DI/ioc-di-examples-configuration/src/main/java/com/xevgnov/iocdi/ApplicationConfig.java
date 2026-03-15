package com.xevgnov.iocdi;

import com.xevgnov.iocdi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    PrintService printService() {
        return new PrintServiceImpl();
    }

    // 1) printService injected as a method argument
    @Bean
    public TemperatureService celsiusTemperatureService(PrintService printService){
        return new CelsiusTemperatureService(printService);
    }

    // 2) printService injected via printService method invocation
    @Bean
    public TemperatureService fahrenheitTemperatureService(){
        return new FahrenheitTemperatureService(printService());
    }
}
