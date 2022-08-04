package com.sabi.datacollection.core.dto.request;

import com.sabi.datacollection.core.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProjectFormRequestDto {
    private Long id;
    private Long projectId;
    private Long formId;
    private Status status;
}
