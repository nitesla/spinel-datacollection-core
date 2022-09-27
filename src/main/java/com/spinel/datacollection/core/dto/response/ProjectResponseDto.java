package com.spinel.datacollection.core.dto.response;

import lombok.Data;

import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProjectResponseDto {
    private Long id;
    private String name;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long sectorId;
    private String imageQuality;
    private Boolean isLocationBased;
    private Long projectOwnerId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private String projectOwner;
    private String projectCategoryDescription;
    private int projectCount;
    private String clientType;
    private String description;
    private String pictureUrl;
    @Transient
    private Long projectFormId;
    private Boolean isPublic;
    private Boolean isOpened;


    private int submissions;
    private int duration;
    private boolean enableTeams;
    private boolean enableGeoFencing;
    private boolean enableEnumerators;
    private boolean enableAcceptanceCriteria;

    private String projectCategory;
    private String projectCategory2;
    private String projectCategory3;

    @Transient
    private List<String> projectMedias;

    @Transient
    private List<String> projectFiles;

    @Transient
    private List<String> projectSurveys;
}
