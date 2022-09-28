package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackResponse {
    private boolean status;
    private String message;
    private Object data;
}
