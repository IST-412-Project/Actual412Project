/*
Patient Cntl
 */
package actual412project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.ObservableList;


public class PatientCntl {
    
    @FXML private Stage stage;
    private static PatientCntl thePatientCntl;
    private ObservableList<Patient> theListOfPatients;
    
    private PatientCntl(Stage theExistingStage){
        theListOfPatients = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getPatientList().getPatientData();
        stage = theExistingStage;
        this.setUpUserListScene();
        stage.show();
    }
    
    public static PatientCntl getPatientCntl(Stage theStage){
        if(thePatientCntl != null){
            return thePatientCntl;
        }else{
            thePatientCntl = new PatientCntl(theStage);
            return thePatientCntl;
        }
    }
    
    @FXML public void setUpPatientListScene(){
        Parent root;
        Scene scene;
        try{
            root = FXMLLoader.load(getClass().getResource("PatientUI.fxml"));
            scene = new Scene(root);
            stage.setTitle("Patient Records");
            stage.setScene(scene);
            stage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void addUserRow(Patient newPatient){
        PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getuserList().getUserData().add(newPatient);
        PersistentDataCntl.getPersistentDataCntl().writeSerializedDataModel();
    }
    
    public ObservableList<Patient> getListOfPatients(){
        return theListOfPatients;
    }
    
    public Stage getStage(){
        return stage;
    }
    
}
