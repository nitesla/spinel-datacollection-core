package com.spinel.datacollection.core.dto.payment.response;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TransactionResponse {
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
