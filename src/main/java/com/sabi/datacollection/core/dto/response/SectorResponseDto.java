package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SectorResponseDto {
    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
