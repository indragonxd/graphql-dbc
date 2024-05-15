package com.demo.msaccounts.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

/*
@Configuration
public class SchemaConfiguration{
        @Value("classpath:schema.sql")
        private Resource schemaScript;

        @Bean
        public CommandLineRunner initData(ConnectionFactoryInitializer initializer) {
            return args -> {
                ResourceDatabasePopulator populator = new ResourceDatabasePopulator(schemaScript);
                initializer.setDatabasePopulator(populator);
                initializer.afterPropertiesSet();
            };
        }
}
*/