package com.xevgnov.scopes.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.service.RandomDateService;

// To see the difference between Application and Singleton
// Use both ApplicationController and ApplicationControllerV2 which refer to different contexts
@RestController
@RequestMapping(path = "/v1/application")
public class ApplicationController extends AbstractController {

    public ApplicationController(@Qualifier("applicationRandomDateService") RandomDateService randomDateService) {
        super(randomDateService);
    }

}
