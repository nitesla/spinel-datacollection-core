package com.sabi.datacollection.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
@Entity
public class PricingConfiguration extends CoreEntity {
    private BigDecimal price;
    private Long dataSetId;
}
