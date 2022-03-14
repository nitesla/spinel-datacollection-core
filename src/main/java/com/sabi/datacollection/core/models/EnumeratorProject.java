package com.sabi.datacollection.core.models;

import com.sabi.datacollection.core.enums.Status;
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
public class EnumeratorProject extends CoreEntity {
    private Long projectId;
    private Long enumeratorId;
    private LocalDateTime assignedDate;
    private LocalDateTime completedDate;
    private Status status;
    private Boolean isLocationBound;
}
