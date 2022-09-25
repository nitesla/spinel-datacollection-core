package com.spinel.datacollection.core.models;

import com.spinel.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProjectSurvey extends CoreEntity {
    private Long projectId;
    private String survey;
}
