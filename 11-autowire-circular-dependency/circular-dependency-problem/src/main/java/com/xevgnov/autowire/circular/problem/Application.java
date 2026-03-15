package com.xevgnov.autowire.circular.problem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAsync
@SpringBootApplication
public class Application {

    /* Application fails on start. Sample ouptut:
	 * org.springframework.beans.factory.UnsatisfiedDependencyException: 
	 * Error creating bean with name 'orderController' defined in file 
	 * [C:\Users\ENovikov\Projects\spring-questions-training\6-autowire-circular-dependency\circular-dependency-problem\target\classes\com\xevgnov\autowire\circular\problem\controller\OrderController.class]: 
	 * Unsatisfied dependency expressed through constructor parameter 0: 
	 * Error creating bean with name 'orderServiceImpl' defined in file
	 *  [C:\Users\ENovikov\Projects\spring-questions-training\6-autowire-circular-dependency\circular-dependency-problem\target\classes\com\xevgnov\autowire\circular\problem\service\OrderServiceImpl.class]: 
	 * Unsatisfied dependency expressed through constructor parameter 1: 
	 * Error creating bean with name 'deliveryServiceImpl' defined in file [C:\Users\ENovikov\Projects\spring-questions-training\6-autowire-circular-dependency\circular-dependency-problem\target\classes\com\xevgnov\autowire\circular\problem\service\DeliveryServiceImpl.class]: 
	 * Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'orderServiceImpl': 
	 * Requested bean is currently in creation: Is there an unresolvable circular reference?
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
