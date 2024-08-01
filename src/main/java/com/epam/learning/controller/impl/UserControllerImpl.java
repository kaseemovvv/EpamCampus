package com.epam.learning.controller.impl;

import com.epam.learning.controller.UserController;
import com.epam.learning.dto.UserReqDto;
import com.epam.learning.dto.UserResDto;
import com.epam.learning.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private final UserService service;

    @Override
    public ResponseEntity<UserResDto> createUser(UserReqDto userReqDto) {
        return new ResponseEntity<>(service.createUser(userReqDto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserResDto> updateUser(Integer id, UserReqDto userDto) {
        return new ResponseEntity<>(service.updateUser(id,userDto), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> deleteUser(Integer id) {
        return new ResponseEntity<>(service.deleteUser(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserResDto> getUser(Integer id) {
        return new ResponseEntity<>(service.getUser(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<UserResDto>> getAllUser() {
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }
}
