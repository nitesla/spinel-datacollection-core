package com.sabi.datacollection.core.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableDisableDto {
    private Long id;
    private Boolean isActive;
}
