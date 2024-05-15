package com.demo.msaccounts.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "DBC")
public class DbcEntity {
    @Id
    @Column(name = "DBC_KEY_IREG")
    private String dbcKeyIreg;

    private String dbcCodActi;
    private String dbcCodEjec;
    private String dbcCodOfic;
    private String dbcCodTicl;
    private String dbcGlsNomc;

    public String getDbcKeyIreg() {
        return dbcKeyIreg;
    }

    public void setDbcKeyIreg(String dbcKeyIreg) {
        this.dbcKeyIreg = dbcKeyIreg;
    }

    public String getDbcCodActi() {
        return dbcCodActi;
    }

    public void setDbcCodActi(String dbcCodActi) {
        this.dbcCodActi = dbcCodActi;
    }

    public String getDbcCodEjec() {
        return dbcCodEjec;
    }

    public void setDbcCodEjec(String dbcCodEjec) {
        this.dbcCodEjec = dbcCodEjec;
    }

    public String getDbcCodOfic() {
        return dbcCodOfic;
    }

    public void setDbcCodOfic(String dbcCodOfic) {
        this.dbcCodOfic = dbcCodOfic;
    }

    public String getDbcCodTicl() {
        return dbcCodTicl;
    }

    public void setDbcCodTicl(String dbcCodTicl) {
        this.dbcCodTicl = dbcCodTicl;
    }

    public String getDbcGlsNomc() {
        return dbcGlsNomc;
    }

    public void setDbcGlsNomc(String dbcGlsNomc) {
        this.dbcGlsNomc = dbcGlsNomc;
    }
}
