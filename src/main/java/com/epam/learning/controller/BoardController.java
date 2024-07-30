package com.epam.learning.controller;

import com.epam.learning.dto.BoardResDto;
import com.epam.learning.dto.TaskResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/board")
@Api(tags = "Board Endpoints")
public interface BoardController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create Board")
    ResponseEntity<String> createBoard(@RequestBody BoardResDto taskResDto);

    @PutMapping("/{id}")
    @ApiOperation("Update Board")
    ResponseEntity<BoardResDto> updateBoard(@PathVariable Integer id, @RequestBody BoardResDto taskResDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete Board by id")
    @ApiImplicitParam(name = "id", value = "BoardEntity id", paramType = "path", required = true)
    ResponseEntity<String> deleteBoard(@PathVariable Integer id);

    @GetMapping("/{id}")
    @ApiOperation("Get Board by id")
    @ApiImplicitParam(name = "id", value = "BoardEntity id", paramType = "path", required = true)
    ResponseEntity<BoardResDto> getBoard(@PathVariable Integer id);

    @GetMapping
    @ApiOperation("Get list of all Boards")
    ResponseEntity<List<BoardResDto>> getAllBoard();
}
