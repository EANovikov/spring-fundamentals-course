package com.xevgnov.scopes.external;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = { "com.xevgnov.scopes.external", "com.xevgnov.scopes.service" })
@EnableWebMvc
public class ApplicationConfigV2 {

}
