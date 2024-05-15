package com.demo.msaccounts.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DemographicInformation {
    private String birthDate;
    private BirthPlace birthPlace;
}
