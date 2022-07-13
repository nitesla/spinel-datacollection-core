package com.sabi.datacollection.core.models;


import com.sabi.framework.models.CoreEntity;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Form extends CoreEntity {

    private String name;
    private String version;
    private String description;
    private String formField;
    private Long projectOwnerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Form form = (Form) o;
        return getId() != null && Objects.equals(getId(), form.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
