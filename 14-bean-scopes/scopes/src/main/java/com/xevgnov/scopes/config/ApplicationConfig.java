package com.xevgnov.scopes.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.xevgnov.scopes.custom.CacheBeanFactoryPostProcessor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ComponentScan(value = "com.xevgnov.scopes", excludeFilters = {
    @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.xevgnov.scopes.external.*")
})
@Configuration
public class ApplicationConfig {

  @Bean
  public static BeanFactoryPostProcessor beanFactoryPostProcessor(
      @Value("${scope.cache.duration.seconds:10}") long durationInSec) {
    log.info("Custom scope cach duration is {} seconds", durationInSec);
    return new CacheBeanFactoryPostProcessor(durationInSec);
  }

}
