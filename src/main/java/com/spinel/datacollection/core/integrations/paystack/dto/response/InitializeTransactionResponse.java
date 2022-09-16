package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class InitializeTransactionResponse {
    private String status;
    private String message;
    private InitializeTransactionDataResponse data;
}
