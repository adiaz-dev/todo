package org.diazdeveloper.todo.mapper;

import org.diazdeveloper.todo.domain.Task;
import org.diazdeveloper.todo.model.TaskDTO;
import org.mapstruct.Mapper;

@Mapper
public interface TaskMapper {

  Task taskDtoToTask(TaskDTO taskDTO);

  TaskDTO taskToTaskDto(Task task);
}
