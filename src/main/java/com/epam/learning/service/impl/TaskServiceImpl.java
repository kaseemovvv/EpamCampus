package com.epam.learning.service.impl;

import com.epam.learning.dto.TaskReqDto;
import com.epam.learning.dto.TaskResDto;
import com.epam.learning.entity.TaskEntity;
import com.epam.learning.exeption.NotFoundException;
import com.epam.learning.mapper.TaskMapper;
import com.epam.learning.repository.BoardRepository;
import com.epam.learning.repository.TaskRepository;
import com.epam.learning.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final BoardRepository boardRepository;
    private final TaskRepository repository;
    private final TaskMapper mapper;

    @Override
    public TaskResDto createTask(TaskReqDto taskReqDto) {
        boardRepository.findById(taskReqDto.getBoardId())
                .orElseThrow(() -> new NotFoundException("Board not found by id :" + taskReqDto.getBoardId()));
        TaskEntity taskEntity = mapper.dtoToEntity(taskReqDto);
        return mapper.entityToDto(repository.save(taskEntity));
    }

    @Override
    public TaskResDto updateTask(Integer id, TaskReqDto board) {
        TaskEntity taskEntity = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Task with this id does not exist"));
        if (board.getTitle() != null) {
            taskEntity.setTitle(board.getTitle());
        }
        if (board.getOrderNumber() != null) {
            taskEntity.setOrderNumber(board.getOrderNumber());
        }
        if (board.getContent() != null) {
            taskEntity.setContent(board.getContent());
        }
        if (board.getStatus() != null) {
            taskEntity.setStatus(board.getStatus());
        }
        if (board.getPriority() != null) {
            taskEntity.setPriority(board.getPriority());
        }
        if (board.getDueDate() != null) {
            taskEntity.setDueDate(board.getDueDate());
        }
        if (board.getOrderNumber() != null) {
            taskEntity.setOrderNumber(board.getOrderNumber());
        }
        if (board.getBoardId() != null) {
            taskEntity.setBoardId(board.getBoardId());
        }
        return mapper.entityToDto(repository.save(taskEntity));
    }

    @Override
    public String deleteTask(Integer id) {
        repository.findById(id).orElseThrow(() -> new NotFoundException("Task with this id does not exist"));
        repository.deleteById(id);
        return String.valueOf(id);
    }

    @Override
    public TaskResDto getTask(Integer id) {
        TaskEntity boardEntity = repository.findById(id).orElseThrow(() -> new NotFoundException("Task with this id does not exist"));
        return mapper.entityToDto(boardEntity);
    }

    @Override
    public List<TaskResDto> getAllTasks(Integer userId) {
        boardRepository.findById(userId).orElseThrow(() -> new NotFoundException("Board not found by " + userId));
        return repository.findAllByBoardId(userId)
                .stream()
                .map(mapper::entityToDto)
                .toList();
    }
}
