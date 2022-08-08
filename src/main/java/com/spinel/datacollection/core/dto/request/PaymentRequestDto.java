package com.spinel.datacollection.core.dto.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PaymentRequestDto {
    @NotBlank()
    private String redirectURL;
    @NotBlank()
    private Long transactionId;
    @NotBlank()
    private String paymentReference;
    @NotBlank()
    private String status;
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
