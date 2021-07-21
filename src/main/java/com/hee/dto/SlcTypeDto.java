package com.hee.dto;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Document(collection = "slcType")
public class SlcTypeDto {

    private String swLicName;
    private String swLicVersion;
    private String swLicCategory;
    private SwLicenseDetail swLicDetail;

    SlcTypeDto(SwLicenseDetail swLicDetail) {
        this.swLicDetail = swLicDetail;
    }
}
