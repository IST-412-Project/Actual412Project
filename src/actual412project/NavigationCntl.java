/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actual412project;

import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;


public class NavigationCntl {

    @FXML
    private Stage stage;
    @FXML
    private Text actiontarget;
    private static NavigationCntl theNavigationCntl;

    private NavigationCntl(Stage theExistingStage) {
        stage = theExistingStage;
        this.setUpNavigationScene();
        stage.show();
    }

    public static NavigationCntl getNavigationCntl(Stage theStage) {
        if (theNavigationCntl != null) {
            System.out.println("nav cntl" + theNavigationCntl);
            return theNavigationCntl;
        } else {
            theNavigationCntl = new NavigationCntl(theStage);
            System.out.println("nav stage works");
            return theNavigationCntl;
        }
    }

    @FXML
    public void setUpNavigationScene() {
        Parent root;
        Scene scene;
        try {
            root = FXMLLoader.load(getClass().getResource("NavigationUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Navigation");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
    
    public void getPatientCntl(Stage theStage) {
        System.out.println("patient cntl");
        PatientCntl.getPatientCntl(theStage);
    }
    
    public void getEmergencyCntl(Stage theStage) {
        System.out.println("emergency cntl");
        EmergencyCntl.getEmergencyCntl(theStage);
    }

    public void exit() {
        System.exit(0);
    }

}
