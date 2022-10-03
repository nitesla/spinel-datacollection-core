package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GetRequestDto {
    private List<FilterCriteria> filterCriteria;
    private String sortDirection;
    private String sortParameter;
    private GroupBy groupBy;
    private Integer topCount;
    private BigDecimal topPercentage;
    @NotNull(message = "isPaginated is required")
    private boolean isPaginated;
    @NotNull(message = "isFilter is required")
    private boolean isFiltered;
    private Integer page;
    private Integer pageSize;
    private List<FilterDate> filterDate;
}
