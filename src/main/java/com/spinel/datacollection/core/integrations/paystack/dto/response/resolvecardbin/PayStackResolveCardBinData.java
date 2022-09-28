package com.spinel.datacollection.core.integrations.paystack.dto.response.resolvecardbin;

import lombok.Data;

@Data
public class PayStackResolveCardBinData {
    private String bin;
    private String brand;
    private String sub_brand;
    private String country_code;
    private String country_name;
    private String card_type;
    private String bank;
    private String linked_bank_id;
}
