package com.spinel.datacollection.core.models;


import com.spinel.framework.models.CoreEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProjectOwner extends CoreEntity {
    private Long organisationTypeId;
    private Long userId;
    private Long lgaId;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    private Boolean isRegistered;
    private String CAC;
    private int employeeCount;
    private String email;
    private String website;
    private LocalDateTime registeredDate;
    private Boolean isCorp;
    private String corporateName;
    private String accountManager;

    @Transient
    private String lga;
    @Transient
    private String organisationType;
    @Transient
    private boolean userIsActive;
    @Transient
    private int projectCount;

}
