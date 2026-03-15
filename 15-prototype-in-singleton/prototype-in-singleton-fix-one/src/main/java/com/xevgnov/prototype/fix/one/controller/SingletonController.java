package com.xevgnov.prototype.fix.one.controller;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.prototype.fix.one.service.RandomDateService;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@RestController
@RequestMapping(path = "/singleton")
public class SingletonController {

    private final ApplicationContext applicationContext;

    public SingletonController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @GetMapping
    public String getDate() {
        return applicationContext
                 .getBean(RandomDateService.class)
                 .getDate();
    }

}