package com.sabi.datacollection.core.models;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DataPermission {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String menuName;
    private String url;
    private String permissionType;
    private String appPermission;

    @ApiModelProperty(hidden = true)
    private LocalDateTime createdDate = LocalDateTime.now();

    @UpdateTimestamp
    @ApiModelProperty(hidden = true)
    private LocalDateTime updatedDate = LocalDateTime.now();

    private Long createdBy;
    private Long updatedBy;

    private int status;




}
