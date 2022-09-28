package com.spinel.datacollection.core.integrations.paystack.dto.response.subscription;

import lombok.Data;

@Data
public class PayStackCreateSubscriptionPlanResponse {
    private boolean status;
    private String message;
    private PayStackCreateSubscriptionPlanData data;
}
