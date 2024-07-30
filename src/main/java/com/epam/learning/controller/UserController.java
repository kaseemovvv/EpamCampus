package com.epam.learning.controller;

import com.epam.learning.dto.TaskResDto;
import com.epam.learning.dto.UserResDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/user")
@Api(tags = "User Endpoints")
public interface UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("Create User")
    ResponseEntity<String> createUser(@RequestBody UserResDto taskResDto);

    @PutMapping("/{id}")
    @ApiOperation("Update User")
    ResponseEntity<UserResDto> updateUser(@PathVariable Integer id, @RequestBody UserResDto taskResDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation("Delete User by id")
    @ApiImplicitParam(name = "id", value = "UserEntity id", paramType = "path", required = true)
    ResponseEntity<String> deleteUser(@PathVariable Integer id);

    @GetMapping("/{id}")
    @ApiOperation("Get User by id")
    @ApiImplicitParam(name = "id", value = "UserEntity id", paramType = "path", required = true)
    ResponseEntity<UserResDto> getUser(@PathVariable Integer id);

    @GetMapping
    @ApiOperation("Get list of all Users")
    ResponseEntity<List<UserResDto>> getAllUser();
}
