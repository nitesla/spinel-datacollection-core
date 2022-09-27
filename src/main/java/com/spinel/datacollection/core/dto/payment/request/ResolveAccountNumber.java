package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

@Data
public class ResolveAccountNumber {
    private String accountNumber;
    private String bankCode;
    private String paymentProvider;
}
