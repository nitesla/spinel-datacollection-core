package com.spinel.datacollection.core.dto.response;

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
    private int totalProjects;
    private int submissions;
//
    private int totalTransaction;
    private int totalSuccessful;
    private int pending;
    private int failed;
//
    private int totalEnumerators;
    private int verifiedEnumerators;
    private int unverifiedEnumerators;
    private int totalProject;
//
    private int verifiedClient;
    private int unverifiedClient;
    private int activeClient;
    private int inactiveClient;

}
