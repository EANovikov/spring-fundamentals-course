package com.xevgnov.iocdi;

import com.xevgnov.iocdi.service.PrintService;
import com.xevgnov.iocdi.service.PrintServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    //Comment printService in Application.java and uncomment the code below
//    @Bean
//    PrintService printService() {
//        return new PrintServiceImpl();
//    }
}
