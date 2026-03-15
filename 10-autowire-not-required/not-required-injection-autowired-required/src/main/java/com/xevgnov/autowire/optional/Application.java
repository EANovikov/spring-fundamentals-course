package com.xevgnov.autowire.optional;

import com.xevgnov.autowire.optional.domain.Order;
import com.xevgnov.autowire.optional.service.AnalyticService;
import com.xevgnov.autowire.optional.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // use Autowired with required = false to inject analyticService
    @Bean
    CommandLineRunner commandLineRunner(@Autowired RestaurantService restaurantService,
                                        @Autowired(required = false) AnalyticService analyticService) {
        restaurantService.makeOrder(Order.builder()
                .clientEmail("john.doe@gmail.com")
                .deliveryAddress("Wroclaw, Plac Konstytucji 3 Maja")
                .dishes(List.of("Pizza", "Chips", "Gyros"))
                .paymentId(UUID.randomUUID()).build());
        if (analyticService != null) {
            analyticService.doAnalytics();
        }
        return args -> log.info("Done!");
    }

}
