package com.epam.learning.service;

import com.epam.learning.dto.TaskResDto;

import java.util.List;

public interface TaskService {

    String createTask(TaskResDto taskResDto);

    TaskResDto updateTask(Integer id, TaskResDto taskResDto);

    String deleteTask(Integer id);

    TaskResDto getTask(Integer id);

    List<TaskResDto> getAllTask();
}
