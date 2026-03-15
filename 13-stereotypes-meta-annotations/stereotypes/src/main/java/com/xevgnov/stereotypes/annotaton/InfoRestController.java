package com.xevgnov.stereotypes.annotaton;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Custom meta-annotation
 * to get info endpoint for free, use spring-boot-starter-actuator
 * This is just for demo to show the usage of existing Stereotype annotations & meta-annotations
 */
@RestController
@RequestMapping(path = "/api/info", produces = MediaType.TEXT_PLAIN_VALUE)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoRestController {

}
