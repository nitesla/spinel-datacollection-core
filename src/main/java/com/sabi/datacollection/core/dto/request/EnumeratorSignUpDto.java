package com.sabi.datacollection.core.dto.request;


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
    private Long organisationTypeId;
}
