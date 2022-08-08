package com.spinel.datacollection.core.dto.request;


import lombok.Data;


@Data
public class EnumeratorDto {

    private Long id;
    private String referralCode;
    private Integer rating;
    private String cac;
    private String pictureUrl;
    private Long lgaId;
    private Long projectRoleId;
    private String address;
    private Boolean isCorp;
    private Long organisationTypeId;
    private String refereeCode;
    private String corporateName;
    private String phone;
    private String email;
    private String registrationToken;
    private String registrationTokenExpiration;
    private String firstName;
    private String lastName;


}
