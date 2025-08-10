package com.todolist.todolist_webflux.infrastructure.adapters.in.web.task;

import com.todolist.todolist_webflux.domain.models.task.Task;
import com.todolist.todolist_webflux.domain.ports.task.in.IGetAllTasksUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TaskController {
    private final IGetAllTasksUseCase getAllTasksUseCase;

    public TaskController(IGetAllTasksUseCase getAllTasksUseCase) {
        this.getAllTasksUseCase = getAllTasksUseCase;
    }

    @GetMapping("/tasks")
    public Flux<Task> getAllTasks() {
        return Flux.fromIterable(getAllTasksUseCase.getAllTasks());
    }
}
