package com.hee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SwLicenseDetail {

    private String categoryStandard;
    private String standardCondition;
    private float conditionWeight;
    private String description;
}
