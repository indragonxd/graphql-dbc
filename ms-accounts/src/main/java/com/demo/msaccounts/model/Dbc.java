package com.demo.msaccounts.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dbc {
    //private String dbcKeyIreg;//
    //private String dbcCodActi;//
    //private String dbcCodEjec;//
    //private String dbcCodOfic;//
    //private String dbcCodTicl;//
    //private String dbcGlsNomc;//

    private String personId;
    private CustomerType customerType;
    private String fatherLastName;
    private Gender gender;
    private EconomicActivity economicActivity;
    private BussinesOfficer bussinesOfficer;
    private Agency agency;
    private InternalInformation internalInformation;

}










