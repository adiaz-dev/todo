package org.diazdeveloper.todo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.diazdeveloper.todo.model.TaskDTO;
import org.diazdeveloper.todo.service.TaskService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TodoRestController {

  private final TaskService taskService;
  public static final String TODO_ROOT_PATH = "/api/v1/tasks";

  @GetMapping(TODO_ROOT_PATH + "/check")
  public String healthCheck() {
    return "Up and running";
  }


  @GetMapping(TODO_ROOT_PATH )
  public Page<TaskDTO> getAllTasks( @RequestParam(required = false) Integer pageNumber,
      @RequestParam(required = false) Integer pageSize) {
    return taskService.findAll(pageNumber, pageSize);
  }

}
