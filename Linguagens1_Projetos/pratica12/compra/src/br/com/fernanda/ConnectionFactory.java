/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernanda;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fezitcha
 */
public class ConnectionFactory {
   public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/carrinho", "root", "666"); //tem q botar o nome do schema '-'
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
}
