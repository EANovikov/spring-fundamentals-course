package com.xevgnov.scopes.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.service.RandomDateService;

@RestController
@RequestMapping(path = "/v1/singleton")
public class SingletonController extends AbstractController {

    public SingletonController(@Qualifier("singletonRandomDateService") RandomDateService randomDateService) {
        super(randomDateService);
    }

}
