/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import java.util.Observable;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - 19084694
 * Group 27 - Assignment 2
 * 
 * Model class to hold all data and database components.
 */
public class Model extends Observable { 
    
    public Database db;
    public Data data;
    public String userName;
    public String password;
    
    public Model() {
        this.db = new Database();
        this.db.dbsetup();
    }
    
    
}
