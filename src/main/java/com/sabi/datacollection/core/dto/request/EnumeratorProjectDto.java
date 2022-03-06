package com.sabi.datacollection.core.dto.request;

import com.sabi.datacollection.core.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EnumeratorProjectDto {
    private Long id;
    private Long projectId;
    private Long enumeratorId;
    private LocalDateTime assignedDate;
    private LocalDateTime completedDate;
    private Status status;
    private Boolean isLocationBound;
}
