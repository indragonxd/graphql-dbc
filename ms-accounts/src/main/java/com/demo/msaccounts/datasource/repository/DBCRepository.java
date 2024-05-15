package com.demo.msaccounts.datasource.repository;

import com.demo.msaccounts.datasource.entity.DbcEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBCRepository extends R2dbcRepository<DbcEntity, String> {
}
