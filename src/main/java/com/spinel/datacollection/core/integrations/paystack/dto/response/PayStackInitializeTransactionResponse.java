package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackInitializeTransactionResponse {
    private String status;
    private String message;
    private PayStackInitializeTransactionDataResponse data;
}
