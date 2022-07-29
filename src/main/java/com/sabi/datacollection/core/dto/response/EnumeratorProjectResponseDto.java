package com.sabi.datacollection.core.dto.response;

import com.sabi.datacollection.core.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EnumeratorProjectResponseDto {
    private Long id;
    private Long projectId;
    private Long enumeratorId;
    private LocalDateTime assignedDate;
    private LocalDateTime completedDate;
    private Status status;
    private Boolean isLocationBound;
    private String timeLine;
    private long submission;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
