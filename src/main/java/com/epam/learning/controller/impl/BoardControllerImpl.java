package com.epam.learning.controller.impl;

import com.epam.learning.controller.BoardController;
import com.epam.learning.dto.BoardResDto;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BoardControllerImpl implements BoardController {
    @Override
    public ResponseEntity<String> createBoard(BoardResDto taskResDto) {
        return null;
    }

    @Override
    public ResponseEntity<BoardResDto> updateBoard(Integer id, BoardResDto taskResDto) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteBoard(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<BoardResDto> getBoard(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<BoardResDto>> getAllBoard() {
        return null;
    }
}
