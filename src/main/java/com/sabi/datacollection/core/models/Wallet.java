package com.sabi.datacollection.core.models;

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
public class Wallet{
    @Id
    @Column
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private BigDecimal availableBalance;
    private Long userId;
    private LocalDateTime dateBalanceUpdated;
    private LocalDateTime createdDate;
    private BigDecimal ledgerBalance;
    private String status;
    private String identificationNumber;
    private Boolean isActive;
    private String checkSumValue;
    private Long lastTransactionId;
}
