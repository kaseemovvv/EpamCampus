package com.epam.learning.controller.impl;

import com.epam.learning.controller.UserController;
import com.epam.learning.dto.UserResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    @Override
    public ResponseEntity<String> createUser(UserResDto taskResDto) {
        return null;
    }

    @Override
    public ResponseEntity<UserResDto> updateUser(Integer id, UserResDto taskResDto) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteUser(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<UserResDto> getUser(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<UserResDto>> getAllUser() {
        return null;
    }
}
