package com.xevgnov.scopes.external;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

import com.xevgnov.scopes.controller.AbstractController;
import com.xevgnov.scopes.service.RandomDateService;

// to see the difference between application and singleton
// /v2/application vs /v1/application
// /v2/singleton vs /v1/singleton
@ApplicationScope
@RestController
@RequestMapping(path = "/application")
public class ApplicationControllerV2 extends AbstractController {

    public ApplicationControllerV2(@Qualifier("applicationRandomDateService") RandomDateService randomDateService) {
        super(randomDateService);
    }

}
