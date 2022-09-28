package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GetRequestDto {
    private List<FilterCriteria> filterCriteria;
    private String sortDirection;
    private String sortBy;
    private String groupBy;
    private Integer listCount;
    private Integer topCount;
    private BigDecimal topPercentage;
    private Integer page;
    private Integer pageSize;
    private List<FilterDate> filterDate;
}
