package com.spinel.datacollection.core.dto.payment.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class CreateSubscription {
    private String name;
    private String interval;
    private BigDecimal amount;
    private String email;
    private String paymentProvider;
}
