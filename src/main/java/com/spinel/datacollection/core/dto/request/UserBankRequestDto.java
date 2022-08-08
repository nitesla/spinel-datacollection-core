package com.spinel.datacollection.core.dto.request;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserBankRequestDto {
    private Long id;
    private Long bankId;
    private Long userId;
    private String accountNumber;
}
