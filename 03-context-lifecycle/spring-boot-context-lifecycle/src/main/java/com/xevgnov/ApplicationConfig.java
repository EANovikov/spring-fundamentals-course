package com.xevgnov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xevgnov.service.TimeService;
import com.xevgnov.service.TimeServiceImpl;

@Configuration
// Since @SpringBootApplication in @Application.java already includes @ComponentScan
// we can omit this annotation here
// @ComponentScan("com.xevgnov.service")
public class ApplicationConfig {

    // timeService bean will be added to IoC container
    @Bean
    public TimeService timeService() {
        return new TimeServiceImpl();
    }
}
