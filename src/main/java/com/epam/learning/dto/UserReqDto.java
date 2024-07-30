package com.epam.learning.dto;

import com.epam.learning.enums.Role;
import lombok.Getter;

@Getter

public class UserReqDto {
    private String fullName;
    private String phoneNumber;
    private String password;
    private Role role;
}
