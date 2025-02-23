package org.diazdeveloper.todo.service.impl;

import lombok.RequiredArgsConstructor;
import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;
import org.diazdeveloper.todo.mapper.TaskMapper;
import org.diazdeveloper.todo.model.TaskDTO;
import org.diazdeveloper.todo.repository.TaskRepository;
import org.diazdeveloper.todo.service.TaskService;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Primary //without this annotation, SpringBoot will not know which bean to instance
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

  //injected beans automatically into this service
  private final TaskRepository taskRepository;
  private final TaskMapper taskMapper;

  //default settings for page request
  private static final int DEFAULT_PAGE_NUMBER = 0;
  private static final int DEFAULT_PAGE_SIZE = 25;

  public PageRequest buildPageRequest(Integer pageNumber, Integer pageSize) {
    int queryPageNumber = DEFAULT_PAGE_NUMBER;
    int queryPageSize = DEFAULT_PAGE_SIZE;

    if (pageNumber != null && pageNumber > 0 ) {
      queryPageNumber = pageNumber -1 ;
    }

    if(pageSize != null && pageSize > 0){
      if (pageSize > 1000) {
        queryPageSize = 1000;
      } else {
        queryPageSize = pageSize;
      }
    }

    Sort sort = Sort.by(Sort.Order.asc("name"));

    return PageRequest.of(queryPageNumber, queryPageSize, sort);
  }

  @Override
  public Page<TaskDTO> findAll(Integer pageNumber, Integer pageSize) {
    Page<Task> taskPage;
    //build the page request
    PageRequest pageRequest = buildPageRequest(pageNumber, pageSize);

    taskPage = taskRepository.findAll(pageRequest);

    return taskPage.map(taskMapper::taskToTaskDto);
  }

  @Override
  public Iterable<Task> findByStatus(TaskStatus status) {
    return null;
  }
}
