package com.sabi.datacollection.core.dto.response;

import com.sabi.datacollection.core.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectResponseDto {
    private Long id;
    private String name;
    private Long projectCategoryId;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long sectorId;
    private String imageQuality;
    private Boolean isLocationBased;
    private Long projectOwnerId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
