/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecomprasbonita;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Aluno 07
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField entrada;
    @FXML
    private Button button;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private TextArea exibicao;
    ArrayList<String> lista = new ArrayList<String>();
    @FXML //add item
    private void handleButtonAction(ActionEvent event) {
        
        
        lista.add(entrada.getText());
              
        
    }
    @FXML //remover item
    private void handleButton2Action(ActionEvent event) {
       
    }
    @FXML //mostrar lista
    private void handleButton3Action(ActionEvent event) {
       exibicao.setText(lista.());
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButton2Action(ActionEvent event) {
    }

    @FXML
    private void handleButton3Action(ActionEvent event) {
    }
    
}
