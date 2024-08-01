package com.epam.learning.service;

import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import com.epam.learning.dto.UserReqDto;
import com.epam.learning.dto.UserResDto;

import java.util.List;

public interface UserService {
    UserResDto createUser(UserReqDto board);

    UserResDto updateUser(Integer id, UserReqDto board);

    String deleteUser(Integer id);

    UserResDto getUser(Integer id);

    List<UserResDto> getAllUsers();
}
