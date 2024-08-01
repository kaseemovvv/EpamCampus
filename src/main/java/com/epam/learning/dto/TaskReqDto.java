package com.epam.learning.dto;

import com.epam.learning.enums.Priority;
import com.epam.learning.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
public class TaskReqDto {
    @Schema(description = "Insert name for a user board task", example = "Cheese", required = true)
    @NotBlank(message = "Board task name may not be empty")
    private String title;
    @Schema(description = "think of the description for task", example = "need to be done this week", required = true)
    private String content;
    @NotNull
    private Status status;
    @NotNull
    private Priority priority;
    @NotNull
    private LocalDateTime dueDate;
    @NotNull
    private Integer orderNumber;
    @NotNull
    private Integer boardId;

}
