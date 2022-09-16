package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class InitializeTransactionDataResponse {
    private String authorization_url;
    private String access_code;
    private String reference;
}
