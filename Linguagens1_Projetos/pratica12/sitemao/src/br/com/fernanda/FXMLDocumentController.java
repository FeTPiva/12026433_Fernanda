package br.com.fernanda;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    Connection conexao = ConnectionFactory.getConnection();

    private Label label;
    @FXML
    private TextField txtNomeUser;
    @FXML
    private TextField txtSenha;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtNomeProd;
    @FXML
    private TextField txtPrecoProd;
    @FXML
    private Button btnCadastrar;
    @FXML
    private TextField txtQuant;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Login(ActionEvent event) {
        String sql = "SELECT * FROM usuarioadm;";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()) {
                String nome = resultadoQuery.getString("user");
                String senha = resultadoQuery.getString("senha");

                if (senha.equals(txtSenha.getText()) && nome.equals(txtNomeUser.getText())) {
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
    private void Cadastrar(ActionEvent event) {

        String sql = "INSERT INTO produtos (`nomeprod`,`preco`,`quantidade`) VALUES (?,?,?)";
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, txtNomeProd.getText());
            ps.setFloat(2, Float.parseFloat(txtPrecoProd.getText()));
            ps.setInt(3, Integer.parseInt(txtQuant.getText()));

            ps.execute();
            ps.close();
            System.out.println("não lascou :D");

        } catch (SQLException ex) {
            System.out.println("lascouuuu ,-, lembra de olha se o nome da tab ta certo, e do esquema '-'");
            System.out.println(ex.getMessage());
        }
    }
}
