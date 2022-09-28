package com.spinel.datacollection.core.integrations.paystack.dto.response.transferrecipient;

import lombok.Data;

@Data
public class PaystackTransferRecipientResponse {
    private boolean status;
    private String message;
    private TransferRecipientData data;
}
