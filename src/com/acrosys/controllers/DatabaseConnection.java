/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.controllers;

import java.sql.*;
/**
 *
 * @author Batch 4
 */
public class DatabaseConnection {
    private static Connection conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/acrosys", "root", "");
            return conn;
        } catch (SQLException | ClassNotFoundException e){
            System.out.println(e);
        }
        return null;
    }
}
