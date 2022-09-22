package com.spinel.datacollection.core.dto.payment.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TotalTransactionResponse {
    private int totalTransaction;
    private BigDecimal totalVolume;
}
