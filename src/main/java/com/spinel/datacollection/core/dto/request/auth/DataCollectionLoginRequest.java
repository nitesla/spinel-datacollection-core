package com.spinel.datacollection.core.dto.request.auth;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataCollectionLoginRequest {
    private String username;
    private String password;
    private String userType;
}
