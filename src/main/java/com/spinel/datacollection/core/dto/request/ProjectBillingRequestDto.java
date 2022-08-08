package com.spinel.datacollection.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjectBillingRequestDto  {
    private Long id;
    private Long projectId;

}
