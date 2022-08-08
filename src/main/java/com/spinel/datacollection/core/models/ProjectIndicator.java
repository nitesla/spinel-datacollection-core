package com.spinel.datacollection.core.models;


import com.spinel.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class ProjectIndicator extends CoreEntity {
    private Long projectId;
    private Long indicatorId;

    @Transient
    private String project;

    @Transient
    private String indicator;
}
