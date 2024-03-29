package actual412project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class NavigationUICntl {
    @FXML private Text actiontarget;
    
    @FXML protected void handleExitButtonAction(ActionEvent event) {
        //actiontarget.setText("Exit button pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        NavigationCntl.getNavigationCntl(theStage).exit();
    }
   
    @FXML protected void handlePatientButtonAction(ActionEvent event) {
        System.out.println("test");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationCntl.getNavigationCntl(theStage).getPatientCntl(theStage);
        System.out.println("getting to stage" + theStage);
    }
    @FXML protected void handleEmergencyButtonAction(ActionEvent event) {
        System.out.println("emergency btn pressed");
        Stage theStage = (Stage) actiontarget.getScene().getWindow();
        theStage.hide();
        NavigationCntl.getNavigationCntl(theStage).getEmergencyCntl(theStage);
        System.out.println("getting to stage" + theStage);
    }
}
