package com.spinel.datacollection.core.dto.response;


import com.spinel.datacollection.core.enums.VerificationStatus;
import lombok.Data;

import java.time.LocalDateTime;


@Data
public class EnumeratorResponseDto {

    private Long id;
    private String referralCode;
    private Integer rating;
    private String cac;
    private String pictureUrl;
    private Long lgaId;
    private Long userBankId;
    private Long projectRoleId;
    private String address;
    private boolean isCorp;
    private Long organisationTypeId;
    private String refereeCode;
    private String corporateName;
    private String phone;
    private String email;
    private String linkedIn;
    private String twitter;
    private String facebook;
    private String instagram;
    private String country;
    private String gender;
    private String efficiency;
    private String projectRole;
    private LocalDateTime registrationDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private VerificationStatus verification;
    private Boolean isActive;
    private String firstName;
    private String lastName;
    private String verificationStatus;

    private String organisationType;


}
