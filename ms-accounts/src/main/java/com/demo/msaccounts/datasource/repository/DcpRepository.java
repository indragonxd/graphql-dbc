package com.demo.msaccounts.datasource.repository;

import com.demo.msaccounts.datasource.entity.DbcEntity;
import com.demo.msaccounts.datasource.entity.DcpEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DcpRepository extends R2dbcRepository<DcpEntity, String> {
}
