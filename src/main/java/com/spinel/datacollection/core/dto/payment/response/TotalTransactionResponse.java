package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class TotalTransactionResponse {
    private int totalTransaction;
    private BigDecimal totalVolume;
    private BigDecimal pendingTransfers;
}
