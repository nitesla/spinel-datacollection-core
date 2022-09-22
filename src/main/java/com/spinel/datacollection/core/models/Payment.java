package com.spinel.datacollection.core.models;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class Payment {
    @Id
    @Column
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
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
    private String thirdPartyCode;
    private String paymentProvider;
    private String paymentProviderId;
    private Long userId;


}
