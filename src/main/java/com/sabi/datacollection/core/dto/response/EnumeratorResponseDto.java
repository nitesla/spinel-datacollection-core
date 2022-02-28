package com.sabi.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnumeratorResponseDto {

    private Long id;
    private String referralCode;
    private Integer rating;
    private String cac;
    private String pictureUrl;
    private Long lgaId;
    private String address;
    private boolean isCorp;
    private Long organisationTypeId;
    private String refereeCode;
    private String corporateName;
    private String phone;
    private String email;
    private LocalDateTime registrationDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;


}
