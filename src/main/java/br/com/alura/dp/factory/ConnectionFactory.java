package br.com.alura.dp.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final String type;

    public ConnectionFactory(String type){
        this.type = type;
    }

    public Connection getConnection() throws SQLException {
        String driverConnection = String.format("jdbc:%s://localhost:3306/banco", this.type);
        return DriverManager.getConnection(driverConnection, "usuario", "senha");
    }
}
