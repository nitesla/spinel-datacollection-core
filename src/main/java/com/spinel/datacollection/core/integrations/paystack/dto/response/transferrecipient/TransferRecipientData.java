package com.spinel.datacollection.core.integrations.paystack.dto.response.transferrecipient;

import lombok.Data;

@Data
public class TransferRecipientData {
    private boolean active;
    private String currency;
    private String domain;
    private Long id;
    private String integration;
    private String name;
    private String recipient_code;
    private String type;
    private String createdAt;
    private String updatedAt;
    private boolean is_deleted;
    private boolean isDeleted;
    private TransferRecipientDetails details;
}
