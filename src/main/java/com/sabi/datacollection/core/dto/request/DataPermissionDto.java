package com.sabi.datacollection.core.dto.request;

import lombok.Data;

@Data
public class DataPermissionDto {
    private Long id;
    private String name;
    private String menuName;
    private String url;
    private String permissionType;
    private String appPermission;
}
