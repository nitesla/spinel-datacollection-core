package com.spinel.datacollection.core.dto.response;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IndicatorDictionaryResponseDto {
    private Long id;
    private String name;
    private String additionalInfo;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
