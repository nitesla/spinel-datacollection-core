package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class ProjectOwnerUser extends CoreEntity {
    private Long userId;
    private Long projectOwnerId;
}
