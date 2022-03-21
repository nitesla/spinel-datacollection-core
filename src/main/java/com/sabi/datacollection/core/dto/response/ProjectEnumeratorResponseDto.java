package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ProjectEnumeratorResponseDto {
    private Long id;
    private Long projectId;
    private Long enumeratorId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
