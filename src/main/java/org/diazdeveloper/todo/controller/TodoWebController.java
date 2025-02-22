package org.diazdeveloper.todo.controller;

import org.diazdeveloper.todo.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoWebController {
  private TaskService taskService;

  public TodoWebController(TaskService taskService) {
    this.taskService = taskService;
  }

  @RequestMapping("/tasks")
  public String getAllTasks(Model model) {
    model.addAttribute("tasks", taskService.findAll());
    return "tasks";
  }

}
