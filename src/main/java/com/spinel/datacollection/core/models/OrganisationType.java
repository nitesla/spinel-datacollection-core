package com.spinel.datacollection.core.models;


import com.spinel.framework.models.CoreEntity;
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
public class OrganisationType extends CoreEntity {
    private String name;
    private String description;
}
