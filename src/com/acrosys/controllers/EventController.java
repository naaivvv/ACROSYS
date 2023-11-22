/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.controllers;

import com.acrosys.interfaces.EventInterface;
import com.acrosys.models.Event;
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
public class EventController implements EventInterface{

    @Override
    public void saveEvent(Event event) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "INSERT INTO tbl_event(event_name, client_name, client_age, client_gender, control_number)" + "VALUES(?, ?, ?, ?, ?)";
                      PreparedStatement statement = conn.prepareStatement(sql);
                      statement.setString(1, event.getEventname());
                      statement.setString(2, event.getClient_name());
                      statement.setInt(3, event.getClient_age());
                      statement.setString(4, event.getClient_gender());
                      statement.setString(5, event.getControlno());
                      
                      statement.executeUpdate();
                      JOptionPane.showMessageDialog(null, "New event record was successfully saved.", "Save", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to save event record. Please see logs", "Save Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Logs: " + e.getMessage());
        }
    }

    @Override
    public void updateEvent(Event event) {
        try{
        Connection conn = DatabaseConnection.getConnection();
        
        String sql = "UPDATE tbl_event SET event_name = ?, event_name = ?, client_name = ?, client_age = ?, client_gender = ? WHERE control_number = ?";
                      PreparedStatement statement = conn.prepareStatement(sql);
                  
                      statement.setString(1, event.getEventname());
                      statement.setString(2, event.getClient_name());
                      statement.setInt(3, event.getClient_age());
                      statement.setString(4, event.getClient_gender());
                      statement.setString(5, event.getControlno());
                      
                      statement.executeUpdate();
                      JOptionPane.showMessageDialog(null, "Event record was successfully updated.", "Update", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Unable to update event record. Please see logs", "Update  Error", JOptionPane.ERROR_MESSAGE);
            
            System.out.println("Logs: " + e.getMessage());
        }
    }


    @Override
    public void deleteEvent(String controlno) {
        try {              
            Connection conn = DatabaseConnection.getConnection();                
            String sql = "DELETE FROM tbl_event WHERE control_number = ?";              
            PreparedStatement statement = conn.prepareStatement(sql);             
            statement.setString(1, controlno);                            
            
            statement.executeUpdate();              
            JOptionPane.showMessageDialog(null,"Event record was successfully deleted.","Delete", JOptionPane.INFORMATION_MESSAGE);          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to delete event record. Please see logs.","Delete Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }
    }

    @Override
    public List<Event> searchEvent(String searchkey, String searchString) {
        List<Event> list = new ArrayList<>();              
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_event WHERE event_name LIKE ? ORDER BY event_name";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, "%" + searchString + "%");                  
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Event event = new Event();                        
                
                event.setId(rs.getInt("id"));                      
                event.setControlno(rs.getString("control_number"));                      
                event.setEventname(rs.getString("event_name"));                      
                event.setClient_name(rs.getString("client_name"));                      
                event.setClient_age(rs.getInt("client_age"));                      
                event.setClient_gender(rs.getString("Gender"));
                list.add(event);                  
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of Events. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return list;
    }

    @Override
    public List<Event> eventList() {
        List<Event> list = new ArrayList<>();              
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_event ORDER BY event_name";                  
            PreparedStatement statement = conn.prepareStatement(sql);                
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Event event = new Event();                        
                
                event.setId(rs.getInt("id"));                      
                event.setControlno(rs.getString("control_number"));                      
                event.setEventname(rs.getString("event_name"));                      
                event.setClient_name(rs.getString("client_name"));                      
                event.setClient_age(rs.getInt("client_age"));                      
                event.setClient_gender(rs.getString("Gender"));
                list.add(event);                  
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of Events. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return list;
    }

    @Override
    public Event getEvent(String controlno) {
        List<Event> list = new ArrayList<>();              
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_event WHERE control_number = ?";                  
            PreparedStatement statement = conn.prepareStatement(sql);                  
            statement.setString(1, controlno);                 
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {                      
                Event event = new Event();                        
                
                event.setId(rs.getInt("id"));                      
                event.setControlno(rs.getString("control_number"));                      
                event.setEventname(rs.getString("event_name"));                      
                event.setClient_name(rs.getString("client_name"));                      
                event.setClient_age(rs.getInt("client_age"));                      
                event.setClient_gender(rs.getString("Gender"));
                list.add(event); 
                return event;
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of Events. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return null;
    }
    
}
