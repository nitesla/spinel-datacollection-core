package com.spinel.datacollection.core.dto.payment.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResolveCardBinResponse {
    private boolean status;
    private String message;
    private String bin;
    private String brand;
    private String subBrand;
    private String countryCode;
    private String countryName;
    private String cardType;
    private String bank;
    private String linkedBankId;
}
