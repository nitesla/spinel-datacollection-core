package com.sabi.datacollection.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BackOfficeResponseDto {

    private int activeEnumerator;
    private int totalSubmission;
    private BigDecimal pendingPayout;
    private BigDecimal totalPayout;
}
