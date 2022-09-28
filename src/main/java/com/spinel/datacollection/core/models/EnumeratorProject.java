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
    @Enumerated(EnumType.STRING)
    private Status status;
    private Boolean isLocationBound;
    private String timeLine;
    private long submission;
}
