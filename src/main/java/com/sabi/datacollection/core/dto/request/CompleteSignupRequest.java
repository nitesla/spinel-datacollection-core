package com.sabi.datacollection.core.dto.request;


import com.sabi.datacollection.core.enums.VerificationStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CompleteSignupRequest {
    private Long id;
    private String referralCode;
    private String cac;
    private String pictureUrl;
    private Long lgaId;
    private Long countryId;
    private String corporateName;
    private String address;
    private Boolean isCorp;
    private Long organisationTypeId;
    private String refereeCode;
    private String phone;
    private String email;
    private String gender;
    private String linkedIn;
    private String twitter;
    private String facebook;
    private String instagram;
    private String verificationStatus;
    private LocalDateTime registrationDate = LocalDateTime.now();
    private String registrationToken;
    private String registrationTokenExpiration;
    private VerificationStatus verification;
}
