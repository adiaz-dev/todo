package org.diazdeveloper.todo.service;

import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;
import org.diazdeveloper.todo.model.TaskDTO;
import org.springframework.data.domain.Page;

public interface TaskService {

  Page<TaskDTO> findAll(Integer pageNumber, Integer pageSize);
  Iterable<Task> findByStatus(TaskStatus status);

}
