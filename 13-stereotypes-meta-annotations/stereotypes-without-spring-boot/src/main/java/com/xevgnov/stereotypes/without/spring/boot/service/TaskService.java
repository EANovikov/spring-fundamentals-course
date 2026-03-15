package com.xevgnov.stereotypes.without.spring.boot.service;

import java.util.Collection;
import java.util.Optional;

import com.xevgnov.stereotypes.without.spring.boot.domain.Task;

public interface TaskService {

    Task add(Task task);

    Optional<Task> get(long id);

    Collection<Task> getAll();

}
