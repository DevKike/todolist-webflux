package com.todolist.todolist_webflux.domain.ports.task.out;

import com.todolist.todolist_webflux.domain.models.task.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskRepository {
    List<Task> findAll();

    Optional<Task> findById(String id);

    Task save(Task task);
}
