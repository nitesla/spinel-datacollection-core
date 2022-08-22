package com.spinel.datacollection.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectOwnerResponseDto {
    private Long id;
    private Long sectorId;
    private Long userId;
    private Long lgaId;
    private Long stateId;
    private Long countryId;
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
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private boolean userIsActive;
    private int projectCount;
    private String accountManager;

}
