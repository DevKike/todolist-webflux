package com.todolist.todolist_webflux.application.task.usecases;

import com.todolist.todolist_webflux.domain.models.task.Task;
import com.todolist.todolist_webflux.domain.ports.task.in.IGetAllTasksUseCase;
import com.todolist.todolist_webflux.domain.services.task.ITaskService;

import java.util.List;

public class GetAllTasksUseCase implements IGetAllTasksUseCase {
    private final ITaskService taskService;

    public GetAllTasksUseCase(ITaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public List<Task> getAllTasks() {
        return this.taskService.getTasks();
    }
}
