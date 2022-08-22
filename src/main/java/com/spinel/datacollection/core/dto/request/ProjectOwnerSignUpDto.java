package com.spinel.datacollection.core.dto.request;

import lombok.Data;

@Data
public class ProjectOwnerSignUpDto {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Boolean isCorp;
    private String corporateName;
    private Long sectorId;
    private String accountManager;
}
