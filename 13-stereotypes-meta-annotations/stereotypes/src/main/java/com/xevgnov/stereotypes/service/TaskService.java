package com.xevgnov.stereotypes.service;

import java.util.List;
import java.util.Optional;

import com.xevgnov.stereotypes.domain.Task;

public interface TaskService {

    Task add(Task task);

    Optional<Task> get(long id);

    List<Task> getAll();

}
