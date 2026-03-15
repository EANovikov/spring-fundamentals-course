package com.xevgnov.iocdi;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.service.PrintService;
import com.xevgnov.iocdi.service.TemperatureService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Run with one of those:
    // @Qualifier("celsiusTemperatureService") or @Qualifier("fahrenheitTemperatureService")
    // see @Autowired annotation usage in the services
    @Bean
    CommandLineRunner commandLineRunner(
            @Qualifier("celsiusTemperatureService")
            // @Qualifier("fahrenheitTemperatureService")
            TemperatureService temperatureService,
            PrintService printService) {
        double temperature = 32.0;
        temperatureService.print(temperature);
        Temperature convertedTemperature = temperatureService.convert(temperature);
        printService.print(convertedTemperature.value(), convertedTemperature.mode());
        return args -> System.out.println(temperatureService + " work is completed");
    }

}
