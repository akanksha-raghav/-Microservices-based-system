// TaskService.java
package com.example.taskservice.service;

import com.example.taskservice.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    Task getTaskById(Long taskId);
    Task createTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Long taskId);
    List<Task> getTasksByStatus(String status);
}
