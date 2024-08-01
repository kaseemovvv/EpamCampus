package com.epam.learning.dto;

import com.epam.learning.enums.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter

public class UserReqDto {
    @Schema(description = "User's first and last name", example = "Ravshanbek Kosimov", required = true)
    @NotBlank(message = "User's name may not be empty")
    private String fullName;
    @Schema(description = "User's phone number with country code(\"+\" should also be included)", example = "+998949949048", required = true)
    @NotBlank(message = "Phone number should not be empty")
    @Size(min = 13, max = 13)
    private String phoneNumber;
    @Schema(description = "Create a unique and strong password with at least one capital letter", example = "Wosew1515", required = true)
    @NotBlank(message = "It is crucial to create a strong password")
    @Size(min = 8, max = 12)
    private String password;
    @NotNull(message = "You should choose your role")
    private Role role;
}
