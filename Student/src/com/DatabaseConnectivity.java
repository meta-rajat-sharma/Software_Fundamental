package com;

import java.sql.*;
//import java.sql.Connection; 
//import java.sql.DriverManager; 
//import java.sql.SQLException; 
  
// This class can be used to initialize the database connection 
public class DatabaseConnectivity { 
    protected static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
    	System.out.println("hello from db connectivity");
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String dbName = "studentdetails"; 
        String dbUsername = "root"; 
        String dbPassword = "mainroot"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword);
        
//        System.out.println("Connection part1 completed");
        
        return con; 
    } 
}