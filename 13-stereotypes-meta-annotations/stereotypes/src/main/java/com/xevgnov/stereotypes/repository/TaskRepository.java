package com.xevgnov.stereotypes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xevgnov.stereotypes.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByOrderByPriorityDesc();
}
