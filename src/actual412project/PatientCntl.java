/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actual412project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.ObservableList;

public class PatientCntl {

    @FXML
    private Stage stage;
    private static PatientCntl thePatientCntl;
    private ObservableList<Patient> patientList;

    private PatientCntl(Stage theExistingStage) {
        patientList = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getPatientList().getPatientData();
        System.out.println("patient list:" + patientList);
        stage = theExistingStage;
        this.setUpPatientScene();
        stage.show();
        System.out.println(stage);
    }

    public static PatientCntl getPatientCntl(Stage theStage) {
        
        if (thePatientCntl != null) {
            System.out.println("if patient");
            return thePatientCntl;
        } else {
            System.out.println("else patient");
            thePatientCntl = new PatientCntl(theStage);
            System.out.println("after patient cntl called");
            return thePatientCntl;
        }
    }

    @FXML
    public void setUpPatientScene() {
        Parent root;
        Scene scene;
        try {
            root = FXMLLoader.load(getClass().getResource("PatientUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Patients");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ObservableList<Patient> getListOfPatients() {
        return patientList;
    }
    
    public void exit(){
        System.exit(0);
    }

    
}
