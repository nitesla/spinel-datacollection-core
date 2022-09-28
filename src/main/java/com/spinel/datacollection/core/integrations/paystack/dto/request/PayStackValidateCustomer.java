package com.spinel.datacollection.core.integrations.paystack.dto.request;

import lombok.Data;

@Data
public class PayStackValidateCustomer {
    private String country;
    private String type;
    private String account_number;
    private String bvn;
    private String bank_code;
    private String first_name;
    private String last_name;
}
