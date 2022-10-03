package com.spinel.datacollection.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.spinel.datacollection.core.enums.ActionType;
import lombok.Data;
import com.spinel.datacollection.core.enums.TransactionType;


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
    private String status;
    private Long userId;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;


}
