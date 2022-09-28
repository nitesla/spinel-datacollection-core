package com.spinel.datacollection.core.integrations.paystack.dto.response.transferrecipient;

import lombok.Data;

@Data
public class TransferRecipientDetails {
    private String authorization_code;
    private String account_number;
    private String account_name;
    private String bank_code;
    private String bank_name;
}
