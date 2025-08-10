package com.todolist.todolist_webflux.infrastructure.services.task;

import com.todolist.todolist_webflux.domain.models.task.Task;
import com.todolist.todolist_webflux.domain.ports.task.out.ITaskRepository;
import com.todolist.todolist_webflux.domain.services.task.ITaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService implements ITaskService {
    private final ITaskRepository taskRepository;

    public TaskService(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<Task> getTaskById(String id) {
        return taskRepository.findById(id);
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
}
