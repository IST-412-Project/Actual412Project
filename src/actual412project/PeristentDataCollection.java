/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actual412project;

import java.io.*;


public class PeristentDataCollection implements Serializable{
    
    private PatientList thePatientList;
    //private ReminderList theReminderList;
    // All other persistent data will go below here
    
    public PeristentDataCollection(){
        if(thePatientList == null){
            thePatientList = new PatientList();
        }
    }
    
    public PatientList getPatientList(){
        System.out.println("patient list method called" + thePatientList);
        return thePatientList;
    }

    
}
