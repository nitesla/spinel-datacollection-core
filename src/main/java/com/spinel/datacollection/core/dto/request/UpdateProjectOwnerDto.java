package com.spinel.datacollection.core.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateProjectOwnerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Long projectCategoryId;
    private String gender;
    private String pictureUrl;
}
