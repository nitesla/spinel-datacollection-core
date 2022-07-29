package com.sabi.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.datacollection.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteSignUpResponse {

    private Long enumeratorId;
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

}
