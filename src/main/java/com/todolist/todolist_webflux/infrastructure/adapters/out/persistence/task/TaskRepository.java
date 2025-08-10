package com.todolist.todolist_webflux.infrastructure.adapters.out.persistence.task;

import com.todolist.todolist_webflux.domain.models.task.Task;
import com.todolist.todolist_webflux.domain.ports.task.out.ITaskRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TaskRepository implements ITaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public TaskRepository() {
        tasks.add(new Task("1", "Buy coffee", "Buy coffee for me", false));
        tasks.add(new Task("2", "Do exercise", "Run 5 kilometers", true));
        tasks.add(new Task("3", "Read a book", "Finish it", false));
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Optional<Task> findById(String id) {
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst();
    }

    @Override
    public Task save(Task task) {
        tasks.add(task);
        return task;
    }
}
