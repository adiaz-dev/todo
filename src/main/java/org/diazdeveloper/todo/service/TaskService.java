package org.diazdeveloper.todo.service;

import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;

public interface TaskService {

  Iterable<Task> findAll();
  Iterable<Task> findByStatus(TaskStatus status);

}
