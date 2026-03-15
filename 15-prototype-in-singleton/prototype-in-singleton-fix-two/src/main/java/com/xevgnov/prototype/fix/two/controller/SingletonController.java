package com.xevgnov.prototype.fix.two.controller;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.prototype.fix.two.service.RandomDateService;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@RestController
@RequestMapping(path = "/singleton")
public class SingletonController {

    private RandomDateService randomDateService;

    public SingletonController(RandomDateService randomDateService) {
        this.randomDateService = randomDateService;
    }

    @GetMapping
    public String getDate() {
        return randomDateService.getDate();
    }


}
