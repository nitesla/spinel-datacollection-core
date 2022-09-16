package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackResponse {
    private String status;
    private String message;
    private Object data;
}
