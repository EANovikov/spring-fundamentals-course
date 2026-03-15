package com.xevgnov.stereotypes.utility;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xevgnov.stereotypes.domain.Task;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TaskPrinter {

    private final ObjectMapper objectMapper;

    // Configuration bean can be injected directly just as any other Componet
    // @Autowired
    // private ApplicationConfiguration configuration;

    public TaskPrinter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void printAsJson(Task task) {
        try {
            log.info("Task details [ {} ]", objectMapper.writeValueAsString(task));
            // log.info("Task details [ {} ]", configuration.objectMapper().writeValueAsString(task));
        } catch (JsonProcessingException e) {
            log.error("cannot convert task to JSON", e);
        }
    }

}
