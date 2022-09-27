package com.spinel.datacollection.core.integrations.paystack.dto.response.singletransfer;

import lombok.Data;

@Data
public class PayStackSingleTransferResponse {
    private boolean status;
    private String message;
    private SingeTransferResponseData data;
}
