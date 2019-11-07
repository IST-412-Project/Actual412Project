package actual412project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class PatientUICntl implements Initializable{
    
    @FXML private Label actiontarget;
    
    @FXML private TableView<Patient> patientTable = new TableView<Patient>();
    @FXML private TableColumn<Patient, String> first = new TableColumn<Patient, String>("First Name");
    @FXML private TableColumn<Patient, String> last = new TableColumn<Patient, String>("Last Name");
    @FXML private TableColumn<Patient, String> record = new TableColumn<Patient, String>("Patient Record");
    @FXML
    private ObservableList<Patient> listOfPatients;
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listOfPatients = PersistentDataCntl.getPersistentDataCntl().getPeristentDataCollection().getPatientList().getPatientData();
        System.out.println("list of patients:" + listOfPatients);
        
        first.setCellValueFactory(new PropertyValueFactory<Patient, String>("first"));
        last.setCellValueFactory(new PropertyValueFactory<Patient, String>("last"));
        record.setCellValueFactory(new PropertyValueFactory<Patient, String>("record"));
        
        SimpleStringProperty s = new SimpleStringProperty("Test");
        TextField t = new TextField("Test");
        if(s.get().equals(t.getText())){
            System.out.println("Success");
        }
        
        patientTable.setItems(listOfPatients);
        int i;
        for(i = 0; i < listOfPatients.size();i++){
           System.out.println("user name: "+ listOfPatients.get(i).getFirstName()); 
        }
        
    }
    
    
}

