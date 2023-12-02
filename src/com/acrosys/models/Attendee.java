/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acrosys.models;

import java.time.LocalDateTime;

/**
 *
 * @author kryle
 */
public class Attendee {
    private int id;
    private String controlno;
    private String event_code;
    private String client_name;
    private int client_age;
    private String client_gender;
    private boolean checked_in = false;
    private LocalDateTime checkIn_time = null;
    private LocalDateTime checkOut_time = null;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getControlno() {
        return controlno;
    }

    public void setControlno(String controlno) {
        this.controlno = controlno;
    }

    public String getEvent_code() {
        return event_code;
    }

    public void setEvent_code(String event_code) {
        this.event_code = event_code;
    }


    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getClient_age() {
        return client_age;
    }

    public void setClient_age(int client_age) {
        this.client_age = client_age;
    }

    public String getClient_gender() {
        return client_gender;
    }

    public void setClient_gender(String client_gender) {
        this.client_gender = client_gender;
    }

    public boolean isChecked_in() {
        return checked_in;
    }

    public void setChecked_in(boolean checked_in) {
        this.checked_in = checked_in;
    }

    public LocalDateTime getCheckIn_time() {
        return checkIn_time;
    }

    public void setCheckIn_time(LocalDateTime checkIn_time) {
        this.checkIn_time = checkIn_time;
    }

    public LocalDateTime getCheckOut_time() {
        return checkOut_time;
    }

    public void setCheckOut_time(LocalDateTime checkOut_time) {
        this.checkOut_time = checkOut_time;
    }
    
    
}
