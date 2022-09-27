package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackResolveAccountNumberResponse {
    private boolean status;
    private String message;
    private PayStackResolveAccountNumberData data;
}

