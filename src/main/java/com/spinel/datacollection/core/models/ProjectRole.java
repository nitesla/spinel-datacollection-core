package com.spinel.datacollection.core.models;


import com.spinel.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProjectRole extends CoreEntity {
    private String name;
    private String description;
}
