package com.sabi.datacollection.core.models;

import com.sabi.datacollection.core.enums.Status;
import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProjectForm extends CoreEntity {
    private Long projectId;
    private Long formId;
    private Status status;
}
