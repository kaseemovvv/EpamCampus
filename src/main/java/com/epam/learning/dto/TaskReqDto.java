package com.epam.learning.dto;

import com.epam.learning.enums.Priority;
import com.epam.learning.enums.Status;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TaskReqDto {
    private String title;
    private String content;
    private Status status;
    private Priority priority;
    private LocalDateTime dueDate;
    private Integer orderNumber;
    private Integer boardId;

}
