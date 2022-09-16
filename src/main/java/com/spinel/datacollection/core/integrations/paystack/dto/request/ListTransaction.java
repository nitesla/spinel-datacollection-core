package com.spinel.datacollection.core.integrations.paystack.dto.request;

import lombok.Data;

@Data
public class ListTransaction {
    private int perPage;
    private int page;
    private String from;
    private String to;
    private String status;
    private Integer customer;
}
