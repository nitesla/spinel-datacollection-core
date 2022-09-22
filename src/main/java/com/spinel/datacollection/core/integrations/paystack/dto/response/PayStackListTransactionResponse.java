package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class PayStackListTransactionResponse {
    private String status;
    private String message;
    private List<PayStackVerifyTransactionDataResponse> data;
}
