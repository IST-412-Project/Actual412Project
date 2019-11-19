package actual412project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author brittanychapin
 */
public class EmergencyCntl {
    
    @FXML
    private static EmergencyCntl theEmergencyCntl;
    private Stage stage;
    
    private EmergencyCntl(Stage theExistingStage) {
        System.out.println("Getting emergnecy stage");
        stage = theExistingStage;
        this.setUpEmergencyScene();
        stage.show();
        System.out.println(stage);
    }
    
    public static EmergencyCntl getEmergencyCntl(Stage theStage) {
        
        if (theEmergencyCntl != null) {
            System.out.println("emregcny thing working in functon");
            return theEmergencyCntl;
        } else {
            System.out.println("else emergency not working");
            theEmergencyCntl = new EmergencyCntl(theStage);
            return theEmergencyCntl;
        }
    }
    
    @FXML
    public void setUpEmergencyScene() {
        Parent root;
        Scene scene;
        try {
        
            root = FXMLLoader.load(getClass().getResource("EmergencyUI.fxml"));
            System.out.println("got e root");
            scene = new Scene(root);
            stage.setTitle("Emergency Notification");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
