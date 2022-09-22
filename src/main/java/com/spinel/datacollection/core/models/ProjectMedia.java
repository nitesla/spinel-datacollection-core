package com.spinel.datacollection.core.models;

import com.spinel.framework.models.CoreEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class ProjectMedia extends CoreEntity {
    private Long projectId;
    private String media;
}
