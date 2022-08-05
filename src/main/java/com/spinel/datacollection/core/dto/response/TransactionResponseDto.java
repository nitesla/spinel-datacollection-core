package com.spinel.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.spinel.datacollection.core.enums.ActionType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionResponseDto {

    private Long id;

    private Long walletId;
    private ActionType actionType;
    private BigDecimal amount;
    private BigDecimal initialBalance;
    private BigDecimal finalBalance;
    private String reference;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;


}
