package com.epam.learning.controller;

import com.epam.learning.dto.TaskReqDto;
import com.epam.learning.dto.TaskResDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/task")
@Tag(name = "Task Apis")
public interface TaskController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create Task")
    ResponseEntity<TaskResDto> createTask(@RequestBody TaskReqDto taskResDto);

    @PutMapping("/{id}")
    @Operation(summary = "Update Task")
    ResponseEntity<TaskResDto> updateTask(@PathVariable Integer id, @RequestBody TaskReqDto taskResDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete Task by id")
    ResponseEntity<String> deleteTask(@PathVariable Integer id);

    @GetMapping("/{id}")
    @Operation(summary = "Get Task by id")
    ResponseEntity<TaskResDto> getTask(@PathVariable Integer id);

    @GetMapping("/{boardId}")
    @Operation(summary = "Get list of all Tasks")
    ResponseEntity<List<TaskResDto>> getAllTask(@PathVariable Integer boardId);
}
