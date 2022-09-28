package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResolveAccountNumberResponse {
    private boolean status;
    private String message;
    private String accountNumber;
    private String accountName;
    private String bankId;
}
