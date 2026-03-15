package com.xevgnov.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xevgnov.annotations.service.TimeService;
import com.xevgnov.annotations.service.TimeServiceImpl;

@Configuration
@ComponentScan("com.xevgnov.service")
public class ApplicationConfig {

    @Bean
    public TimeService timeService() {
        return new TimeServiceImpl();
    }
}
