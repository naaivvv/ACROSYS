/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.controllers;

import com.acrosys.models.Attendee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.acrosys.interfaces.AttendeeInterface;

/**
 *
 * @author kryle
 */
public class AttendeeController implements AttendeeInterface{

    @Override
    public void saveAttendee(Attendee attendee) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "INSERT INTO tbl_attendees(event_code, client_name, client_age, client_gender, control_number)" + "VALUES(?, ?, ?, ?, ?)";
                      PreparedStatement statement = conn.prepareStatement(sql);
                      statement.setString(1, attendee.getEvent_code());
                      statement.setString(2, attendee.getClient_name());
                      statement.setInt(3, attendee.getClient_age());
                      statement.setString(4, attendee.getClient_gender());
                      statement.setString(5, attendee.getControlno());
                      
                      statement.executeUpdate();
                      JOptionPane.showMessageDialog(null, "New attendee record was successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to save attendee record. Please see logs", "Save Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Logs: " + e.getMessage());
        }
    }

    @Override
    public void updateAttendee(Attendee attendee) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "UPDATE tbl_attendees SET event_code = ?, client_name = ?, client_age = ?, client_gender = ? WHERE control_number = ?";
                      PreparedStatement statement = conn.prepareStatement(sql);
                  
                      statement.setString(1, attendee.getEvent_code());
                      statement.setString(2, attendee.getClient_name());
                      statement.setInt(3, attendee.getClient_age());
                      statement.setString(4, attendee.getClient_gender());
                      statement.setString(5, attendee.getControlno());
                      
                      statement.executeUpdate();
                      JOptionPane.showMessageDialog(null, "Attendee record was successfully updated.", "Update", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to update attendee record. Please see logs", "Update  Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Logs: " + e.getMessage());
        }
    }


    @Override
    public void deleteAttendee(String controlno) {
        try {              
            Connection conn = DatabaseConnection.getConnection();                
            String sql = "DELETE FROM tbl_attendees WHERE control_number = ?";              
            PreparedStatement statement = conn.prepareStatement(sql);             
            statement.setString(1, controlno);                            
            
            statement.executeUpdate();              
            JOptionPane.showMessageDialog(null,"Attendee record was successfully deleted.","Delete", JOptionPane.INFORMATION_MESSAGE);          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to delete event record. Please see logs.","Delete Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }
    }

    @Override
    public List<Attendee> searchAttendee(String searchkey, String searchString) {
        List<Attendee> list = new ArrayList<>();              
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_attendees WHERE event_code LIKE ? ORDER BY event_name";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, "%" + searchString + "%");                  
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Attendee attendee = new Attendee();                        
                
                attendee.setId(rs.getInt("id"));                      
                attendee.setControlno(rs.getString("control_number"));                      
                attendee.setEvent_code(rs.getString("event_code"));                      
                attendee.setClient_name(rs.getString("client_name"));                      
                attendee.setClient_age(rs.getInt("client_age"));                      
                attendee.setClient_gender(rs.getString("client_gender"));
                list.add(attendee);                  
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of attendees. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return list;
    }

    @Override
    public List<Attendee> attendeeList() {
        List<Attendee> list = new ArrayList<>();              
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_attendees ORDER BY client_name";                  
            PreparedStatement statement = conn.prepareStatement(sql);                
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Attendee attendee = new Attendee();                        
                
                attendee.setId(rs.getInt("id"));                      
                attendee.setControlno(rs.getString("control_number"));                      
                attendee.setEvent_code(rs.getString("event_code"));                      
                attendee.setClient_name(rs.getString("client_name"));                      
                attendee.setClient_age(rs.getInt("client_age"));                      
                attendee.setClient_gender(rs.getString("client_gender"));
                list.add(attendee);                  
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of attendees. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return list;
    }

    @Override
    public Attendee getAttendee(String controlno) {      
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_attendees WHERE control_number = ?";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, controlno);                 
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Attendee attendee = new Attendee();                        
                
                attendee.setId(rs.getInt("id"));                      
                attendee.setControlno(rs.getString("control_number"));                      
                attendee.setEvent_code(rs.getString("event_code"));                      
                attendee.setClient_name(rs.getString("client_name"));                      
                attendee.setClient_age(rs.getInt("client_age"));                      
                attendee.setClient_gender(rs.getString("client_gender"));
                return attendee;
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of attendees. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return null;
    }

    @Override
    public Attendee getControlno(String client_name) {
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_attendees WHERE client_name = ?";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, client_name);                 
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Attendee attendee = new Attendee();                                             
                attendee.setControlno(rs.getString("control_number"));                      
                return attendee;
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get control number. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return null;
    }
    
}
