package com.todolist.todolist_webflux.infrastructure.configuration.task;

import com.todolist.todolist_webflux.application.task.usecases.GetAllTasksUseCase;
import com.todolist.todolist_webflux.domain.services.task.ITaskService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskUseCaseConfig {

    @Bean
    public GetAllTasksUseCase getAllTasksUseCase(ITaskService taskService) {
        return new GetAllTasksUseCase(taskService);
    }
}
