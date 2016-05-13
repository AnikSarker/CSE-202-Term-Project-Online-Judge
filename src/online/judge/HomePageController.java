/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Aspire
 */
public class HomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    OnlineJudge main;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
        
    public void setMain(OnlineJudge scene){
        main=scene;
        
    } 
    
}
