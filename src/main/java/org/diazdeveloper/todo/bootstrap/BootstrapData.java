package org.diazdeveloper.todo.bootstrap;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;
import org.diazdeveloper.todo.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * When a component implements CommandLineRunner, Spring automatically calls it every time
 * the application starts
 * */
@Slf4j
@Component
public class BootstrapData implements CommandLineRunner {

  private final TaskRepository taskRepository;

  public BootstrapData(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Task task1 = Task.builder().name("Work on claim logic").assignee("Augusto").priority(5).status(
        TaskStatus.IN_PROGRESS).createdAt(LocalDateTime.now()).build();

    Task task2 = Task.builder().name("Respond to all flagged emails").assignee("Augusto").priority(5).status(
        TaskStatus.DEFINED).createdAt(LocalDateTime.now()).build();

    Task task3 = Task.builder().name("Create RC3").assignee("Ever").priority(5).status(
        TaskStatus.IN_PROGRESS).createdAt(LocalDateTime.now()).build();

    taskRepository.save(task1);
    taskRepository.save(task2);
    taskRepository.save(task3);

    log.info("BootstrapData executed successfully");
    log.info("Tasks count: {}", taskRepository.count());
  }

}
