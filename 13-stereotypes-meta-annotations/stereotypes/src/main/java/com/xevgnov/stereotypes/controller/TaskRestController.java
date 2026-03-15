package com.xevgnov.stereotypes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xevgnov.stereotypes.domain.Task;
import com.xevgnov.stereotypes.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskRestController {

    private TaskService taskService;

    public TaskRestController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAll();
    }

}
