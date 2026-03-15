package com.xevgnov.stereotypes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

import com.xevgnov.stereotypes.annotaton.InfoRestController;

@InfoRestController
public class InfoController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.application.version}")
    private String buildVersion;

    @GetMapping
    public String getAppInfo() {
        return String.format("Application name: %s\nBuild Version: %s", 
        applicationName, buildVersion);
    }

}
