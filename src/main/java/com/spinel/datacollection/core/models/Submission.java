package com.spinel.datacollection.core.models;


import com.spinel.datacollection.core.enums.SubmissionStatus;
import com.spinel.framework.models.CoreEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Submission extends CoreEntity {

    private long projectId;
    private Long formId;
    @Enumerated(EnumType.STRING)
    private SubmissionStatus status;
    private Long enumeratorId;
    private LocalDateTime submissionDate;
    private Long commentId;
    private String additionalInfo;
    private String gprsLocation;
    private Long deviceId;

    @Transient
    private String commentName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Submission that = (Submission) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
