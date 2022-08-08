package com.spinel.datacollection.core.models;

import com.spinel.datacollection.core.enums.Status;
import com.spinel.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class Project extends CoreEntity {
    private String name;
    private Long projectCategoryId;
    private Status status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long sectorId;
    private String imageQuality;
    private Boolean isLocationBased;
    private Long projectOwnerId;
    private String description;

    private Boolean isPublic;
    private Boolean isOpened;
    @Transient
    private Long projectFormId;


    @Transient
    private String projectOwner;
    @Transient
    private String projectCategory;
    @Transient
    private String projectCategoryDescription;
    @Transient
    private int projectCount;
    @Transient
    private String clientType;
    @Transient
    private String pictureUrl;
}