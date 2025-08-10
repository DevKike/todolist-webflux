package com.todolist.todolist_webflux.domain.models.task;

public class Task {
    private final String id;
    private String title;
    private String description;
    private Boolean isDone;

    public Task(String id, String title, String description, Boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isDone = isDone;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsDone() {
        return isDone;
    }

    public void setTitle() {
        this.title = title;
    }

    public void setDescription() {
        this.description = description;
    }

    public void setIsDone() {
        this.isDone = isDone;
    }
}
