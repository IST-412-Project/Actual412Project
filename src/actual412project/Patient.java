/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actual412project;

import java.io.*;

public class Patient implements Serializable{
    
    private String firstName = new String();
    private String lastName  = new String();
    private String username  = new String();
    private String password  = new String();
    
    public Patient(String newFirstName, String newLastName, String newUsername, String newPassword){
        firstName = newFirstName;
        lastName = newLastName;
        username = newUsername;
        password = newPassword;
    }
    
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
        
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setusername(String newUsername) {
        username = newUsername;
    }

}
