package com.sabi.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PricingConfigurationDto {
    private Long id;
    private BigDecimal price;
    private Long dataSetId;
}
