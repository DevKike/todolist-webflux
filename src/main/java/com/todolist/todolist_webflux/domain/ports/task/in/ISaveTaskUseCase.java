package com.todolist.todolist_webflux.domain.ports.task.in;

import com.todolist.todolist_webflux.domain.models.task.Task;

public interface ISaveTaskUseCase {
    Task saveTask(Task task);
}
