package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectOwnerUserResponseDto {
    private Long id;
    private Long userId;
    private Long projectOwnerId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
