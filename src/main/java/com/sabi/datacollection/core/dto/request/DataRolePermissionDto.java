package com.sabi.datacollection.core.dto.request;

import com.sabi.datacollection.core.models.DataRolePermission;
import lombok.Data;

import java.util.List;

@Data
public class DataRolePermissionDto {
    private Long id;
    private Long roleId;
    private List<DataRolePermission> permissionIds;
}
