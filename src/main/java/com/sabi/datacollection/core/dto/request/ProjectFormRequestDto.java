package com.sabi.datacollection.core.dto.request;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProjectFormRequestDto {
    private Long id;
    private Long projectId;
    private Long formId;
}
