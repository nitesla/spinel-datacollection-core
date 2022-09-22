package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayStackTotalTransactionDataResponse {
    private int total_transaction;
    private BigDecimal total_volume;
    private BigDecimal pending_transfers;
}
