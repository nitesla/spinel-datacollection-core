package com.sabi.datacollection.core.dto.request;


import com.sabi.datacollection.core.enums.ActionType;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class TransactionDto {

    private Long id;


    private Long walletId;
    private ActionType actionType;
    private BigDecimal amount;
    private BigDecimal initialBalance;
    private BigDecimal finalBalance;


}
