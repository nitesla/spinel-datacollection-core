package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProjectOwnerEnumerator extends CoreEntity {
    private Long projectOwnerId;
    private Long enumeratorId;
    private LocalDateTime dateJoined;
    private String status;
}
