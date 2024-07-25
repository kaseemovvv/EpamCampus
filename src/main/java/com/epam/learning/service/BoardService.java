package com.epam.learning.service;

import com.epam.learning.dto.TaskDto;
import com.epam.learning.entity.BoardEntity;

import java.util.List;

public interface BoardService {
    String createBoard(BoardEntity board);

    TaskDto updateBoard(Integer id, BoardEntity board);

    String deleteBoard(Integer id);

    TaskDto getBoard(Integer id);

    List<BoardEntity> getAllBoards();
}
