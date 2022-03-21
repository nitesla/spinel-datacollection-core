package com.sabi.datacollection.core.models;

import com.sabi.datacollection.core.enums.Status;
import com.sabi.framework.models.CoreEntity;
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

    @Transient
    private String projectOwner;

    @Transient
    private String projectCategory;
}