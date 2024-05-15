package com.demo.msaccounts.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EconomicActivity {
    private EconomicActivityType primary;
    private EconomicActivityType secondary;

}