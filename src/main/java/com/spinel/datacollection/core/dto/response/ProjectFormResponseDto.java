package com.spinel.datacollection.core.dto.response;

import com.spinel.datacollection.core.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class ProjectFormResponseDto {
    private Long id;
    private Long projectId;
    private Long formId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private Status status;
}
