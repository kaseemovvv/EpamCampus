package com.epam.learning.controller.impl;

import com.epam.learning.controller.TaskController;
import com.epam.learning.dto.TaskReqDto;
import com.epam.learning.dto.TaskResDto;
import com.epam.learning.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskControllerImpl implements TaskController {
    private final TaskService service;

    @Override
    public ResponseEntity<TaskResDto> createTask(TaskReqDto taskResDto) {

        return new ResponseEntity<>(service.createTask(taskResDto), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<TaskResDto> updateTask(Integer id, TaskReqDto taskResDto) {
        return new ResponseEntity<>(service.updateTask(id, taskResDto), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<String> deleteTask(Integer id) {
        return new ResponseEntity<>(service.deleteTask(id), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<TaskResDto> getTask(Integer id) {
        return new ResponseEntity<>(service.getTask(id), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<List<TaskResDto>> getAllTask(Integer boardId) {
        return new ResponseEntity<>(service.getAllTasks(boardId), HttpStatus.OK);

    }
}
