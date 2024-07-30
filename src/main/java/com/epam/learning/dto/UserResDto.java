package com.epam.learning.dto;

import com.epam.learning.enums.Role;
import lombok.Setter;

@Setter

public class UserResDto {
    private Integer id;
    private String fullName;
    private String phoneNumber;
    private Role role;
}
