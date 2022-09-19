package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackInitializeTransactionDataResponse {
    private String authorization_url;
    private String access_code;
    private String reference;
}
