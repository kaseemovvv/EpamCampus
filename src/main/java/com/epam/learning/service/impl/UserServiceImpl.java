package com.epam.learning.service.impl;

import com.epam.learning.dto.UserReqDto;
import com.epam.learning.dto.UserResDto;
import com.epam.learning.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserResDto createUser(UserReqDto board, Integer userId) {
        return null;
    }

    @Override
    public UserResDto updateUser(Integer id, UserReqDto board) {
        return null;
    }

    @Override
    public String deleteUser(Integer id) {
        return "";
    }

    @Override
    public UserResDto getUser(Integer id) {
        return null;
    }

    @Override
    public List<UserResDto> getAllUsers(Integer userId) {
        return List.of();
    }
}
