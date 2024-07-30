package com.epam.learning.controller.impl;

import com.epam.learning.controller.TaskController;
import com.epam.learning.dto.TaskResDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskControllerImpl implements TaskController {

    @Override
    public ResponseEntity<String> createTask(TaskResDto taskResDto) {
        return null;
    }

    @Override
    public ResponseEntity<TaskResDto> updateTask(Integer id, TaskResDto taskResDto) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteTask(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<TaskResDto> getTask(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<TaskResDto>> getAllTask() {
        return null;
    }
}
