package org.diazdeveloper.todo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.diazdeveloper.todo.domain.TaskStatus;

@Builder
@Data
public class TaskDTO {
  private UUID id;
  private Integer version;

  @NotBlank
  @NotNull
  private String name;
  private String description;

  @NotNull
  private TaskStatus status;
  private String assignee;

  @NotNull
  private Integer priority;//scale from 1 to 10

  private LocalDateTime dueDate;

}
