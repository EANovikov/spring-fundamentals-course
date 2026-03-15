package com.xevgnov.scopes.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.service.RandomDateService;

@RestController
public abstract class AbstractController {

    protected RandomDateService randomDateService;

    public AbstractController(RandomDateService randomDateService) {
        this.randomDateService = randomDateService;
    }

    @GetMapping
    public String getDate() {
        return String.format("%s has date [%s]",
                this.getClass().getSimpleName(), randomDateService.getDate());
    }

}
