package com.xevgnov.beanlifecycle.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("BeanPostProcessor postProcessBeforeInitialization has got: {} : {}", bean.getClass(), beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("BeanPostProcessor postProcessAfterInitialization has got: {} : {}", bean.getClass(), beanName);
        return bean;
    }

}
