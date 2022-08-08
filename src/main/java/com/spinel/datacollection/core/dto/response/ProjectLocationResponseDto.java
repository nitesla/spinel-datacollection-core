package com.spinel.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProjectLocationResponseDto {
    private Long id;
    private Long locationId;
    private String name;
    private String locationType;
    private Long projectId;
    private int collectedRecords;
    private int expectedRecords;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
