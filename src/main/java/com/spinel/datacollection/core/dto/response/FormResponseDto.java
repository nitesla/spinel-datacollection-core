package com.spinel.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormResponseDto {

    private Long id;

    private String name;
    private boolean isActive;
    private String version;
    private String description;
    private String formField;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Long userId;
    private Boolean isPublic;


}
