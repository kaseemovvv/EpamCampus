package com.epam.learning.dto;

import com.epam.learning.enums.Priority;
import com.epam.learning.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import javax.validation.constraints.Min;
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
    @Schema(description = "")
    @NotNull()
    private Status status;
    @Schema(description = "Each task has it's order of priority", example = "high priority", required = true)
    @NotNull()
    private Priority priority;
    @Schema(description = "Write when you want to finish exact one task", example = "01.10.2024")
    @NotNull()
    private LocalDateTime dueDate;
    @Schema(description = "Enter in which place is your task located", example = "12", required = true)
    @Min(1)
    @NotNull()
    private Integer orderNumber;
    @Schema(description = "Id of your board", example = "1", required = true)
    @NotNull()
    private Integer boardId;

}
