package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectOwnerDto {
    private Long id;
    private Long organisationTypeId;
    private Long userId;
    private Long lgaId;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    private Boolean isRegistered;
    private String CAC;
    private int employeeCount;
    private String email;
    private String website;
    private LocalDateTime registeredDate;
    private String registrationToken;
    private LocalDateTime registrationTokenExpiration;
    private Boolean isCorp;
    private String corporateName;
}
