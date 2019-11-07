
package actual412project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author brittanychapin
 */
public class PatientList implements Serializable{
     
    private ArrayList<Patient> theListOfPatientsAll;
        
    public PatientList(){
        theListOfPatientsAll = getTestPatients();
        System.out.println("patient list: " + theListOfPatientsAll);
    }
    
    public ObservableList<Patient> getPatientData() {
        ObservableList<Patient> theListOfPatients;
        List<Patient> patientList = (List<Patient>) theListOfPatientsAll;
        theListOfPatients = FXCollections.observableList(patientList);
        return theListOfPatients;
    }
    
    public ArrayList<Patient> getTestPatients(){
        System.out.println("test patient method called");      
        ArrayList<Patient> testPatients = new ArrayList();
        for (int i = 0; i < 5; i++) {
            Patient newPatient = new Patient("First Name" + i, "Last Name" + i, "Record" + i);
            testPatients.add(newPatient);
//            System.out.println(testPatients[1].getFirstName);
        }
        return testPatients;
    }
}
