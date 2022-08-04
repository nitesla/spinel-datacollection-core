package com.sabi.datacollection.core.dto.response;

import com.sabi.datacollection.core.enums.VerificationStatus;
import lombok.Data;

import javax.persistence.Transient;
import java.time.LocalDateTime;


@Data
public class ProjectEnumeratorResponseDto {
    private Long id;
    private Long projectId;
    private Long enumeratorId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String location;
    private String description;
    private String projectCount;
    private String email;
    private String role;
    private String rating;
    private String efficiency;
    private String picture;
    private String timeLine;
    private String submission;
    private VerificationStatus verification;
}
