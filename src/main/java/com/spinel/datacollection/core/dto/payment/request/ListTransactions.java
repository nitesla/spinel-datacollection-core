package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

@Data
public class ListTransactions {
    private int perPage;
    private int page;
    private String from;
    private String to;
    private String status;
    private String customer;

    public ListTransactions(int perPage, int page, String from, String to, String status, String customer) {
        this.perPage = perPage;
        this.page = page;
        this.from = from;
        this.to = to;
        this.status = status;
        this.customer = customer;
    }
}
