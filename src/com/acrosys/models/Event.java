/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.models;

import java.time.LocalDateTime;

/**
 *
 * @author ALS
 */
public class Event {
    private int id;
    private String name;
    private String code;
    private String description;
    private LocalDateTime date;
    private int total_attendees;
    private int checked_in;
    private int pending;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getTotal_attendees() {
        return total_attendees;
    }

    public void setTotal_attendees(int total_attendees) {
        this.total_attendees = total_attendees;
    }

    public int getChecked_in() {
        return checked_in;
    }

    public void setChecked_in(int checked_in) {
        this.checked_in = checked_in;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }
    
}
