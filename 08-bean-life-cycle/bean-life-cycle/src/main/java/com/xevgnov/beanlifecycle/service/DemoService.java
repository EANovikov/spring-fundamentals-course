package com.xevgnov.beanlifecycle.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoService implements InitializingBean, DisposableBean {

    private final InnerDemoService innerDemoService;

    public DemoService(InnerDemoService innerDemoService) {
        log.info("DemoService: call constructor");
        this.innerDemoService = innerDemoService;
    }

    public void demo() {
        innerDemoService.demo();
        log.info("DemoService: Bean usage phase");
    }

    @PostConstruct
    public void setUp() {
        log.info("DemoService: call PostConstruct annotated method");
    }

    @PreDestroy
    public void tearDown() {
        log.info("DemoService: call PreDestroy annotated method");
    }

    public void initBean() {
        log.info("DemoService: call init method");
    }

    public void destroyBean() {
        log.info("DemoService: call destroy method");
    }

    @Override
    public void afterPropertiesSet() {
        log.info("DemoService: call InitializingBean.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        log.info("DemoService: call DisposableBean.destroy");
    }

}