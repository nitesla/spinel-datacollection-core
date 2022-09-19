package com.spinel.datacollection.core.integrations.paystack.dto.response;

import com.spinel.datacollection.core.integrations.paystack.dto.Customer;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayStackVerifyTransactionDataResponse {
    private String id;
    private String domain;
    private String status;
    private String reference;
    private BigDecimal amount;
    private String createdAt;
    private String gateway_response;
    private Customer customer;
}
