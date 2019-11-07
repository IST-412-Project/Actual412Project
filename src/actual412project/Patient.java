/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actual412project;

import java.io.*;

public class Patient implements Serializable{
    
    private String first = new String();
    private String last  = new String();
    private String record = new String();

    
    public Patient(String newFirstName, String newLastName, String newRecord){
        first = newFirstName;
        last = newLastName;
        record = newRecord;
    }
    
    
    public String getFirstName() {
        return first;
    }
    
    public void setFirstName(String newFirstName) {
        first = newFirstName;
    }
        
    public String getLastName() {
        return last;
    }
    
    public void setLastName(String newLastName) {
        last = newLastName;
    }

    public String getRecord() {
        return record;
    }
    
    public void setRecord(String newRecord){
        record = newRecord;
    }

}
