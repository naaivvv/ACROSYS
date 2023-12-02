/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.acrosys.interfaces;

import com.acrosys.models.Attendee;
import java.util.List;

/**
 *
 * @author kryle
 */
public interface AttendeeInterface {
    public void saveAttendee(Attendee attendee);
    public void updateAttendee(Attendee attendee);
    public void deleteAttendee(String controlno);
    public List<Attendee> searchAttendee(String searchkey, String searchString);
    public List<Attendee> attendeeList();
    public Attendee getAttendee(String controlno);
    public Attendee getControlno(String client_name);
    
}
