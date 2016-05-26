/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author Aspire
 */
public class LogInController implements Initializable {
    
    OnlineJudge main;
    
    @FXML
    private TextField iTextField;
    @FXML
    private Text iNewUser;
    @FXML
    private Button iSignup;
    @FXML
    private GridPane IGrid;
    private PasswordField iPasswordField;
    @FXML
    private TextField iUser;
    @FXML
    private PasswordField iPassword;
    
    @FXML
    private void bHome(ActionEvent event) throws IOException {
        if(iUser.getText().equals("a") && iPassword.getText().equals("1")) main.showHomeAdmin();
        else main.showHomePage(); 
    } 
    
    
    @FXML
    private void bRegister(ActionEvent event)throws IOException{
        main.showRegister();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
    public void setMain(OnlineJudge scene){
        main=scene;
        
    } 
    
}
