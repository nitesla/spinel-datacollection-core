package com.spinel.datacollection.core.integrations.paystack.dto.response;

import lombok.Data;

@Data
public class PayStackResolveAccountNumberData {
    private String account_number;
    private String account_name;
    private int bank_id;
}
