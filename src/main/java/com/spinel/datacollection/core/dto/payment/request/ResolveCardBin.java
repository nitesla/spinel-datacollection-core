package com.spinel.datacollection.core.dto.payment.request;

import lombok.Data;

@Data
public class ResolveCardBin {
    String pinDigits;
    String paymentProvider;
}
