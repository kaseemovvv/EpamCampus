package com.epam.learning.service;

import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import com.epam.learning.dto.TaskReqDto;
import com.epam.learning.dto.TaskResDto;

import java.util.List;

public interface TaskService {
    TaskResDto createTask(TaskReqDto board);

    TaskResDto updateTask(Integer id, TaskReqDto board);

    String deleteTask(Integer id);

    TaskResDto getTask(Integer id);

    List<TaskResDto> getAllTasks(Integer userId);
}
