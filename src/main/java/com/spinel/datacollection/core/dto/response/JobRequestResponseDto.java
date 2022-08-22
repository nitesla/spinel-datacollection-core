package com.sabi.datacollection.core.dto.response;

import com.sabi.datacollection.core.enums.GeneralStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JobRequestResponseDto {
    private Long id;
    private Long projectId;
    private Long userId;
    private GeneralStatus status;
    private LocalDateTime requestedDate;
    private LocalDateTime responseDate;
    private String comments;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
