package com.xevgnov.unique;

import com.xevgnov.unique.service.ReportProcessorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReportProcessorService reportProcessorService) {
        return args -> reportProcessorService.process("test report data");
    }
}
