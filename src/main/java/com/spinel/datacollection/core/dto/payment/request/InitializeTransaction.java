package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InitializeTransaction {
    private BigDecimal amount;
    private String email;
    private String callBackURL;
    private String paymentProvider;
    private String currency;
    private String reference;
}
