package com.spinel.datacollection.core.dto.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PricingConfigurationResponseDto {
    private Long id;
    private BigDecimal price;
    private Long dataSetId;
    private String dataSet;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
