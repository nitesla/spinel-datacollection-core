package com.spinel.datacollection.core.integrations.paystack.dto.response.subscription;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayStackCreateSubscriptionPlanData {
    private String name;
    private String interval;
    private BigDecimal amount;
    private Long integration;
    private String domain;
    private String currency;
    private String plan_code;
    private int invoice_limit;
    private boolean send_invoices;
    private boolean send_sms;
    private boolean hosted_page;
    private boolean migrate;
    private boolean is_archived;
    private Long id;
    private String createdAt;
    private String updatedAt;
}
