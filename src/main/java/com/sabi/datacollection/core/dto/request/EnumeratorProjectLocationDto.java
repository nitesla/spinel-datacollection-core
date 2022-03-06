package com.sabi.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EnumeratorProjectLocationDto {
    private Long id;
    private Long enumeratorProjectId;
    private Long projectLocationId;
    private Integer collectedRecord;
    private Integer expectedRecord;
}
