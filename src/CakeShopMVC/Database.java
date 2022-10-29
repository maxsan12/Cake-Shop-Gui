/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - 19084694
 * Group 27 - Assignment 2
 * 
 * Database class used to build connection
 */
public class Database {
    
    Connection conn = null; 
    String url = "jdbc:derby:CakeShopDB;create=true";
    String username = "pdc";
    String password = "pdc";
    
    
    // Method to set up the database
    public void dbSetUp() {
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
            String tableName = "Customer_Info";
            
            if (!checkTable(tableName)) {
                statement.executeUpdate("CREATE TABLE " + tableName + "(USERNAME VARCHAR(30), PASSWORD VARCHAR(30))");
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    private boolean checkTable(String newTableName) {
        boolean b = false;
        
        try {
            System.out.println("Checking table...");
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet rsdbmeta = dbmd.getTables(null, null, null, null);
            
            while (rsdbmeta.next()) {
                String tableName = rsdbmeta.getString("TABLE_NAME");
                if (tableName.compareToIgnoreCase(newTableName) == 0) {
                    System.out.println(tableName + " is in our system");
                    b = true;
                }
            }
            if (rsdbmeta != null) {
                rsdbmeta.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    // Creating a method to check username for login page
    public Data checkCustomerDetails(String user, String pw) {
        Data data = new Data(); // Instantiate data class
        
        try{ 
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery("SELECT username, password FROM Customer_Info WHERE username = " + user);
            
            if (result.next()) {
                String userPW = result.getString("password");
                System.out.println(userPW);
                System.out.println("Customer is in system");
                
                if (pw.compareTo(userPW) == 0) {
                    data.userLogin = true;
                }
                data.userQuit = false;
            }
            else {
                System.out.println("User is not in system, creating new user");
                statement.executeUpdate("INSERT INTO Customer_Info " + "VALUES(" +
                        user + ", " + pw + ")");
                data.userLogin = true;
                
                data.username = user;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data; 
    }
    
    public void saveUserInfo(String user, int price) {
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE Customer_Info price:" + price + "WHERE username:" + user);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
