/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.acrosys.interfaces;

import com.acrosys.models.Event;
import java.util.List;

/**
 *
 * @author ALS
 */
public interface EventInterface {
    public Event getEvent(String event_code);
    public List<Event> eventList();
}
