package com.xevgnov;

import com.xevgnov.service.DateService;
import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;
import com.xevgnov.service.TimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    // @Bean("dateTimeService") //renaming the bean to avoid conflict
    public DateTimeService dateTimeServiceImpl(DateService dateService, TimeService timeService) {
        return new DateTimeServiceImpl(dateService, timeService);
    }
}
