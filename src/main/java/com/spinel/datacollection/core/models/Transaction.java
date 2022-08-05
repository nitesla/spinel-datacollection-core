package com.spinel.datacollection.core.models;


import com.spinel.datacollection.core.enums.ActionType;
import com.spinel.framework.models.CoreEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Transaction extends CoreEntity {

    private String hash;
    private Long walletId;
    private ActionType actionType;
    private BigDecimal amount;
    private BigDecimal initialBalance;
    private BigDecimal finalBalance;
    private String reference;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Transaction that = (Transaction) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
