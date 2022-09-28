package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChargeAuthorization {
    private String authorizationCode;
    private String email;
    private BigDecimal amount;
    private String paymentProvider;
}
