package com.epam.learning.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class BoardReqDto {
    @Schema(description = "Unique name for a user board", example = "Boom", required = true)
    @NotBlank(message = "Board Name may not be empty")
    private String title;

    @Schema(description = "Unique order number for a user board", example = "1", required = true)
    @NotNull(message = "Order number cannot be null")
    @Min(value = 1)
    private Integer orderNumber;
}
