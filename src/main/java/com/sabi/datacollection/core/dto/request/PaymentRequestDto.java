package com.sabi.datacollection.core.dto.request;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentRequestDto {
    @NotBlank()
    private String redirectURL;
    @NotBlank()
    private Long transactionId;
    @NotBlank()
    private String paymentReference;
    @NotBlank()
    private String reference;
    @NotBlank()
    private String Status;
    @NotBlank()
    private int paymentMethod;
    @NotBlank()
    private String responseCode;
    @NotBlank()
    private String responseDescription;
    @NotBlank()
    private String email;
    @NotBlank()
    private String paymentMethodDescription;
    @NotBlank()
    private LocalDateTime transactionDate;
    @NotBlank()
    private BigDecimal amountVerified;
    @NotBlank()
    private BigDecimal amount;
}
