package org.diazdeveloper.todo.controller;

import org.diazdeveloper.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoWebController {

  private final TaskService taskService;

  @Autowired
  public TodoWebController(@Qualifier("taskServiceImpl") TaskService taskService) {
    this.taskService = taskService;
  }

  @RequestMapping("/tasks")
  public String getAllTasks(Model model) {
    model.addAttribute("tasks", taskService.findAll(0,0));
    return "tasks";
  }

}
