package com.spinel.datacollection.core.models;


import com.spinel.framework.models.CoreEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class Bank extends CoreEntity {


    private String name;
    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Bank bank = (Bank) o;
        return getId() != null && Objects.equals(getId(), bank.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
