package com.spinel.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ProjectBillingResponseDto {
    private Long id;
    private Long projectId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
