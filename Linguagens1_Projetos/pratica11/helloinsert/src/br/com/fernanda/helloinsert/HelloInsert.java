package br.com.fernanda.helloinsert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;


public class HelloInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conexao = ConnectionFactory.getConnection(); //n precisa dar new pq é static
        //prestar atenção na sequencia da tab do sql
        String sql = "INSERT INTO alunos (`nome`,`RA`,`idade`) VALUES (?,?,?)"; //no prinmeiro crase e no segundo aspas se for inserir por ali
        PreparedStatement ps;
        try {
            
       

            ps = conexao.prepareStatement(sql);
            ps.setString(1, "AOutra2");
            ps.setString(2, "2222");
            ps.setInt(3, 155);

            ps.execute();
            ps.close();
            System.out.println("não lascou :D");
        } catch (SQLException ex) {
            System.out.println("lascouuuu ,-, lembra de olha se o nome da tab ta certo, e do esquema '-'");
        }

    }

}
