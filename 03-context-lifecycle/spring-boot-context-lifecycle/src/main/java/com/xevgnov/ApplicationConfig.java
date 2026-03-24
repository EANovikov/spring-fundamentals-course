package com.xevgnov;

import com.xevgnov.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Since @SpringBootApplication in @Application.java already includes @ComponentScan
// we can omit this annotation here
// @ComponentScan("com.xevgnov.service")
public class ApplicationConfig {

    // injecting dateService and timeService
    @Bean
    public DateTimeService dateTimeService(DateService dateService, TimeService timeService) {
        return new DateTimeServiceImpl(dateService, timeService);
    }

//Alternative way to inject timeService
//    @Bean
//    public DateTimeService dateTimeService(DateService dateService) {
//        return new DateTimeServiceImpl(dateService, timeService());
//    }

    @Bean
    public TimeService timeService() {
        return new TimeServiceImpl();
    }
}
