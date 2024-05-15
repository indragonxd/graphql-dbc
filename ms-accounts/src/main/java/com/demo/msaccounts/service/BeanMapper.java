package com.demo.msaccounts.service;

import com.demo.msaccounts.datasource.entity.DbcEntity;
import com.demo.msaccounts.datasource.entity.DcpEntity;
import com.demo.msaccounts.model.*;

import java.time.ZoneOffset;

public class BeanMapper {

    private static final ZoneOffset ZONE_OFFSET = ZoneOffset.ofHours(5);


    public static Dbc mapToGraphql(DbcEntity dbcEntity){

        return  Dbc.builder()
                .personId(dbcEntity.getDbcKeyIreg())
                .agency(Agency.builder().code(dbcEntity.getDbcCodOfic()).build())
                .customerType(CustomerType.builder().code(dbcEntity.getDbcCodTicl()).build())
                .bussinesOfficer(BussinesOfficer.builder().employedId(dbcEntity.getDbcCodEjec()).build())
                .fatherLastName(dbcEntity.getDbcGlsNomc())
                .economicActivity(EconomicActivity.builder().primary(EconomicActivityType.builder().code(dbcEntity.getDbcCodActi()).build()).build())
                .internalInformation(InternalInformation.builder().bankRelationship(BankRelationship.builder().code(dbcEntity.getDbcCodTicl()).build()).build())
                .build();
    }

    public static Dcp mapToGraphql(DcpEntity dcpEntity){
        return  Dcp.builder()
                .personId(dcpEntity.getDcpKeyIdcp())
                .demographicInformation(DemographicInformation.builder().birthDate(dcpEntity.getDcpFecFnac()).build())
                .gender(Gender.builder().code(dcpEntity.getDcpIndSexo()).build())
                .maritalStatus(MaritalStatus.builder().code(dcpEntity.getDcpIndEciv()).build())
                .nationality(Nationality.builder().code(dcpEntity.getDcpCodPnac()).build())
                .build();
    }

}
