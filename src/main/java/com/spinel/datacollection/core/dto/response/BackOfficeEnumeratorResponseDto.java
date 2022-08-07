package com.spinel.datacollection.core.dto.response;

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
public class BackOfficeEnumeratorResponseDto {

    private int totalEnumerator;
    private int activeEnumerator;
    private int pendingEnumerator;
    private int totalSubmission;
}
