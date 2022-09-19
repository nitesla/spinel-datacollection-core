package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class VerifyTransactionResponse {
    private String paymentProviderId;
    private String customerID;
    private String status;
    private String reference;
    private BigDecimal amount;
    private LocalDateTime createdAt;
    private LocalDateTime transactionDate;
    private String email;
    private String message;
}
