package com.xevgnov.prototype.fix.three.controller;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Lookup;
import com.xevgnov.prototype.fix.three.service.RandomDateService;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@RestController
@RequestMapping(path = "/singleton")
public class SingletonController {

    @GetMapping
    public String getDate() {
        return getRandomDateService().getDate();
    }

    @Lookup
    public RandomDateService getRandomDateService(){
       return null;
    }

}
