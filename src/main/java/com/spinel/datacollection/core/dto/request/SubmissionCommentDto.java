package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SubmissionCommentDto {
    private Long id;
    private Long submissionId;
    private Long commentId;
    private String additionalInfo;
}
