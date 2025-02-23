package org.diazdeveloper.todo.service.impl;

import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;
import org.diazdeveloper.todo.model.TaskDTO;
import org.diazdeveloper.todo.service.TaskService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class FakeTaskServiceImpl implements TaskService {

  @Override
  public Page<TaskDTO> findAll(Integer pageNumber, Integer pageSize) {
    return null;
  }

  @Override
  public Iterable<Task> findByStatus(TaskStatus status) {
    return null;
  }
}
