
package br.com.fernanda;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectionFactory {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/carrinho", "root", ""); //tem q botar o nome do schema '-'
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}