package com.demo.msaccounts.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InternalInformation{
    private BankRelationship bankRelationship;
}