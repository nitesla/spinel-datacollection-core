package com.spinel.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.spinel.datacollection.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnumeratorSignUpResponseDto {
    private Long id;
    private Long enumeratorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String corporateName;
    private String username;
    private Long projectRoleId;
    private VerificationStatus verification;
}
