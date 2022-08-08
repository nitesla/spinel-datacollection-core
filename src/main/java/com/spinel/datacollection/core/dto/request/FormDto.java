package com.spinel.datacollection.core.dto.request;


import lombok.Data;


@Data
public class FormDto {

    private Long id;
    private String name;
    private boolean isActive;
    private String version;
    private String description;
    private String formField;
    private Long userId;
    private boolean isPublic;

}
