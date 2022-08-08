package com.sabi.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.datacollection.core.enums.ActionType;
import com.sabi.datacollection.core.enums.Status;
import com.sabi.datacollection.core.enums.TransactionType;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionResponseDto {

    private Long id;
    private String hash;
    private Long walletId;
    @Enumerated(EnumType.STRING)
    private ActionType actionType;
    private BigDecimal amount;
    private BigDecimal initialBalance;
    private BigDecimal finalBalance;
    private String reference;
    private Long senderId;
    private Long receiverId;
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;
    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;


}
