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
    
    
    
    public void dbSetUp() {
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            Statement statement = conn.createStatement();
            String tableName = "Customer Info";
            
            if (!checkTable(tableName)) {
                statement.executeUpdate("CREATE TABLE ");
            }
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
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
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
