package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

@Data
public class VerifyTransaction {
    private String reference;
    private Boolean isFundWallet;
}
