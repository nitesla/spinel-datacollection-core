package com.spinel.datacollection.core.integrations.paystack.dto.response.chargeauthorization;

import lombok.Data;

@Data
public class PayStackChargeAuthorizationResponse {
    private boolean status;
    private String message;
    private ChargeAuthorizationData data;
}
