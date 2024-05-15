package com.demo.msaccounts.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dcp {
    private String personId;
    private Gender gender;
    private DemographicInformation demographicInformation;
    private Nationality nationality;
    private MaritalStatus maritalStatus;
}
