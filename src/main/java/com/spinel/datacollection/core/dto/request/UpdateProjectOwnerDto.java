package com.spinel.datacollection.core.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdateProjectOwnerDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String gender;
    private String pictureUrl;
    private String address;
    private Long sectorId;
    private Long countryId;
    private Long stateId;
    private Long lgaId;
}
