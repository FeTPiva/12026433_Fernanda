/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fernanda;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLCompraControllerCompra implements Initializable {

    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtNomeProd;
    @FXML
    private TextField txtQuant;
    @FXML
    private Button btnCompra;
    @FXML
    private Button openCadastro;
    @FXML
    private Button btnPesquisar;

     Connection conexao = ConnectionFactory.getConnection();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Login(ActionEvent event) {
         String sql = "SELECT * FROM usuario;";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()) {
                String email = resultadoQuery.getString("email");
                String senha = resultadoQuery.getString("senha");

                if (senha.equals(txtSenha.getText()) && email.equals(txtEmail.getText())) {
                    System.out.println("logado com sucesso");
                } else {
                    System.out.println("fail");
                }
            }
            ps.close();
            conexao.close();

        } catch (SQLException ex) {
            System.out.println("lascou");
            System.out.println(ex.getMessage());
        }

    }

    @FXML
    private void Comprar(ActionEvent event) {
        String sql = "SELECT * FROM tbl_pedido_produto;";
        PreparedStatement ps;
        try{
             ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()) {
                String produto = resultadoQuery.getString("produto");
                String quantidade = resultadoQuery.getString("senha");
                Float preco = resultadoQuery.getFloat(Integer.parseInt("preco"));
            
                
                //criar linked list onde vão sendo adicionados os produtos
                //mudar o botão pra add no carrinho
                //depois q for comprado reduz no estoque, dou um select no estoque, faço a conta, e ai do insert eu acho
                
                
                
            }
            
            
        }catch(SQLException e){
            System.out.println("deu ruim " + e.getMessage());
        }
        

    }

    @FXML
    private void openCadastro(ActionEvent event) {

        br.com.fernanda.Main.launch();

    }

    @FXML
    private void Pesquisar(ActionEvent event) {
        
    }

}
