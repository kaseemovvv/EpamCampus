package com.epam.learning.controller;

import com.epam.learning.dto.UserReqDto;
import com.epam.learning.dto.UserResDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/user")
@Tag(name = "User Endpoints")
public interface UserController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create User")
    ResponseEntity<UserResDto> createUser(@RequestBody UserReqDto taskResDto);

    @PutMapping("/{id}")
    @Operation(summary = "Update User")
    ResponseEntity<UserResDto> updateUser(@PathVariable Integer id, @RequestBody UserReqDto taskResDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete User by id")
    ResponseEntity<String> deleteUser(@PathVariable Integer id);

    @GetMapping("/{id}")
    @Operation(summary = "Get User by id")
    ResponseEntity<UserResDto> getUser(@PathVariable Integer id);

    @GetMapping
    @Operation(summary = "Get list of all Users")
    ResponseEntity<List<UserResDto>> getAllUser();
}
