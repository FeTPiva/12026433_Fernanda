package br.com.fernanda.helloinsert;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/esquema", "root", "senha@666"); //tem q botar o nome do schema '-'
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
