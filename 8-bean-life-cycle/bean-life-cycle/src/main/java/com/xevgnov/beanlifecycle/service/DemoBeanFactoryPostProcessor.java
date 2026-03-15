package com.xevgnov.beanlifecycle.service;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    var beanDefinitionNames = Arrays.asList(beanFactory.getBeanDefinitionNames());
    log.info("BeanFactoryPostProcessor has got: {}", beanDefinitionNames);

    Optional<BeanDefinition> demoServiceDefinitionOpt = Optional.ofNullable(
        beanFactory.getBeanDefinition("demoService"));
    demoServiceDefinitionOpt.ifPresent(
        ds -> log.info("BeanFactoryPostProcessor: DemoService bean definition has scope: {}", ds.getScope()));

    Optional<BeanDefinition> innerDemoServiceDefinitionOpt = Optional.ofNullable(
        beanFactory.getBeanDefinition("innerDemoService"));
    innerDemoServiceDefinitionOpt
        .ifPresent(ids -> log.info("BeanFactoryPostProcessor: InnerDemoService bean definition has scope: {}",
            ids.getScope()));
  }

}