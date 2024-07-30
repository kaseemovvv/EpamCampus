package com.epam.learning.service;

import com.epam.learning.dto.TaskResDto;
import com.epam.learning.entity.BoardEntity;

import java.util.List;

public interface BoardService {
    String createBoard(BoardEntity board);

    TaskResDto updateBoard(Integer id, BoardEntity board);

    String deleteBoard(Integer id);

    TaskResDto getBoard(Integer id);

    List<BoardEntity> getAllBoards();
}
