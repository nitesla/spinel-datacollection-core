package com.sabi.datacollection.core.models;

import com.spinel.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class UserBank extends CoreEntity {
    private Long userId;
    private Long bankId;
    private String accountNumber;
}
