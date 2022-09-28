package com.spinel.datacollection.core.integrations.paystack.dto.response.singletransfer;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SingeTransferResponseData {
    private String reference;
    private String integration;
    private String domain;
    private BigDecimal amount;
    private String currency;
    private String source;
    private String reason;
    private Long recipient;
    private Long request;
    private String status;
    private String transfer_code;
    private Long id;
    private String createdAt;
    private String updatedAt;
}
