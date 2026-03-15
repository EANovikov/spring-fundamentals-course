package com.xevgnov;

import com.xevgnov.service.DateService;
import com.xevgnov.service.DateServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.xevgnov.service")
@ImportResource("application-config.xml")
public class ApplicationConfig {

    @Bean
    public DateService dateService() {
        return new DateServiceImpl();
    }
}
