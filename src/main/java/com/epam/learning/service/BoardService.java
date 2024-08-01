package com.epam.learning.service;

import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import com.epam.learning.dto.TaskResDto;
import com.epam.learning.entity.BoardEntity;

import java.util.List;


public interface BoardService {
    BoardResDto createBoard(BoardReqDto board, Integer userId);

    BoardResDto updateBoard(Integer id, BoardReqDto board);

    String deleteBoard(Integer id);

    BoardResDto getBoard(Integer id);

    List<BoardResDto> getAllBoards(Integer userId);
}
