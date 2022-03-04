package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class CommentDictionary extends CoreEntity {
    private String name;
    private String additionalInfo;
}
