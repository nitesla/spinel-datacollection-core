package com.spinel.datacollection.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectOwnerEnumeratorResponseDto {
    private Long id;
    private Long projectOwnerId;
    private Long enumeratorId;
    private LocalDateTime dateJoined;
    private String status;
}
