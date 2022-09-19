package com.spinel.datacollection.core.integrations.paystack.dto;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String customer_code;
    private String phone;
}
