package com.sabi.datacollection.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleDashboardResponseDto {

    private int totalRole;
    private int numberOfAdmin;
    private int totalActiveRole;
    private int totalInactiveRole;
}