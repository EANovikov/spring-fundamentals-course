package com.xevgnov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xevgnov.service.TimeService;
import com.xevgnov.service.TimeServiceImpl;

@Configuration
// @ComponentScan is required to find all classes annotated with @Component
// these classes will be registered as the Spring beans in the IoC container
@ComponentScan("com.xevgnov.service")
public class ApplicationConfig {

    // timeService bean will be added to IoC container
    @Bean
    public TimeService timeService(){
        return new TimeServiceImpl();
    }
}
