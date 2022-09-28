package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidateCustomerResponse {
    private boolean status;
    private String message;
}
