package com.sabi.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataPermissionResponseDto {

    private Long id;
    private String name;
    private String permissionType;
    private String appPermission;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;


}
