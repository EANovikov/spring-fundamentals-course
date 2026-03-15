package com.xevgnov.stereotypes.without.spring.boot.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.xevgnov.stereotypes.without.spring.boot.domain.Task;

@Service
public class TaskServiceImpl implements TaskService {

    private Map<Long, Task> tasks = new HashMap<>();

    @Override
    public Task add(Task task) {
        return tasks.put(task.id(), task);
    }

    @Override
    public Optional<Task> get(long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    @Override
    public Collection<Task> getAll() {
        return tasks.values();
    }

}
