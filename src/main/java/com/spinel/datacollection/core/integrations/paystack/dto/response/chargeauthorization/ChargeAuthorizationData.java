package com.spinel.datacollection.core.integrations.paystack.dto.response.chargeauthorization;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ChargeAuthorizationData {
    private Long id;
    private BigDecimal amount;
    private String currency;
    private String transaction_date;
    private String status;
    private String reference;
    private String domain;
    private String metadata;
    private String gateway_response;
    private String message;
    private String channel;
    private String ip_address;
    private String log;
    private BigDecimal fees;
    private ChargeAuthorizationAuthorization authorization;
    private ChargeAuthorizationCustomer customer;
    private String plan;
}
