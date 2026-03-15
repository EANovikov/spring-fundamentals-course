package com.xevgnov.beanlifecycle.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class InnerDemoService {

    public InnerDemoService() {
        log.info("InnerDemoService: call constructor");
    }

    public void demo() {
        log.info("InnerDemoService: Bean usage phase");
    }
}
