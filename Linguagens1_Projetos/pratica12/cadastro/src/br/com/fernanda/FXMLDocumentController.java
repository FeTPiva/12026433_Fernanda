
package br.com.fernanda;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Fezitcha
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextField txtnome;
    @FXML
    private TextField txtcpf;
    @FXML
    private TextField txtendereco;
    @FXML
    private TextField txttelefone;
    @FXML
    private TextField txtsenha;
    @FXML
    private TextField txtemail;
    @FXML
    private Button btncadastro;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cadastrarr(ActionEvent event) {
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO usuario (`nome`,`cpf`,`endereco`,`telefone`,`senha`,`email`) VALUES (?,?,?,?,?,?)";
        
         PreparedStatement ps;
        try {
            
            ps = conexao.prepareStatement(sql);
            ps.setString(1, txtnome.getText());
            ps.setString(2, txtcpf.getText());
            ps.setString(3, txtendereco.getText());
            ps.setString(4, txttelefone.getText());
            ps.setString(5, txtsenha.getText());
            ps.setString(6, txtemail.getText());

            ps.execute();
            ps.close();
            System.out.println("não lascou :D");
        } catch (SQLException ex) {
            System.out.println("lascouuuu ,-, lembra de olha se o nome da tab ta certo, e do esquema '-'");
        }
                
    }
    
}
