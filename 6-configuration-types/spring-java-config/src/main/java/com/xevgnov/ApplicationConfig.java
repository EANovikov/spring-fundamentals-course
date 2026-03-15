package com.xevgnov;

import com.xevgnov.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ApplicationConfigNested.class)
public class ApplicationConfig {
    

    @Bean
    public DateTimeService dateTimeService(DateService dateService, TimeService timeService) {
        return new DateTimeServiceImpl(dateService, timeService);
    }
}
