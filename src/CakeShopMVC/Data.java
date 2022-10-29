/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Data class - needed to store Data
 */
public class Data {

    boolean userLogin = false; // Checks if user logged in after ordering
    boolean userQuit = false; // Checks if user quit the system
    
    // Storing data needed for model and view class
    protected String username = "";
    protected String pasword = "";

    // 
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
   
    
    
    
    
}
