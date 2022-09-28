package com.spinel.datacollection.core.integrations.paystack.dto.response.chargeauthorization;

import lombok.Data;

@Data
public class ChargeAuthorizationAuthorization {
    private String authorization_code;
    private String bin;
    private String last4;
    private String exp_month;
    private String exp_year;
    private String channel;
    private String card_type;
    private String bank;
    private String country_code;
    private String brand;
    private boolean reusable;
    private String signature;
    private String account_name;
}
