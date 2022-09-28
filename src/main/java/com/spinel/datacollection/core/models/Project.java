package com.spinel.datacollection.core.models;

import com.spinel.datacollection.core.enums.Status;
import com.spinel.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class Project extends CoreEntity {
    private String name;
    private String description;
    private Status status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String imageQuality;
    private Boolean isLocationBased;
    private Long projectOwnerId;
    private int submissions;
    private int duration;
    private boolean enableTeams;
    private boolean enableGeoFencing;
    private boolean enableEnumerators;
    private boolean enableAcceptanceCriteria;

    private Boolean isPublic;
    private Boolean isOpened;
    @Transient
    private Long projectFormId;


    @Transient
    private String projectOwner;
    @Transient
    private String projectCategoryDescription;
    @Transient
    private int projectCount;
    @Transient
    private String clientType;
    @Transient
    private String pictureUrl;

    @Transient
    private List<String> projectMedias;

    @Transient
    private List<String> projectFiles;

    @Transient
    private List<String> projectSurveys;

    private String projectCategory;
    private String projectCategory2;
    private String projectCategory3;


}