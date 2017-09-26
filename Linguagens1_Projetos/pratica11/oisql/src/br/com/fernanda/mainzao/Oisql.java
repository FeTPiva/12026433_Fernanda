/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package br.com.fernanda.mainzao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno 07
 */
public class Oisql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection conexao = ConnectionFactory.getConnection(); //n precisa dar new pq é static
                String sql = "SELECT * FROM tblalunos;";
                PreparedStatement ps;
                try{
                    ps = conexao.prepareStatement(sql);
                    ResultSet resultadoQuery = ps.executeQuery();
                    while (resultadoQuery.next()){
                        int id = resultadoQuery.getInt("id");
                        String nome = resultadoQuery.getString("nome");
                        int idade = resultadoQuery.getInt("idade");
                        String RA = resultadoQuery.getString("RA");
                        
                        System.out.println(Integer.toString(id)+ "nome; " + nome +"idade: "+ idade + "RA: "+ RA);
                    }
                    ps.close();
                    conexao.close();
                    
                }catch(SQLException ex){
                   System.out.println("lascou");
                } 
                
        
    }
    
}
