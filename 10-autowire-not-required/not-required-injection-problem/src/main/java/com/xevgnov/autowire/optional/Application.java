package com.xevgnov.autowire.optional;

import com.xevgnov.autowire.optional.domain.Order;
import com.xevgnov.autowire.optional.service.AnalyticServis;
import com.xevgnov.autowire.optional.service.RestaurantService;
import lombok.extern.slf4j.Slf4j;
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

    /*
     * We are trying to inject Analytic service which is not yet implemented
     * Spring application fails to start context due to:
     * org.springframework.beans.factory.NoSuchBeanDefinitionException:
     * No qualifying bean of type
     * 'com.xevgnov.autowire.optional.service.AnalyticServis' available:
     * expected at least 1 bean which qualifies as autowire candidate.
     * Uncomment to see the failure.
     */

    @Bean
    CommandLineRunner commandLineRunner(RestaurantService restaurantService,
                                        AnalyticServis analyticServis) {
        restaurantService.makeOrder(Order.builder()
                .clientEmail("john.doe@gmail.com")
                .deliveryAddress("Wroclaw, Plac Konstytucji 3 Maja")
                .dishes(List.of("Pizza", "Chips", "Gyros"))
                .paymentId(UUID.randomUUID()).build());
        if (analyticServis != null) {
            analyticServis.doAnalytics();
        }
        return args -> log.info("Done!");
    }

}
