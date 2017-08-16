/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.io.File;

public class FXMLDocumentController implements Initializable {

    private static final String FILENAME = "T:\\linguagens\\12026433\\12026433_Fernanda\\"
            + "Linguagens1_Projetos\\pratica6\\exercicio1\\bancodds.txt";

    @FXML
    private Button btnSalvar;
    @FXML
    private TextField nField;
    @FXML
    private TextField eField, iField, rgField, cpfField;
    @FXML
    private ImageView img;
    @FXML
    private Label test;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        // 
        try {
            File file = new File("T:\\linguagens\\12026433\\12026433_Fernanda\\Linguagens1_Projetos\\pratica6\\exercicio1\\bancodds.txt");

           file.createNewFile();
           
          String content = nField.getText() + " " + iField.getText() + " " + eField.getText()
            + " " + cpfField.getText() + " " + rgField.getText();; 
           
           
           
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        test.setText("e ai mew");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
