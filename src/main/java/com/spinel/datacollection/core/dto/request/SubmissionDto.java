package com.spinel.datacollection.core.dto.request;


import com.spinel.datacollection.core.enums.SubmissionStatus;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class SubmissionDto {

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


}
