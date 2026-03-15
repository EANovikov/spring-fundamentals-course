package com.xevgnov.prototype.controller;

import com.xevgnov.prototype.service.RandomDateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//This controller is singleton by default, but we can explicitly set it to be singleton
//@Scope(BeanDefinition.SCOPE_SINGLETON)
@RestController
@RequestMapping(path = "/singleton")
public class SingletonController {

    private RandomDateService randomDateService;

    public SingletonController(RandomDateService randomDateService) {
        this.randomDateService = randomDateService;
    }

    @GetMapping
    public String getDate() {
        System.out.println(randomDateService.hashCode());
        return randomDateService.getDate();
    }

}
