package com.spinel.datacollection.core.models;



import com.spinel.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class Form extends CoreEntity {

    private String name;
    private String version;
    private String description;
    private String formField;
    private Long projectOwnerId;
    private Long userId;
    private Boolean isPublic;
    private Long projectId;


}
