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
public class ProjectDashboardResponse {

    private int totalProjects;
    private int totalClient;
    private int totalEnumerator;
    private int totalSubmissions;
}
