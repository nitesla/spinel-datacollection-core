package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProjectEnumerator extends CoreEntity {
    private Long projectId;
    private Long enumeratorId;

    @Transient
    private String phoneNumber;
    @Transient
    private String firstName;
    @Transient
    private String lastName;
    @Transient
    private String location;
    @Transient
    private String description;
    @Transient
    private String projectCount;
    @Transient
    private String email;

}
