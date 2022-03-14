package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectIndicatorResponseDto {
    private Long id;
    private Long projectId;
    private Long indicatorId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
