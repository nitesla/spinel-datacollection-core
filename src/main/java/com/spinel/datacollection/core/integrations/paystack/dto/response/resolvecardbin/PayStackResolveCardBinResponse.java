package com.spinel.datacollection.core.integrations.paystack.dto.response.resolvecardbin;

import lombok.Data;

@Data
public class PayStackResolveCardBinResponse {
    private boolean status;
    private String message;
    private PayStackResolveCardBinData data;
}
