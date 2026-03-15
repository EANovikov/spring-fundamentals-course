package com.xevgnov.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xevgnov.beanlifecycle.service.DemoService;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);
		context.registerShutdownHook();
		DemoService demoService = context.getBean(DemoService.class);
        demoService.demo();
	} 

}
