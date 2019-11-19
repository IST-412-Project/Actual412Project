package actual412project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author brittanychapin
 */
public class EmergencyUICntl {
    
    @FXML private TextField success;
    @FXML private TextField textInput;
    @FXML private Button emergencyButton;
    
    
    @FXML
    private void Confirmation(ActionEvent e){
        System.out.println("confirmation called");
        String userInput = textInput.getText();
        System.out.println("input: "+ userInput);
        success.setText("Emergency message received.");
    }
    
}


