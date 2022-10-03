package com.spinel.datacollection.core.models;

import com.spinel.datacollection.core.enums.Status;
import com.spinel.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProjectForm extends CoreEntity {
    private Long projectId;
    private Long formId;
    private String status;
    private int target;
}
