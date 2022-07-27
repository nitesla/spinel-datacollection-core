package com.sabi.datacollection.core.dto.request;

import com.sabi.datacollection.core.enums.UserCategory;
import lombok.Data;

@Data
public class DataCollectionUserRequestDto {

    private Long id;
    private Long roleId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private UserCategory userCategory;
}
