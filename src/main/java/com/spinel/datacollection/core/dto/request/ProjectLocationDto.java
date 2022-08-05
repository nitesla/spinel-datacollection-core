package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectLocationDto {
    private Long id;
    private Long locationId;
    private String name;
    private String locationType;
    private Long projectId;
    private int collectedRecords;
    private int expectedRecords;
}
