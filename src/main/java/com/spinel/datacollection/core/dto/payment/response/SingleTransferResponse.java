package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class SingleTransferResponse {
    private String message;
    private String reference;
    private String domain;
    private String currency;
    private BigDecimal amount;
    private String source;
    private String description;
    private String status;
    private String transferCode;
    private Long id;
    private Long integration;
    private Long request;
    private Long recipient;
    private String createdAt;
    private String updatedAt;

}
