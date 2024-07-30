package com.epam.learning.service.impl;

import com.epam.learning.dto.TaskResDto;
import com.epam.learning.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    @Override
    public String createTask(TaskResDto taskResDto) {
        return "";
    }

    @Override
    public TaskResDto updateTask(Integer id, TaskResDto taskResDto) {
        return null;

    }

    @Override
    public String deleteTask(Integer id) {
        return "";

    }

    @Override
    public TaskResDto getTask(Integer id) {
        return null;
    }

    @Override
    public List<TaskResDto> getAllTask() {
        return null;
    }
}
