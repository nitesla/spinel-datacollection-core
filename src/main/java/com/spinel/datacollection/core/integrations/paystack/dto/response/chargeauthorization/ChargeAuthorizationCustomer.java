package com.spinel.datacollection.core.integrations.paystack.dto.response.chargeauthorization;

import lombok.Data;

@Data
public class ChargeAuthorizationCustomer {
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String customer_code;
    private String phone;
    private String metadata;
    private String risk_action;
}
