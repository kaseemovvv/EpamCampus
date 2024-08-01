package com.epam.learning.controller;

import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/board")
@Tag( name = "Board Apis")
public interface BoardController {
    @PostMapping("/{userId}")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create Board")
    ResponseEntity<BoardResDto> createBoard(@RequestBody BoardReqDto taskResDto, @PathVariable Integer userId);

    @PutMapping("/{id}")
    @Operation(summary = "Update Board")
    ResponseEntity<BoardResDto> updateBoard(@PathVariable Integer id, @RequestBody BoardReqDto taskResDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete Board by id")
    ResponseEntity<String> deleteBoard(@PathVariable Integer id);

    @GetMapping("/{id}")
    @Operation(summary = "Get Board by id")
    ResponseEntity<String> getBoard(@PathVariable Integer id);

    @GetMapping("/{userId}")
    @Operation(summary = "Get list of all Boards")
    ResponseEntity<List<BoardResDto>> getAllBoard(@PathVariable Integer userId);
}
