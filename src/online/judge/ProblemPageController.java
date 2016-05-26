/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Anik
 */
public class ProblemPageController implements Initializable {
    OnlineJudge main;
    @FXML
    private TextArea ProblemBox;

  
    public void setFile(File fp) throws FileNotFoundException {

        Scanner sc = new Scanner(fp);
        String line;
        while(sc.hasNextLine()){
            line=sc.nextLine();
            ProblemBox.appendText(line+"\n");
        }
    }
    public void setMain(OnlineJudge p){
        main=p;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
