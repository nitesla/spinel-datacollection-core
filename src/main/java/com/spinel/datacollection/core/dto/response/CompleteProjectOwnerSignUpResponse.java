package com.spinel.datacollection.core.dto.response;

import com.spinel.datacollection.core.enums.VerificationStatus;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class CompleteProjectOwnerSignUpResponse {
    private Long projectOwnerId;
    private String corporateName;
    private String address;
    private String phone;
    private String email;
    private LocalDateTime registrationDate;
    private long userId;
    private String userEmail;
    private String firstName;
    private String lastName;
    private String userPhone;
    private String userName;
    private VerificationStatus verification;
    private String idCard;
    private String idNumber;
}
