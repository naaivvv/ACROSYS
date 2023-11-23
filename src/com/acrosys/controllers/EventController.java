/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.controllers;

import com.acrosys.interfaces.EventInterface;
import com.acrosys.models.Attendee;
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
 * @author ALS
 */
public class EventController implements EventInterface {

    @Override
    public Event getEvent(String event_code) {      
        try {                  
            Connection conn = DatabaseConnection.getConnection();
            
            String sql = "SELECT * FROM tbl_event WHERE event_code = ?";      
            PreparedStatement statement = conn.prepareStatement(sql);                   
            statement.setString(1, event_code); 
            
            ResultSet rs = statement.executeQuery();                    
            
            while (rs.next()) {              
                Event event = new Event();                        
                
                event.setName(rs.getString("name"));                      
                event.setCode(rs.getString("event_code"));                      
                event.setDescription(rs.getString("description"));                      
                event.setDate(rs.getTimestamp("date").toLocalDateTime());                      
                event.setTotal_attendees(rs.getInt("total_attendees"));                      
                event.setChecked_in(rs.getInt("checked_in"));
                int pending = rs.getInt("total_attendees") - rs.getInt("checked_in");
                event.setPending(pending);
                return event;
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of Events. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return null;
    }

    @Override
    public List<Event> eventList() {
        List<Event> list = new ArrayList<>();              
        try {                  
            Connection conn = DatabaseConnection.getConnection();                  
            String sql = "SELECT * FROM tbl_event ORDER BY name";                  
            PreparedStatement statement = conn.prepareStatement(sql);                
            ResultSet rs = statement.executeQuery();
            
            while (rs.next()) {              
                Event event = new Event();                        
                
                event.setName(rs.getString("name"));                      
                event.setCode(rs.getString("event_code"));                      
                event.setDescription(rs.getString("description"));                      
                event.setDate(rs.getTimestamp("date").toLocalDateTime());                      
                event.setTotal_attendees(rs.getInt("total_attendees"));                      
                event.setChecked_in(rs.getInt("checked_in"));
                int pending = rs.getInt("total_attendees") - rs.getInt("checked_in");
                event.setPending(pending);
                list.add(event);
            }          
        } catch (SQLException e) {              
            JOptionPane.showMessageDialog(null,"Unable to get list of Events. Please see logs.","Save Error", JOptionPane.ERROR_MESSAGE);                            
            
            System.out.println("Logs: " + e.getMessage());          
        }              
        return list;
    }
    
}
