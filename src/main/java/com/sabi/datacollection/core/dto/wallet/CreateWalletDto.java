package com.sabi.datacollection.core.dto.wallet;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreateWalletDto {
    private Long id;
    private BigDecimal availableBalance;
    private Long userId;
    private BigDecimal ledgerBalance;
    private String status;
    private String identificationNumber;
    private String checkSumValue;
    private Long lastTransactionId;
}
