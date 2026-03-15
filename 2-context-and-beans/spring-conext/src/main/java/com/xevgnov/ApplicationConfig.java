package com.xevgnov;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration is optional if no beans are created there
//@Configuration
@ComponentScan("com.xevgnov.service")
public class ApplicationConfig {

}
