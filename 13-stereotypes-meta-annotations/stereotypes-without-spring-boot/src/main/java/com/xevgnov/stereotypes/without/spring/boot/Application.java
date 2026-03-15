package com.xevgnov.stereotypes.without.spring.boot;

import com.xevgnov.stereotypes.without.spring.boot.config.ApplicationConfiguration;
import com.xevgnov.stereotypes.without.spring.boot.domain.Task;
import com.xevgnov.stereotypes.without.spring.boot.service.TaskService;
import com.xevgnov.stereotypes.without.spring.boot.utility.TaskPrinter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Application {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();
        TaskService taskService = context.getBean(TaskService.class);
        Task firstTask = new Task(1, "first task", 1);
        Task secondTask = new Task(2, "second task", 2);
        taskService.add(firstTask);
        taskService.add(secondTask);
        log.info("The tasks: " + taskService.getAll());
        TaskPrinter taskPrinter = context.getBean(TaskPrinter.class);
        log.info("Printing the first task in JSON format: ");
        taskPrinter.printAsJson(taskService.get(1).orElseThrow());
    }

}
