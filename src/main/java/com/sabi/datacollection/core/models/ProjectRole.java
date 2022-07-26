package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
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
