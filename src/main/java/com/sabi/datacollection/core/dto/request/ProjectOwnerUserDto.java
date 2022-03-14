package com.sabi.datacollection.core.dto.request;

import lombok.Data;

@Data
public class ProjectOwnerUserDto {
    private Long id;
    private Long userId;
    private Long projectOwnerId;
}
