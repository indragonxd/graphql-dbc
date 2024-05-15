package com.demo.msaccounts.datasource.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "DCP")
public class DcpEntity {
    @Id
    @Column(name = "DBC_KEY_IDCP")
    private String dcpKeyIdcp;
    private String dcpFecFnac;
    private String dcpCodPnac;
    private String dcpIndSexo;
    private String dcpIndEciv;
    private String dcpIndNedu;

    public String getDcpKeyIdcp() {
        return dcpKeyIdcp;
    }

    public void setDcpKeyIdcp(String dcpKeyIdcp) {
        this.dcpKeyIdcp = dcpKeyIdcp;
    }

    public String getDcpFecFnac() {
        return dcpFecFnac;
    }

    public void setDcpFecFnac(String dcpFecFnac) {
        this.dcpFecFnac = dcpFecFnac;
    }

    public String getDcpCodPnac() {
        return dcpCodPnac;
    }

    public void setDcpCodPnac(String dcpCodPnac) {
        this.dcpCodPnac = dcpCodPnac;
    }

    public String getDcpIndSexo() {
        return dcpIndSexo;
    }

    public void setDcpIndSexo(String dcpIndSexo) {
        this.dcpIndSexo = dcpIndSexo;
    }

    public String getDcpIndEciv() {
        return dcpIndEciv;
    }

    public void setDcpIndEciv(String dcpIndEciv) {
        this.dcpIndEciv = dcpIndEciv;
    }

    public String getDcpIndNedu() {
        return dcpIndNedu;
    }

    public void setDcpIndNedu(String dcpIndNedu) {
        this.dcpIndNedu = dcpIndNedu;
    }
}
