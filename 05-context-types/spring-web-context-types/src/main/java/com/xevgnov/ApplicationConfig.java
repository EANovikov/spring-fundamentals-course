package com.xevgnov;

import com.xevgnov.service.TimeService;
import com.xevgnov.service.TimeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xevgnov")
public class ApplicationConfig {

    @Bean
    public TimeService timeService() {
        return new TimeServiceImpl();
    }
}
