package com.sabi.datacollection.core.dto.request;

import com.sabi.datacollection.core.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
}
