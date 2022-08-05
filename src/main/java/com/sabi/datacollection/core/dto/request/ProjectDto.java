package com.sabi.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectDto {
    private Long id;
    private String name;
    private Long projectCategoryId;
    private String status;
    private String startDate;
    private String endDate;
    private Long sectorId;
    private String imageQuality;
    private Boolean isLocationBased;
    private Long projectOwnerId;
    private boolean isPublic;
    private boolean isOpened;
}
