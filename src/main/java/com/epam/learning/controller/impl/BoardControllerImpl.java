package com.epam.learning.controller.impl;

import com.epam.learning.controller.BoardController;
import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import com.epam.learning.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BoardControllerImpl implements BoardController {
    private final BoardService boardService;

    public BoardControllerImpl(BoardService boardService) {
        this.boardService = boardService;
    }


    @Override
    public ResponseEntity<BoardResDto> createBoard(BoardReqDto taskResDto, Integer userId) {
        return new ResponseEntity<>(boardService.createBoard(taskResDto, userId), HttpStatus.OK);
    }


    @Override
    public ResponseEntity<BoardResDto> updateBoard(Integer id, BoardReqDto taskResDto) {
        return new ResponseEntity<>(boardService.updateBoard(id, taskResDto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteBoard(Integer id) {
        return new ResponseEntity<>(boardService.deleteBoard(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getBoard(Integer id) {
        return new ResponseEntity<>(boardService.deleteBoard(id), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<List<BoardResDto>> getAllBoard(Integer userId) {
        return new ResponseEntity<>(boardService.getAllBoards(userId), HttpStatus.OK);

    }
}