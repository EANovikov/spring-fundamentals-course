package com.xevgnov.stereotypes.without.spring.boot.utility;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xevgnov.stereotypes.without.spring.boot.domain.Task;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TaskPrinter {

    private final ObjectMapper objectMapper;

    public TaskPrinter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void printAsJson(Task task) {
        try {
            log.info("Task details [ {} ]", objectMapper.writeValueAsString(task));
        } catch (JsonProcessingException e) {
            log.error("cannot convert task to JSON", e);
        }
    }

}
