package com.spinel.datacollection.core.dto.payment.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InitializeTransactionResponse {
    private String accessCode;
    private String reference;
    private String url;
    private String message;
    private String status;
    private BigDecimal amount;
}
