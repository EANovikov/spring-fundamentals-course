package com.xevgnov.scopes.custom;

import java.time.Duration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CacheBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private long durationSec;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope(CacheScope.CACHE_SCOPE, new CacheScope(Duration.ofSeconds(durationSec)));
    }

}
