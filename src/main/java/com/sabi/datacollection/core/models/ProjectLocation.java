package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class ProjectLocation extends CoreEntity {
    private Long locationId;
    private String name;
    private String locationType;
    private Long projectId;
    private int collectedRecords;
    private int expectedRecords;

    @Transient
    private String lga;
    @Transient
    private String state;
}
