package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EnumeratorProjectLocResponseDto {
    private Long id;
    private Long enumeratorProjectId;
    private Long projectLocationId;
    private Integer collectedRecord;
    private Integer expectedRecord;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
