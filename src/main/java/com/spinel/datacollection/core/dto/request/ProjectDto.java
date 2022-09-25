package com.spinel.datacollection.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProjectDto {
    private Long id;
    private String name;
    private String description;
    private List<String> surveys;
    private int submissions;
    private Long projectOwnerId;
    private String status;
    private int duration;
    private boolean enableTeams = false;
    private boolean enableGeoFencing = false;
    private boolean enableEnumerators = false;
    private boolean enableAcceptanceCriteria = false;


    private List<Long> projectCategoryIds;
    private List<String> projectFiles;
    private List<String> projectMedias;
}
