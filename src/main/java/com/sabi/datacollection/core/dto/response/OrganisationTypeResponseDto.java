package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrganisationTypeResponseDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
