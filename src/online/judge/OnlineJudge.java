/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

 * @author Anik
 */
public class OnlineJudge extends Application {
    
    Stage mainstage;
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("LogIn.fxml"));
        Parent root = loader.load();
        
        LogInController controller=loader.getController();
        controller.setMain(this);
        
        //Anik's Project
        
        
        Scene scene = new Scene(root);
        mainstage=stage;
        
        stage.setTitle("Online Judge");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void showHomePage() throws IOException{
        
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("HomePage.fxml"));
        Parent root = loader.load();
        
        HomePageController controller=loader.getController();
        controller.setMain(this);
      
        
        
        Scene scene = new Scene(root);
        mainstage.setScene(scene);
        mainstage.show();
    }
    
}
