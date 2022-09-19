package com.spinel.datacollection.core.models;

import lombok.Data;

@Data
public class PaymentProvider {
    private String name;
    private String url;
    private String clientId;
    private String clientSecretKey;
    private String clientPrivateKey;
    private String clientPublicKey;
    private String initiateURL;
    private String verifyURL;
}
