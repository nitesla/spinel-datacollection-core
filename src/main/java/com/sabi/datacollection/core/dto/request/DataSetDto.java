package com.sabi.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DataSetDto {
    private Long id;
    private String name;
    private String description;
    private Boolean isEnabled;
}
