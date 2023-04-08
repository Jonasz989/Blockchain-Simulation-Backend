package com.example.blockchainsimulation.dbmigration;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.Configuration;
import org.flywaydb.core.api.configuration.FluentConfiguration;

public class DatabaseMigration extends Flyway {

    public DatabaseMigration(Configuration configuration) {
        super(configuration);
        migrate();
    }

    //configure flyway
    public static Configuration configure(String url, String username, String password) {
        return new FluentConfiguration()
                .dataSource(url, username, password)
                .locations("classpath:db/migration");
    }
}


