package com.sabi.datacollection.core.models;

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
public class EnumeratorProjectLocation extends CoreEntity {
    private Long enumeratorProjectId;
    private Long projectLocationId;
    private Integer collectedRecord;
    private Integer expectedRecord;
}
