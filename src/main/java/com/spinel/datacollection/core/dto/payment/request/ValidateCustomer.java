package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

@Data
public class ValidateCustomer {
    private String country;
    private String type;
    private String accountNumber;
    private String bvn;
    private String bankCode;
    private String firstName;
    private String lastName;
    private String paymentProvider;
    private String customerCode;
}
