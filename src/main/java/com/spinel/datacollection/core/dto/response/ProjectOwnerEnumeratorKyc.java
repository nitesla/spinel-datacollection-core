package com.sabi.datacollection.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectOwnerEnumeratorKyc {

    private String firstName;
    private String lastName;
    private String pictureUrl;
    private String phone;
    private String email;
    private String gender;
    private String verificationStatus;
    private String address;
    private String idCardNumber;
    private String cardImage;

    private Long lgaId;
    private String firstname;
    private String lastname;
    private Boolean isRegistered;
    private String CAC;
    private int employeeCount;
    private String website;
    private LocalDateTime registeredDate;
    private Boolean isCorp;
    private String corporateName;
    private String accountManager;
}
