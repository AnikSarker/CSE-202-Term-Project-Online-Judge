/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online.judge;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class OnlineJudge extends Application {
    Stage mainstage;
    ArrayList<File>ara=new ArrayList<File>();
    
    @Override
    public void start(Stage stage) throws Exception {
        
        mainstage=stage;
        showLogIn();
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
    
    public void showHomeAdmin() throws IOException{
        
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("HomeAdmin.fxml"));
        Parent root = loader.load();
        
        HomeAdminController controller=loader.getController();
        controller.setMain(this);
      
        
        
        Scene scene = new Scene(root);
        mainstage.setScene(scene);
        mainstage.show();
    }
    
    public void showLogIn() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("LogIn.fxml"));
        Parent root = loader.load();
        
        LogInController controller=loader.getController();
        controller.setMain(this);
        
        Scene scene = new Scene(root);  
   
        
        mainstage.setTitle("Online Judge");
        mainstage.setScene(scene);
        mainstage.show();
    }
    
    public void showRegister() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Register.fxml"));
        Parent root = loader.load();
        
        RegisterController controller=loader.getController();
        controller.setMain(this);
        
        Scene scene = new Scene(root);        
        mainstage.setTitle("Online Judge");
        mainstage.setScene(scene);
        mainstage.show();    
        
    }
    
    public void showContestProblemChoice() throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("ContestProblemChoice.fxml"));
        Parent root = loader.load();
        
        ContestProblemChoiceController controller=loader.getController();
        controller.setMain(this);
        
        Scene scene = new Scene(root);        
        mainstage.setTitle("Online Judge");
        mainstage.setScene(scene);
        mainstage.show();    
    }
    
    public void showProb(File fp) throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("ProblemPage.fxml"));
        Parent root = loader.load();
        
        ProblemPageController controller=loader.getController();
        controller.setMain(this);
        controller.setFile(fp);
        
        Scene scene = new Scene(root);        
        mainstage.setTitle("Online Judge");
        mainstage.setScene(scene);
        mainstage.show();    
    }
        
}
