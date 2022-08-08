package com.spinel.datacollection.core.models;


import com.spinel.datacollection.core.enums.EnumeratorStatus;
import com.spinel.datacollection.core.enums.VerificationStatus;
import com.spinel.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Enumerator extends CoreEntity {

    @Column(updatable= false)
    private long userId;
    private String firstName;
    private String lastName;
    private Long projectRoleId;
    private String referralCode;
    private EnumeratorStatus status;
    private int rating;
    private String cac;
    private String pictureUrl;
    private Long lgaId;
    private Long countryId;
    private String address;
    private boolean isCorp;
    private Long organisationTypeId;
    private String refereeCode;
    private String corporateName;
    private String phone;
    private String email;
    private String gender;
    private String efficiency;
    private String linkedIn;
    private String twitter;
    private String facebook;
    private String instagram;
    private String BVN;
    private String idType;
    private String frontOfId;
    private String backOfId;
    private String verificationStatus;
    private VerificationStatus verification;
    private String idCard;
    private String idNumber;
    private LocalDateTime registrationDate = LocalDateTime.now();

    @Transient
    private String lga;

    @Transient
    private String state;

    @Transient
    private String country;

    @Transient
    private String organisationType;

    @Transient
    private String projectRole;


}
