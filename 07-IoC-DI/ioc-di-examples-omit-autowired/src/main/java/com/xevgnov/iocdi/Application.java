package com.xevgnov.iocdi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.xevgnov.iocdi.domain.Temperature;
import com.xevgnov.iocdi.service.PrintService;
import com.xevgnov.iocdi.service.PrintServiceImpl;
import com.xevgnov.iocdi.service.TemperatureService;

// since we are using @SpringBootApplication annotation Application is a Configuration class
// @SpringBootApplication contains @SpringBootConfiguration which contains @Configuration
// However there could be more configuration files,
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

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
