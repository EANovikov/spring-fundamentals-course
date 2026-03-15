package com.xevgnov.scopes.external;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.controller.AbstractController;
import com.xevgnov.scopes.service.RandomDateService;

//to see the difference between application and singleton
// /v2/application vs /v1/application
// /v2/singleton vs /v1/singleton
@Scope(BeanDefinition.SCOPE_SINGLETON)
@RestController
@RequestMapping(path = "/singleton")
public class SingletonControllerV2 extends AbstractController {

    public SingletonControllerV2(@Qualifier("singletonRandomDateService") RandomDateService randomDateService) {
        super(randomDateService);
    }

}
