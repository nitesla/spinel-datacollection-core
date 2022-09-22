package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TotalTransaction {
    private int perPage;
    private int page;
    private String from;
    private String to;

    public TotalTransaction(int perPage, int page, String from, String to) {
        this.perPage = perPage;
        this.page = page;
        this.from = from;
        this.to = to;
    }
}
