package com.xevgnov.stereotypes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.xevgnov.stereotypes.domain.Task;
import com.xevgnov.stereotypes.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task add(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Optional<Task> get(long id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findByOrderByPriorityDesc();
    }

}
