package com.epam.learning.dto;

import com.epam.learning.enums.Priority;
import com.epam.learning.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskResDto {
    private Integer id;
    private String title;
    private String content;
    private Status status;
    private Priority priority;
    private LocalDateTime createDate;
    private LocalDateTime dueDate;
    private Integer orderNumber;
    private Integer boardId;

}
