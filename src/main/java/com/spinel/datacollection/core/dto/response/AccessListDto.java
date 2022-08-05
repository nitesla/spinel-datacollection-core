package com.spinel.datacollection.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessListDto {
    private String name;
    private String appPermission;
}
