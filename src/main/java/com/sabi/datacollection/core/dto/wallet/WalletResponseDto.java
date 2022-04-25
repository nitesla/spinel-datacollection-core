package com.sabi.datacollection.core.dto.wallet;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class WalletResponseDto {
    private Long id;
    private BigDecimal availableBalance;
    private Long userId;
    private LocalDateTime dateBalanceUpdated;
    private LocalDateTime createdDate;
    private BigDecimal ledgerBalance;
    private String status;
    private String identificationNumber;
    private Boolean isActive;
    private String checkSumValue;
    private Long lastTransactionId;
}
