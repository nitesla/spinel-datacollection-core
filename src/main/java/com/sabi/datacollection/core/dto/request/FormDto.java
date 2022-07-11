package com.sabi.datacollection.core.dto.request;


import lombok.Data;


@Data
public class FormDto {

    private Long id;
    private String name;
    private boolean isActive;
    private String version;
    private String description;
    private String formField;
    private Long projectOwnerId;

}
