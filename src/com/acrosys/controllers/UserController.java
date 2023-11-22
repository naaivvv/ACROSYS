/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.controllers;

import com.acrosys.interfaces.UserInterface;
import com.acrosys.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author kryle
 */
public class UserController implements UserInterface {

    @Override
    public boolean Login(User user) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            String sql = "SELECT * FROM tbl_user WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getUname());
            statement.setString(2, user.getPwd());
            
            ResultSet result = statement.executeQuery();
            if (result.next()){
                user.setUname(result.getString("username"));
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to find user. Please see logs.", "Login Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + ex.getMessage());
        }
        
        return false;
    }

    @Override
    public void saveUser(User user) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            
            String sql = "INSERT INTO tbl_user (username, password)" + "VALUES(?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getUname());
            statement.setString(2, user.getPwd());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "New user record was successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to save user record. Please see logs.", "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + ex.getMessage());
        }
    }
    
}
