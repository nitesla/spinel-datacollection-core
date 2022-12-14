package com.spinel.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.spinel.datacollection.core.enums.SubmissionStatus;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubmissionResponseDto {

    private Long id;

    private Long projectId;
    private Long formId;
    private SubmissionStatus status;
    private Long enumeratorId;
    private Boolean isActive;
    private LocalDateTime submissionDate;
    private Long commentId;
    private String additionalInfo;
    private String gprsLocation;
    private Long deviceId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;

    private String commentName;

}
