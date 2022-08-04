package com.sabi.datacollection.core.models;

import com.sabi.datacollection.core.enums.GeneralStatus;
import com.sabi.framework.models.CoreEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class JobRequest extends CoreEntity {
    private Long projectId;
    private Long userId;
    private GeneralStatus status;
    private LocalDateTime requestedDate;
    private LocalDateTime responseDate;
    private String comments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JobRequest that = (JobRequest) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
