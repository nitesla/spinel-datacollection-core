package com.sabi.datacollection.core.dto.request;


import com.sabi.datacollection.core.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class SubmissionDto {

    private Long id;
    private Long projectId;
    private Long formId;
    private Status status;
    private Long enumeratorId;
    private Boolean isActive;
    private LocalDateTime submissionDate;
    private Long commentId;
    private String additionalInfo;
    private String gprsLocation;
    private Long deviceId;


}
