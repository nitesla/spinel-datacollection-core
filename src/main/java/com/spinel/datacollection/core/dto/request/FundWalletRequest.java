package com.spinel.datacollection.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundWalletRequest {
    private String email;
    private BigDecimal amount;
}
