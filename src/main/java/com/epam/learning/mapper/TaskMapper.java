package com.epam.learning.mapper;

import com.epam.learning.dto.TaskReqDto;
import com.epam.learning.dto.TaskResDto;
import com.epam.learning.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public TaskEntity dtoToEntity(TaskReqDto reqDto) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(reqDto.getTitle());
        taskEntity.setContent(reqDto.getContent());
        taskEntity.setPriority(reqDto.getPriority());
        taskEntity.setStatus(reqDto.getStatus());
        taskEntity.setDueDate(reqDto.getDueDate());
        taskEntity.setOrderNumber(reqDto.getOrderNumber());
        taskEntity.setBoardId(reqDto.getBoardId());
        return taskEntity;
    }

    public TaskResDto entityToDto(TaskEntity taskEntity) {
        TaskResDto resDto = new TaskResDto();
        resDto.setCreateDate(taskEntity.getCreateDate());
        resDto.setDueDate(taskEntity.getDueDate());
        resDto.setId(taskEntity.getId());
        resDto.setBoardId(taskEntity.getBoardId());
        resDto.setContent(taskEntity.getContent());
        resDto.setTitle(taskEntity.getTitle());
        resDto.setOrderNumber(taskEntity.getOrderNumber());
        resDto.setPriority(taskEntity.getPriority());
        resDto.setStatus(taskEntity.getStatus());
        return new TaskResDto();
    }

}
