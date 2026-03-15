package com.xevgnov.scopes.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.scopes.service.RandomDateService;
import com.xevgnov.scopes.util.ControllerUtils;

@RestController
@RequestMapping(path = "/v1/prototype")
public class PrototypeController extends AbstractController {

    public PrototypeController(@Qualifier("prototypeRandomDateService") RandomDateService randomDateService) {
        super(randomDateService);
    }

    // To see the difference between prototype and request scopes
    // @GetMapping
    // public String getDate() {
    // String firstDate = randomDateService.getDate();
    // ControllerUtils.sleep(1);
    // String secondDate = randomDateService.getDate();
    // return String.format("%s instance %d has dates: [%s] & [%s]",
    // this.getClass().getSimpleName(), this.getClass().hashCode(), firstDate,
    // secondDate);
    // }
}
