package org.diazdeveloper.todo.repository;

import java.util.UUID;
import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.domain.TaskStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, UUID> {

  Page<Task> findAllByName(String taskName, Pageable pageable);

  Page<Task> findAllByStatus(TaskStatus taskStatus, Pageable pageable);


}
