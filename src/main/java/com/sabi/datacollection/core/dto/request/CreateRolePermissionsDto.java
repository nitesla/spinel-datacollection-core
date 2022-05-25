package com.sabi.datacollection.core.dto.request;

import com.sabi.datacollection.core.models.DataRolePermission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateRolePermissionsDto {
    private String roleName;
    private String roleDescription;
    private List<DataRolePermission> permissionIds;
}
