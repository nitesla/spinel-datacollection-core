package com.spinel.datacollection.core.dto.request.auth;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FundWalletRequest {
    private String email;
    private BigDecimal amount;
}
