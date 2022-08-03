package com.sabi.datacollection.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnumeratorKYCResponseDto {

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
}
