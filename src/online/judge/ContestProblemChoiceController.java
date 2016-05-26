/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Anik
 */
public class ContestProblemChoiceController implements Initializable {
    OnlineJudge main;
    int button_num=0;
    @FXML
    private AnchorPane mainPane;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void bAddProb(ActionEvent event) throws IOException{
         FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File fp = fileChooser.showOpenDialog(main.mainstage);
/*        
        try {
            Desktop.getDesktop().open(fp);
        } catch (IOException ex) {
            Logger.getLogger(ContestProblemChoiceController.class.getName()).log(Level.SEVERE, null, ex);
        }
*/        
        char ch = (char) (button_num+'A');
        Button b= new Button("Problem  :  "+ch); 
        b.setLayoutX(200);
        b.setLayoutY(250+button_num*60);
        b.setPrefSize(200,30);
        b.setStyle("-fx-font: 18 System; -fx-base: #e5e4e2;");
        
        
        b.setOnAction(e->{
             try {
                 if(fp!=null) main.showProb(fp);
             } catch (IOException ex) {
                 Logger.getLogger(ContestProblemChoiceController.class.getName()).log(Level.SEVERE, null, ex);
             }
            }
        );
                
        if(fp!=null) mainPane.getChildren().add(b);
        button_num++;
    }
    
    public void setMain(OnlineJudge scene){
        main=scene;  
    }
    
}
