package com.todolist.todolist_webflux.domain.ports.task.in;

import com.todolist.todolist_webflux.domain.models.task.Task;

import java.util.Optional;

public interface IGetTaskByIdUseCase {
    Optional<Task> getTaskById(String id);
}
