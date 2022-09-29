package com.spinel.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LGAResponseDto {


    private Long id;
    private String name;

    private long stateId;

    private String stateName;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
