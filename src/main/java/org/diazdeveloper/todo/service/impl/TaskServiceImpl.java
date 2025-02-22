package org.diazdeveloper.todo.service.impl;

import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;
import org.diazdeveloper.todo.repository.TaskRepository;
import org.diazdeveloper.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

  private final TaskRepository taskRepository;

  public TaskServiceImpl(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public Iterable<Task> findAll() {
    return taskRepository.findAll();
  }

  @Override
  public Iterable<Task> findByStatus(TaskStatus status) {
    return null;
  }
}
