package com.xevgnov;

import com.xevgnov.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class ApplicationConfigNested {
    
    @Bean
    public TimeService timeService(){
        return new TimeServiceImpl();
    }

    @Bean
    public DateService dateService() {
        return new DateServiceImpl();
    }

}
