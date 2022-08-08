package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
public class IndicatorDictionaryDto {
    private Long id;
    private String name;
    private String additionalInfo;
}
