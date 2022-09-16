package com.spinel.datacollection.core.integrations.paystack.dto.request;

import lombok.Data;

import java.math.BigInteger;

@Data
public class InitializeTransaction {
    private BigInteger amount;
    private String email;
    private String reference;
    private String currency;
}
