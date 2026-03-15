package com.xevgnov.stereotypes.without.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
// Comment to @ComponentScan to see NoSuchBeanDefinitionException 
// because no TaskService and TaskPrinter beans where added int the context
// org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.xevgnov.stereotypes.without.spring.boot.service.TaskService' available
@ComponentScan("com.xevgnov.stereotypes.without.spring")
public class ApplicationConfiguration {

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }

}
