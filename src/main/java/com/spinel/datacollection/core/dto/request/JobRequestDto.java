package com.spinel.datacollection.core.dto.request;

import com.spinel.datacollection.core.enums.GeneralStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobRequestDto {
    private Long id;
    @NotNull(message = "Project id is required")
    private Long projectId;
    @NotNull(message = "User id is required")
    private Long userId;
//    @NotNull(message = "")
    private GeneralStatus status;
//    private LocalDateTime requestedDate;
//    private LocalDateTime responseDate;
    private String comments;
    private String email;
}
