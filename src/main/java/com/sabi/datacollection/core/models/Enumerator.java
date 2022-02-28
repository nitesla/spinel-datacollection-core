package com.sabi.datacollection.core.models;


import com.sabi.framework.models.CoreEntity;
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
    private String referralCode;
    private int rating;
    private String cac;
    private String pictureUrl;
    private Long lgaId;
    private String address;
    private boolean isCorp;
    private Long organisationTypeId;
    private String refereeCode;
    private String corporateName;
    private String phone;
    private String email;
    private LocalDateTime registrationDate = LocalDateTime.now();
    private String registrationToken;
    private String registrationTokenExpiration;

    @Transient
    private String lga;

    @Transient
    private String state;


}
