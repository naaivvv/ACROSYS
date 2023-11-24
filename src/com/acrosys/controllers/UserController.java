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
import java.util.ArrayList;
import java.util.List;
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
                user.setPermission(result.getString("permission"));
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
            
            String sql = "INSERT INTO tbl_user (username, password, permission)" + "VALUES(?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getUname());
            statement.setString(2, user.getPwd());
            statement.setString(3, user.getPermission());
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "New user record was successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to save user record. Please see logs.", "Save Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Logs: " + ex.getMessage());
        }
    }

    @Override
    public void updateUser(User user, int id) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "UPDATE tbl_user SET username = ?, password = ? WHERE id = ?";
                      PreparedStatement statement = conn.prepareStatement(sql);
                  
                      statement.setString(1, user.getUname());
                      statement.setString(2, user.getPwd());
                      statement.setInt(3, id);
                      
                      statement.executeUpdate();
                      JOptionPane.showMessageDialog(null, "User data was successfully updated.", "Update", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to update user data. Please see logs", "Update  Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Logs: " + e.getMessage());
        }
    }

    @Override
    public void deleteUser(String un) {
        try {              
            Connection conn = DatabaseConnection.getConnection();                
            String sql = "DELETE FROM tbl_user WHERE username = ?";              
            PreparedStatement statement = conn.prepareStatement(sql);             
            statement.setString(1, un);                            
            
            statement.executeUpdate();              
            JOptionPane.showMessageDialog(null,"User data was successfully deleted.","Delete", JOptionPane.INFORMATION_MESSAGE);          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to delete user data. Please see logs.","Delete Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }
    }

    @Override
    public User getUser(String un) {             
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_user WHERE username = ?";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, un);                   
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                User user = new User();                        
                
                user.setId(rs.getInt("id"));                      
                user.setUname(rs.getString("username"));                      
                user.setPermission(rs.getString("permission"));                      
                user.setPwd(rs.getString("password"));                    
                
                return user;
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of User. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return null;
    }

    @Override
    public int getId(String un) {
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_user WHERE username = ?";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, un);                   
            ResultSet rs = statement.executeQuery();                    
            
            if (rs.next()) {                      
                int id = rs.getInt("id");
                
                return id;
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of User. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return -1;
    }
}
    
