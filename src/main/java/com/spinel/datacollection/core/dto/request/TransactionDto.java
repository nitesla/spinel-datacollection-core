package com.spinel.datacollection.core.dto.request;


import com.spinel.datacollection.core.enums.ActionType;
import com.spinel.datacollection.core.enums.ActionType;
import com.spinel.datacollection.core.enums.Status;
import com.spinel.datacollection.core.enums.TransactionType;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class TransactionDto {

    private Long id;
    private String hash;
    private Long walletId;
    private ActionType actionType;
    private BigDecimal amount;
    private BigDecimal initialBalance;
    private BigDecimal finalBalance;
    private String reference;
    private Long senderId;
    private Long receiverId;
    private TransactionType transactionType;
    private Status status;


}
