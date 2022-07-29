package com.sabi.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProjectEnumeratorRequestDto {
    private Long id;
    private Long projectId;
    private Long enumeratorId;
    private String timeLine;
    private int submission;
}
