package org.diazdeveloper.todo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class TodoRestController {

  public static final String TODO_ROOT_PATH = "/api/v1/tasks";

  @GetMapping(TODO_ROOT_PATH + "/check")
  public String healthCheck() {
    return "Up and running";
  }
}
