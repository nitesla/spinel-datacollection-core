package com.sabi.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectOwnerEnumeratorDto {
    private Long id;
    private Long projectOwnerId;
    private Long enumeratorId;
    private LocalDateTime dateJoined;
    private String status;
}
