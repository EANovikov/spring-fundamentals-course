package com.xevgnov.scopes.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.service.RandomDateService;

@RestController
@RequestMapping(path = "/v1/custom")
public class CustomScopeController extends AbstractController {

    public CustomScopeController(@Qualifier("customRandomDateService") RandomDateService randomDateService) {
        super(randomDateService);
    }

}
