package com.xevgnov.scopes.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.service.RandomDateService;

@RestController
@RequestMapping(path = "/v1/session")
public class SessionController extends AbstractController  {

    public SessionController(@Qualifier("sessionRandomDateService") RandomDateService randomDateService) {
       super(randomDateService);
    }

}
