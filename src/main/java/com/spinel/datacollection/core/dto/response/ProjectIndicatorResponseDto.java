package com.spinel.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectIndicatorResponseDto {
    private Long id;
    private Long projectId;
    private Long indicatorId;
    private String project;
    private String indicator;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
