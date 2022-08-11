package com.spinel.datacollection.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProjectOwnerSignUpResponseDto {
    private Long id;
    private Long projectOwnerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String corporateName;
    private String username;
    private Long userBankId;
    private String accountManager;
}
