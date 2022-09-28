package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class CreateSubscriptionResponse {
    private String accessCode;
    private String reference;
    private String url;
    private String message;
    private boolean status;
    private BigDecimal amount;
}
