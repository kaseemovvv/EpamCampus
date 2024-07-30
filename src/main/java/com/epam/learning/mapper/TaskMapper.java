package com.epam.learning.mapper;

import com.epam.learning.dto.TaskResDto;
import com.epam.learning.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskEntity dtoToEntity(TaskResDto taskResDto) {
        TaskEntity taskEntity = new TaskEntity();
        dtoToEntity(taskResDto, taskEntity);
        return taskEntity;
    }

    public TaskEntity dtoToEntity(TaskResDto taskResDto, TaskEntity taskEntity) {
        return new TaskEntity();
    }

    public TaskResDto entityToDto(TaskEntity taskEntity) {
        return new TaskResDto();
    }

}
