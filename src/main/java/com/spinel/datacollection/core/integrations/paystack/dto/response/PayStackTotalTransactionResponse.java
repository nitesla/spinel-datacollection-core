package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackTotalTransactionResponse {
    private String status;
    private String message;
    private PayStackTotalTransactionDataResponse data;
}
