package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ChargeAuthorizationResponse {
    private boolean status;
    private String message;
    private BigDecimal amount;
    private String transactionDate;
    private String reference;
    private String gatewayResponse;
    private String authorizationCode;
    private String bank;
}
