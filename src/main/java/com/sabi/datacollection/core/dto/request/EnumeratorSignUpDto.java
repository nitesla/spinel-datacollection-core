package com.sabi.datacollection.core.dto.request;


import com.sabi.datacollection.core.enums.VerificationStatus;
import lombok.Data;


@Data
public class EnumeratorSignUpDto {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Boolean isCorp;
    private String corporateName;
//    private VerificationStatus verification;
    private Long organisationTypeId;
    private Long projectRoleId;
}
