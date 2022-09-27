package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SingleTransfer {
    private String type;
    private String accountNumber;
    private String bankCode;
    private String currency;
    private String source;
    private String description;
    private BigDecimal amount;
    private String paymentProvider;
}
