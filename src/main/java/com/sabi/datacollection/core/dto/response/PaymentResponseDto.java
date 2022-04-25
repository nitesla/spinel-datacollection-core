package com.sabi.datacollection.core.dto.response;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PaymentResponseDto {
    private Long id;
    private String redirectURL;
    private Long transactionId;
    private String paymentReference;
    private String reference;
    private String Status;
    private int paymentMethod;
    private String responseCode;
    private String responseDescription;
    private String email;
    private String paymentMethodDescription;
    private LocalDateTime transactionDate;
    private BigDecimal amountVerified;
    private BigDecimal amount;
}
