package com.xevgnov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xevgnov.service.TimeService;
import com.xevgnov.service.TimeServiceImpl;

@Configuration
@ComponentScan("com.xevgnov.service")
public class ApplicationConfig {

    @Bean
    public TimeService timeService() {
        return new TimeServiceImpl();
    }
}
