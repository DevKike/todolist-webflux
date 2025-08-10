package com.todolist.todolist_webflux.domain.services.task;

import com.todolist.todolist_webflux.domain.models.task.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    List<Task> getTasks();

    Optional<Task> getTaskById(String id);

    Task saveTask(Task task);
}
