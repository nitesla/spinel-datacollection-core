package com.spinel.datacollection.core.models;

import com.spinel.framework.models.CoreEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@RequiredArgsConstructor
@Entity
public class ProjectFile extends CoreEntity {
    private Long projectId;
    private String file;
}
