package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;


@Data
public class PayStackFetchTransactionResponse {
    private String status;
    private String message;
    private PayStackVerifyTransactionDataResponse data;
}
